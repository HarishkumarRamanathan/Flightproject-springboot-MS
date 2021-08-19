package com.example.discount.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.discount.entity.DiscountEntity;
import com.example.discount.model.DiscountModel;
import java.util.Optional;

public interface DiscountService {

	void addDiscount(DiscountModel discountModel);

	List<DiscountEntity> getAllDiscount();

	DiscountModel getDiscountById(int id);

	void deleteDiscountById(int id);

	void updateDiscount(DiscountModel discountModel, int id);

}
