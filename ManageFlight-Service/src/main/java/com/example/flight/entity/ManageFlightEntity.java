package com.example.flight.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "manage_flight")
public class ManageFlightEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String airlineName;
	private String fromPlace;
	private String toPlace;
	private LocalTime startDateTime;
	private LocalTime endDateTime;

	private String scheduleDays;
	
	private String instrumentUsed;
	private int totalNoOfSeats;
	private int totalNoOfBussinessSeats;
	private double price;
	private int NoOfRows;

	private String meals;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
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
		return NoOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		NoOfRows = noOfRows;
	}

	public String getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}



}
