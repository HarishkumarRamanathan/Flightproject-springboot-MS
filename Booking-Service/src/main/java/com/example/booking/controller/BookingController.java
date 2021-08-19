package com.example.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.entity.BookingEntity;
import com.example.booking.model.BookingModel;
import com.example.booking.model.PassangerModel;
import com.example.booking.service.BookingService;

@RestController
@CrossOrigin
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping("/booking")
	public void bookTicket(@RequestBody BookingModel bookingModel) {
		bookingService.bookTicket(bookingModel);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<BookingModel>> getAll() {
		List<BookingModel> list = bookingService.getAll();
		return new ResponseEntity<>(list,HttpStatus.FOUND);

	}
	
	@GetMapping("/{email}")
	public ResponseEntity<List<BookingModel>> getByEmail(@PathVariable String email){
		List<BookingModel> list= bookingService.getByEmail(email);
		return new ResponseEntity<List<BookingModel>>(list, HttpStatus.OK);
		
	}
}
