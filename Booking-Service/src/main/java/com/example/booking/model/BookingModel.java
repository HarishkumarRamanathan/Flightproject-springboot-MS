package com.example.booking.model;

import java.time.LocalDate;
import java.util.List;

public class BookingModel {

	private int id;
	private int flightId;
	private String email;
	private String flightName;
	private LocalDate dateOfJourney;
	private double price;
	private List<PassangerModel> passengerDetails;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<PassangerModel> getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(List<PassangerModel> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public BookingModel() {}


	public BookingModel(int id, int flightId, String email, String flightName, LocalDate dateOfJourney, double price) {
		this.id = id;
		this.flightId = flightId;
		this.email = email;
		this.flightName = flightName;
		this.dateOfJourney = dateOfJourney;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookingModel [flightId=" + flightId + ", email=" + email + ", flightName=" + flightName
				+ ", dateOfJourney=" + dateOfJourney + ", price=" + price + "]";
	}
	
	

}
