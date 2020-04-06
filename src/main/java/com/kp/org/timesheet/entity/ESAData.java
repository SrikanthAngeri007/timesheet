package com.kp.org.timesheet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="esa_master")
public class ESAData {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="esa_id")
	private Long id;
	private Double employeeId;
	private String name;
	private Date periodStartDate;
	private Date periodEndDate;
	private Double timeReportId;
	private Double version;
	private String timeSheetStatus;
	private Date submissionDate;
	private Integer project;
	private Double activity;
	private String acivityName;
	private String billingLocation;
	private String onOff;
	private String billingAction;
	private Date date;
	private Double timeQuantity;
	private Date creationDate;
	private Date updationDate;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Double employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Double getTimeReportId() {
		return timeReportId;
	}
	public void setTimeReportId(Double timeReportId) {
		this.timeReportId = timeReportId;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	public String getTimeSheetStatus() {
		return timeSheetStatus;
	}
	public void setTimeSheetStatus(String timeSheetStatus) {
		this.timeSheetStatus = timeSheetStatus;
	}
	public Date getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}
	public Integer getProject() {
		return project;
	}
	public void setProject(Integer project) {
		this.project = project;
	}
	public Double getActivity() {
		return activity;
	}
	public void setActivity(Double activity) {
		this.activity = activity;
	}
	public String getAcivityName() {
		return acivityName;
	}
	public void setAcivityName(String acivityName) {
		this.acivityName = acivityName;
	}
	public String getBillingLocation() {
		return billingLocation;
	}
	public void setBillingLocation(String billingLocation) {
		this.billingLocation = billingLocation;
	}
	public String getOnOff() {
		return onOff;
	}
	public void setOnOff(String onOff) {
		this.onOff = onOff;
	}
	public String getBillingAction() {
		return billingAction;
	}
	public void setBillingAction(String billingAction) {
		this.billingAction = billingAction;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getTimeQuantity() {
		return timeQuantity;
	}
	public void setTimeQuantity(Double timeQuantity) {
		this.timeQuantity = timeQuantity;
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
	
}
