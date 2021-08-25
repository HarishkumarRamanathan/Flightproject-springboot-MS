package com.example.discount.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiscountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String couponCode;
	private double maxAmount;
	private int percentage;

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

	public DiscountEntity() {
	}

	public DiscountEntity(int id, String couponCode, double maxAmount, int percentage) {
		this.id = id;
		this.couponCode = couponCode;
		this.maxAmount = maxAmount;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "DiscountEntity [discountId=" + id + ", couponCode=" + couponCode + ", maxAmount=" + maxAmount
				+ ", percentage=" + percentage + "]";
	}

}
