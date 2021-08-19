package com.example.flight.util;

public enum ScheduleDays {
	SUNDAY("sunday"), MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"), FRIDAY("friday"), SATURDAY("saturday");
	String day;

	private ScheduleDays(String day) {
		this.day = day;
	}
	
}

