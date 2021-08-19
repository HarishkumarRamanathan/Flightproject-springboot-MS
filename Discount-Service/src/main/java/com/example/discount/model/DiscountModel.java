package com.example.discount.model;

import java.time.LocalDate;

public class DiscountModel {

	private int id;
	private String couponCode;
	private double maxAmount;
	private int percentage;

	public DiscountModel() {}
	public DiscountModel(int id, String couponCode, double maxAmount, int percentage) {
		this.id = id;
		this.couponCode = couponCode;
		this.maxAmount = maxAmount;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public double getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
