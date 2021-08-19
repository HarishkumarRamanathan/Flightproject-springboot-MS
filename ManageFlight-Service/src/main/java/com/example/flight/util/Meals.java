package com.example.flight.util;


public enum Meals {
	VEG("veg"), NONVEG("nonveg"), NONE("none");
	String meal;

	private Meals(String meal) {
		this.meal = meal;
	}
	
}