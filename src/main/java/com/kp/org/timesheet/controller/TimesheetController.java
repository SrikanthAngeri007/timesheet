package com.kp.org.timesheet.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kp.org.timesheet.service.ESADataService;
import com.kp.org.timesheet.service.RPMDataService;

@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
	
	@Autowired
	ESADataService esaDataService;
	
	@Autowired
	RPMDataService rpmDataService;
	
	@RequestMapping(method = RequestMethod.POST, value="upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, headers = ("content-type=multipart/*"))
	 public ResponseEntity<Void> createStudent(@RequestParam("file") MultipartFile multipartFile, @RequestParam("type") String type) {
		if(type.equalsIgnoreCase("esa")){
			esaDataService.processESAData(multipartFile);
		}
		 return new ResponseEntity<>(new HttpHeaders(), HttpStatus.CREATED);
	 }
	
	@RequestMapping(method = RequestMethod.GET, produces="text/html")
	public String getIndexContent() throws IOException{
		Resource resource = new ClassPathResource("form.txt",TimesheetController.class.getClassLoader());
		
        InputStream inputStream = resource.getInputStream();
        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            String data = new String(bdata, StandardCharsets.UTF_8);
            return data;
        } catch (IOException e) {
        }
        
		return "<html><body><h2>Please try after some time!</h2></body></html>";
	}
}
