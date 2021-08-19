package com.example.flight.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScheduleDaysEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int secheduleId;
	
	
	public String getScheduleDays() {
		return scheduleDays;
	}


	private String scheduleDays;
	
	
	public int getSecheduleId() {
		return secheduleId;
	}


	public void setSecheduleId(int secheduleId) {
		this.secheduleId = secheduleId;
	}


	public void setScheduleDays(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}


	public ScheduleDaysEntity(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}
}
