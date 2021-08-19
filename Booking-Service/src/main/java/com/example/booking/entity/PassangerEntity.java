package com.example.booking.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PassangerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passangerId;
	private String name;
	private String gender;
	private int age;
	private String meal;
	private int seatNumber;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_id")
	private BookingEntity booking;

	public int getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	
	public PassangerEntity() {
	}

	public PassangerEntity( String name, String gender, int age, String meal, int seatNumber) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.meal = meal;
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "PassangerEntity [passangerId=" + passangerId + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", meal=" + meal + ", seatNumber=" + seatNumber + "]";
	}

}
