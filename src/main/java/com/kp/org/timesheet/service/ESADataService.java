package com.kp.org.timesheet.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kp.org.timesheet.dto.ESADataDto;
import com.kp.org.timesheet.entity.ESAData;
import com.kp.org.timesheet.repository.ESARepository;
import com.kp.org.timesheet.utils.Utilities;

@Service
public class ESADataService {

	@Autowired
	ESARepository esaRepository;
	
	public void  processESAData(MultipartFile file){
		try {
			List<ESADataDto> dtos = readExcelData(file);
			for (ESADataDto esaDataDto : dtos) {
				saveESAData(esaDataDto);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void saveESAData(ESADataDto esaDataDto){
		ESAData entity = esaDataDto.createEntity();
		esaRepository.save(entity);
	}
	
	private List<ESADataDto> readExcelData(MultipartFile file) throws IOException{
		InputStream inputStream = file.getInputStream();
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = sheet.iterator();
		boolean found=false;
		List<ESADataDto> esaDataDtos = new ArrayList<ESADataDto>();
		// skip the First Row
		iterator.next();
		while(iterator.hasNext() && !found){
			ESADataDto dto = new ESADataDto();
			Row currentRow = iterator.next();
			Iterator cellIterator = currentRow.cellIterator();
			int i=1;
			while (cellIterator.hasNext()) {
				Cell cell = (Cell)cellIterator.next();
				if(i==1){
					dto.setEmployeeId(cell.getNumericCellValue());
				}
				if(i==2){
					dto.setName(cell.getStringCellValue());
				}
				if(i==3){
					dto.setPeriodEndDate(Utilities.stringToDate(cell.getStringCellValue()));
				}
				if(i==4){
					dto.setTimeReportId(cell.getNumericCellValue());
				}
				if(i==5){
					dto.setVersion(cell.getNumericCellValue());
				}
				if(i==6){
					dto.setTimeSheetStatus(cell.getStringCellValue());
				}
				if(i==7){
					dto.setSubmissionDate(Utilities.stringToDate(cell.getStringCellValue()));
				}
				if(i==8){
					dto.setProject((int)cell.getNumericCellValue());
				}
				if(i==9){
					dto.setActivity(cell.getNumericCellValue());
				}
				if(i==10){
					dto.setAcivityName(cell.getStringCellValue());
				}
				if(i==11){
					dto.setBillingLocation(cell.getStringCellValue());
				}
				if(i==12){
					dto.setOnOff(cell.getStringCellValue());
				}
				if(i==13){
					dto.setBillingAction(cell.getStringCellValue());
				}
				if(i==14){
					dto.setDate(Utilities.stringToDate(cell.getStringCellValue()));
				}
				if(i==15){
					dto.setTimeQuantity(cell.getNumericCellValue());
				}
				i++;
			}
			esaDataDtos.add(dto);
		}
		inputStream.close();
		return esaDataDtos;
	}
}
