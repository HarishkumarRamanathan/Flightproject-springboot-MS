package com.example.booking.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.booking.model.PassangerModel;

@Entity
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private int flightId;
	private String email;
	private String flightName;
	private LocalDate dateOfJourney;
	private double price;
	
	@OneToMany(cascade = { CascadeType.ALL})
	private List<PassangerEntity> passangerEntities;
	
	
	public BookingEntity() {
	}


	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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


	public List<PassangerEntity> getPassangerEntities() {
		return passangerEntities;
	}


	public void setPassangerEntities(List<PassangerEntity> passangerEntities) {
		this.passangerEntities = passangerEntities;
	}


	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", flightId=" + flightId + ", email=" + email + ", flightName="
				+ flightName + ", dateOfJourney=" + dateOfJourney + ", price=" + price + ", passangerEntities="
				+ passangerEntities + "]";
	}
	
	
	
}
