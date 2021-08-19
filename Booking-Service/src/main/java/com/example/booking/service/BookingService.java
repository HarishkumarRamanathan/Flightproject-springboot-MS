package com.example.booking.service;

import java.util.List;

import com.example.booking.model.BookingModel;

public interface BookingService {

	void bookTicket(BookingModel bookingModel);

	List<BookingModel> getAll();

	List<BookingModel> getByEmail(String email);

	

}
