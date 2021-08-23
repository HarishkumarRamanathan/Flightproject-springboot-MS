package com.example.flight.model;

import java.time.LocalTime;
import java.util.List;


public class FlightModel {

	private int id;
	private String airlineName;
	private String fromPlace;
	private String toPlace;
	private LocalTime startDateTime;
	private LocalTime endDateTime;

//	private List<ScheduleDays> scheduledDays;
	private List<String> scheduledDays;

	/*
	 * public List<ScheduleDays> getScheduledDays() { return scheduledDays; }
	 * 
	 * public void setScheduledDays(List<ScheduleDays> scheduledDays) {
	 * this.scheduledDays = scheduledDays; }
	 */
	private String instrumentUsed;
	private int totalNoOfSeats;
	private int totalNoOfBussinessSeats;
	private double price;
	private int noOfRows;
	private List<String> meal;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public LocalTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getInstrumentUsed() {
		return instrumentUsed;
	}

	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}

	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public int getTotalNoOfBussinessSeats() {
		return totalNoOfBussinessSeats;
	}

	public void setTotalNoOfBussinessSeats(int totalNoOfBussinessSeats) {
		this.totalNoOfBussinessSeats = totalNoOfBussinessSeats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public int getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}

	public List<String> getScheduledDays() {
		return scheduledDays;
	}

	public void setScheduledDays(List<String> scheduledDays) {
		this.scheduledDays = scheduledDays;
	}

	public List<String> getMeal() {
		return meal;
	}

	public void setMeal(List<String> meal) {
		this.meal = meal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FlightModel(int id,String airlineName, String fromPlace, String toPlace, LocalTime startDateTime,
			LocalTime endDateTime, List<String> scheduledDays, String instrumentUsed, int totalNoOfSeats,
			int totalNoOfBussinessSeats, double price, int noOfRows, List<String> meal, String status) {
		this.id=id;
		this.airlineName = airlineName;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.scheduledDays = scheduledDays;
		this.instrumentUsed = instrumentUsed;
		this.totalNoOfSeats = totalNoOfSeats;
		this.totalNoOfBussinessSeats = totalNoOfBussinessSeats;
		this.price = price;
		this.noOfRows = noOfRows;
		this.meal = meal;
		this.status=status;
	}

	@Override
	public String toString() {
		return "FlightModel [airlineName=" + airlineName + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace
				+ ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + ", scheduledDays="
				+ scheduledDays + ", instrumentUsed=" + instrumentUsed + ", totalNoOfSeats=" + totalNoOfSeats
				+ ", totalNoOfBussinessSeats=" + totalNoOfBussinessSeats + ", price=" + price + ", NoOfRows=" + noOfRows
				+ ", meals=" + meal + "]";
	}



}
