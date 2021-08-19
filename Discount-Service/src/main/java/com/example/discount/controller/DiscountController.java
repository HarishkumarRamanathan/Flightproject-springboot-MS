package com.example.discount.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.discount.entity.DiscountEntity;
import com.example.discount.model.DiscountModel;
import com.example.discount.service.DiscountService;

@RestController
@RequestMapping("/discount")
@CrossOrigin
public class DiscountController {

	@Autowired
	private DiscountService discountService;
	
	@GetMapping("/home")
	public String get() {
		return "welcome";
		
	}

	@PostMapping("/add")
	public void addDiscount(@RequestBody DiscountModel discountModel) {

		discountService.addDiscount(discountModel);

	}

	@GetMapping("/alldiscount")
	public List<DiscountEntity> getAllDiscount() {
		return discountService.getAllDiscount();

	}

	@GetMapping("/getdiscount/{id}")
	public ResponseEntity<DiscountModel> getDiscountById(@PathVariable int id) {
		DiscountModel model=discountService.getDiscountById(id);
		return new ResponseEntity<>(model,HttpStatus.OK);

	}

	@DeleteMapping("/deletediscount/{id}")
	public void deleteDiscount(@PathVariable int id) {
		discountService.deleteDiscountById(id);

	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<DiscountModel> updateDiscount(@RequestBody DiscountModel discountModel, @PathVariable int id){
		discountService.updateDiscount(discountModel,id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
