package com.example.booking.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.entity.BookingEntity;
import com.example.booking.entity.PassangerEntity;
import com.example.booking.model.BookingModel;
import com.example.booking.model.PassangerModel;
import com.example.booking.repo.BookingRepo;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo bookingRepo;

	@Override
	public void bookTicket(BookingModel bookingModel) {
		BookingEntity bookingEntity = new BookingEntity();
		bookingEntity.setBookingId(bookingModel.getFlightId());
		bookingEntity.setFlightId(bookingModel.getFlightId());
		bookingEntity.setEmail(bookingModel.getEmail());
		bookingEntity.setFlightName(bookingModel.getFlightName());
		bookingEntity.setDateOfJourney(bookingModel.getDateOfJourney());
		bookingEntity.setPrice(bookingModel.getPrice());

		bookingEntity.setPassangerEntities(bookingModel.getPassengerDetails().stream()
				.map(i -> new PassangerEntity(i.getName(), i.getGender(), i.getAge(), i.getMeal(), i.getSeatNumber()))
				.collect(Collectors.toList()));

		bookingRepo.save(bookingEntity);
	}
	
	

	@Override
	public List<BookingModel> getAll() {

		List<BookingEntity> bookingEntities = bookingRepo.findAll();
		List<BookingModel> bookingModels = new ArrayList<BookingModel>();

		for (BookingEntity entity : bookingEntities) {
			/*
			 * bookingModels.add(new BookingModel(entity.getFlightId(), entity.getEmail(),
			 * entity.getFlightName(), entity.getDateOfJourney(), entity.getPrice()));
			 */

			BookingModel model = new BookingModel(entity.getBookingId(),entity.getFlightId(), entity.getEmail(), entity.getFlightName(),
					entity.getDateOfJourney(), entity.getPrice());
			List<PassangerModel> passangerModels = new ArrayList<PassangerModel>();
			
			for (PassangerEntity passangerEntity : entity.getPassangerEntities()) {
				passangerModels.add(new PassangerModel(passangerEntity.getPassangerId(),passangerEntity.getName(), passangerEntity.getGender(),
						passangerEntity.getAge(), passangerEntity.getMeal(), passangerEntity.getSeatNumber()));
				System.out.println(passangerEntity.getName());
			}
			
			model.setPassengerDetails(passangerModels);
			bookingModels.add(model);
		}
		return bookingModels;
	}

	@Override
	public List<BookingModel> getByEmail(String email) {
		List<BookingEntity> bookingEntities = bookingRepo.findByEmail(email);
		List<BookingModel> bookingModels = new ArrayList<BookingModel>();

		for (BookingEntity entity : bookingEntities) {
			/*
			 * bookingModels.add(new BookingModel(entity.getFlightId(), entity.getEmail(),
			 * entity.getFlightName(), entity.getDateOfJourney(), entity.getPrice()));
			 */

			BookingModel model = new BookingModel(entity.getBookingId(),entity.getFlightId(), entity.getEmail(), entity.getFlightName(),
					entity.getDateOfJourney(), entity.getPrice());
			List<PassangerModel> passangerModels = new ArrayList<PassangerModel>();
			
			for (PassangerEntity passangerEntity : entity.getPassangerEntities()) {
				passangerModels.add(new PassangerModel(passangerEntity.getPassangerId(),passangerEntity.getName(), passangerEntity.getGender(),
						passangerEntity.getAge(), passangerEntity.getMeal(), passangerEntity.getSeatNumber()));
				System.out.println(passangerEntity.getName());
			}
			
			model.setPassengerDetails(passangerModels);
			bookingModels.add(model);
		}
		return bookingModels;
	}



	@Override
	public void cancelBooking(int id) {
		bookingRepo.deleteById(id);
		
	}

}
