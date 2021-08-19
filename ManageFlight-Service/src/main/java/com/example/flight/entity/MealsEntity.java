package com.example.flight.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.example.flight.util.Meals;

@Entity
public class MealsEntity {

	@Id
	private int mealsId;
	
	private String meals;

	public String getMeals() {
		return meals;
	}



	public MealsEntity(String meals) {
		// TODO Auto-generated constructor stub
		this.meals = meals;
	}



}
