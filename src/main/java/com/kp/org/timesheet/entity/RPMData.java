package com.kp.org.timesheet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rpm_master")
public class RPMData {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rpm_id")
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

	@OneToMany
	 @JoinTable(
	            name = "rpm_esa_mapping",
	            joinColumns = @JoinColumn(name = "rpm_id"),
	            inverseJoinColumns = @JoinColumn(name = "esa_id")
	    )	
	private List<ESAData> esaData; 

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
	public List<ESAData> getEsaData() {
		return esaData;
	}
	public void setEsaData(List<ESAData> esaData) {
		this.esaData = esaData;
	}
	
}
