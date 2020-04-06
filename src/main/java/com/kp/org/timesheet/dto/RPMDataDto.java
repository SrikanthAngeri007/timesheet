package com.kp.org.timesheet.dto;

import java.util.Date;

import com.kp.org.timesheet.entity.RPMData;

public class RPMDataDto implements Provision<RPMData>{
	private Long Id;
	private String nuid;
	private String resourceName;
	private String resourceStatus;
	private String empType;
	private String vendor;
	private Date periodStartDate;
	private Date periodEndDate;
	private String timesheetStatus;
	private String inputTypeCode;
	private Double actualHours;
	private Date creationDate;
	private Date updationDate;

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNuid() {
		return nuid;
	}
	public void setNuid(String nuid) {
		this.nuid = nuid;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Date getPeriodStartDate() {
		return periodStartDate;
	}
	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}
	public Date getPeriodEndDate() {
		return periodEndDate;
	}
	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}
	public String getTimesheetStatus() {
		return timesheetStatus;
	}
	public void setTimesheetStatus(String timesheetStatus) {
		this.timesheetStatus = timesheetStatus;
	}
	public String getInputTypeCode() {
		return inputTypeCode;
	}
	public void setInputTypeCode(String inputTypeCode) {
		this.inputTypeCode = inputTypeCode;
	}
	public Double getActualHours() {
		return actualHours;
	}
	public void setActualHours(Double actualHours) {
		this.actualHours = actualHours;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceStatus() {
		return resourceStatus;
	}
	public void setResourceStatus(String resourceStatus) {
		this.resourceStatus = resourceStatus;
	}

	@Override
	public RPMData createEntity() {
		RPMData entity = new RPMData();
		entity.setCreationDate(new Date());
		return updateEntity(entity);
	}

	@Override
	public RPMData updateEntity(RPMData entity) {
		entity.setNuid(nuid);
		entity.setResourceName(resourceName);
		entity.setResourceStatus(resourceStatus);
		entity.setEmpType(empType);
		entity.setVendor(vendor);
		entity.setPeriodStartDate(periodStartDate);
		entity.setPeriodEndDate(periodEndDate);
		entity.setTimesheetStatus(timesheetStatus);
		entity.setInputTypeCode(inputTypeCode);
		entity.setActualHours(actualHours);
		entity.setUpdationDate(new Date());
		return entity;
	}
	
}
