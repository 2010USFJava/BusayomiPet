package com.revature.model;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.LocalTime;

public class Form {
	private int id;
	private LocalDate date;
	private LocalTime currentTime; 
	private LocalDate esdate;
	private String location;
	private String description;
	private double cost;
	private String gradingFormat;
	private int eventTypeId;
	private String workRelatedJustification;
	private BufferedImage eventAttachment;
	private String timeMissed;
	private double estimatedReimbursement;
	private boolean status;
	private int employeeId;
	
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Form(int id, LocalDate date, LocalTime currentTime, LocalDate esdate, String location, String description,
			double cost, String gradingFormat, int eventTypeId, String workRelatedJustification,
			BufferedImage eventAttachment, String timeMissed, double estimatedReimbursement, boolean status,
			int employeeId) {
		super();
		this.id = id;
		this.date = date;
		this.currentTime = currentTime;
		this.esdate = esdate;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.gradingFormat = gradingFormat;
		this.eventTypeId = eventTypeId;
		this.workRelatedJustification = workRelatedJustification;
		this.eventAttachment = eventAttachment;
		this.timeMissed = timeMissed;
		this.estimatedReimbursement = estimatedReimbursement;
		this.status = status;
		this.employeeId = employeeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(LocalTime currentTime) {
		this.currentTime = currentTime;
	}

	public LocalDate getEsdate() {
		return esdate;
	}

	public void setEsdate(LocalDate esdate) {
		this.esdate = esdate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}

	public int getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(int eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getWorkRelatedJustification() {
		return workRelatedJustification;
	}

	public void setWorkRelatedJustification(String workRelatedJustification) {
		this.workRelatedJustification = workRelatedJustification;
	}

	public BufferedImage getEventAttachment() {
		return eventAttachment;
	}

	public void setEventAttachment(BufferedImage eventAttachment) {
		this.eventAttachment = eventAttachment;
	}

	public String getTimeMissed() {
		return timeMissed;
	}

	public void setTimeMissed(String timeMissed) {
		this.timeMissed = timeMissed;
	}

	public double getEstimatedReimbursement() {
		return estimatedReimbursement;
	}

	public void setEstimatedReimbursement(double estimatedReimbursement) {
		this.estimatedReimbursement = estimatedReimbursement;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Form [id=" + id + ", date=" + date + ", currentTime=" + currentTime + ", esdate=" + esdate
				+ ", location=" + location + ", description=" + description + ", cost=" + cost + ", gradingFormat="
				+ gradingFormat + ", eventTypeId=" + eventTypeId + ", workRelatedJustification="
				+ workRelatedJustification + ", eventAttachment=" + eventAttachment + ", timeMissed=" + timeMissed
				+ ", estimatedReimbursement=" + estimatedReimbursement + ", status=" + status + ", employeeId="
				+ employeeId + "]";
	}
}
