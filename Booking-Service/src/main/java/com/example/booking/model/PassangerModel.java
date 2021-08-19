package com.example.booking.model;

public class PassangerModel {

	private int id;
	private String name;
	private String gender;
	private int age;
	private String meal;
	private int seatNumber;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "PassangerModel [ name=" + name + ", gender=" + gender + ", age=" + age + ", meal=" + meal
				+ ", seatNumber=" + seatNumber + "]";
	}

	public PassangerModel(int id, String name, String gender, int age, String meal, int seatNumber) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.meal = meal;
		this.seatNumber = seatNumber;
	}


	
}
