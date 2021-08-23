package com.example.flight.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.flight.entity.ManageFlightEntity;
//import com.example.flight.entity.ScheduleDaysEntity;
import com.example.flight.model.FlightModel;
import com.example.flight.model.FlightModelResponse;
import com.example.flight.repository.ManageFlightRepo;

@Service
public class ManageFlightServiceImpl implements ManageFlightService {

	@Autowired
	private ManageFlightRepo manageFlightRepo;

	@Override
	public void addFlights(FlightModel flightModel) {
		// TODO Auto-generated method stub

		ManageFlightEntity manageFlightEntity = new ManageFlightEntity();
		manageFlightEntity.setAirlineName(flightModel.getAirlineName());
		manageFlightEntity.setFromPlace(flightModel.getFromPlace());
		manageFlightEntity.setToPlace(flightModel.getToPlace());
		manageFlightEntity.setStartDateTime(flightModel.getStartDateTime());
		manageFlightEntity.setEndDateTime(flightModel.getEndDateTime());

		String days = "";
		boolean dayValue = false;

		for (String s : flightModel.getScheduledDays()) {
			if (dayValue) {
				days = days + "," + s;
			} else {
				days = s;
			}
			dayValue = true;
		}
		// flightModel.getScheduledDays().stream().map(t ->
		// days+","+t).collect(Collectors.toList());
		manageFlightEntity.setScheduleDays(days);
//		System.out.println(manageFlightEntity.getScheduledDays().toString());
		manageFlightEntity.setInstrumentUsed(flightModel.getInstrumentUsed());
		manageFlightEntity.setTotalNoOfSeats(flightModel.getTotalNoOfSeats());
		manageFlightEntity.setTotalNoOfBussinessSeats(flightModel.getTotalNoOfBussinessSeats());
		manageFlightEntity.setPrice(flightModel.getPrice());
		manageFlightEntity.setNoOfRows(flightModel.getNoOfRows());
		
		String food = "";
		boolean mealValue = false;
		for (String f : flightModel.getMeal()) {
			if (mealValue) {
				food = food + "," + f;
			} else {
				food = f;
			}
			mealValue = true;
		}
		manageFlightEntity.setMeals(food);
		manageFlightEntity.setStatus(flightModel.getStatus());
		manageFlightRepo.save(manageFlightEntity);
	}

	@Override
	public List<FlightModelResponse> getAll() {

		List<ManageFlightEntity> listFlights = manageFlightRepo.findAll();
		List<FlightModelResponse> models = new ArrayList<FlightModelResponse>();
		for (ManageFlightEntity m : listFlights) {
			models.add(new FlightModelResponse(m.getFlightId(), m.getAirlineName(), m.getFromPlace(), m.getToPlace(),
					m.getStartDateTime(), m.getEndDateTime(), Arrays.asList(m.getScheduleDays().split(",")),
					m.getInstrumentUsed(), m.getTotalNoOfSeats(), m.getTotalNoOfBussinessSeats(), m.getPrice(),
					m.getNoOfRows(), Arrays.asList(m.getMeals().split(",")),m.getStatus()));
		}
		return models;
	}

	@Override
	public void deleteFlight(int id) {
		// TODO Auto-generated method stub
		manageFlightRepo.deleteById(id);
	}

	@Override
	public void updateFlight(FlightModelResponse flightModelResponse, int id) {
		Optional<ManageFlightEntity> manageFlightEntity = manageFlightRepo.findById(id);

		if (manageFlightEntity.isPresent()) {
			ManageFlightEntity entity = manageFlightEntity.get();

			entity.setAirlineName(flightModelResponse.getAirlineName());
			entity.setFromPlace(flightModelResponse.getFromPlace());
			entity.setToPlace(flightModelResponse.getToPlace());
			entity.setStartDateTime(flightModelResponse.getStartDateTime());
			entity.setEndDateTime(flightModelResponse.getEndDateTime());

			String days = "";
			boolean dayValue = false;

			for (String s : flightModelResponse.getScheduledDays()) {
				if (dayValue) {
					days = days + "," + s;
				} else {
					days = s;
				}
				dayValue = true;
			}

			entity.setScheduleDays(days);
//		System.out.println(manageFlightEntity.getScheduledDays().toString());
			entity.setInstrumentUsed(flightModelResponse.getInstrumentUsed());
			entity.setTotalNoOfSeats(flightModelResponse.getTotalNoOfSeats());
			entity.setTotalNoOfBussinessSeats(flightModelResponse.getTotalNoOfBussinessSeats());
			entity.setPrice(flightModelResponse.getPrice());
			entity.setNoOfRows(flightModelResponse.getNoOfRows());

			String food = "";
			boolean mealValue = false;
			for (String f : flightModelResponse.getMeal()) {
				if (mealValue) {
					food = food + "," + f;
				} else {
					food = f;
				}
				mealValue = true;
			}
			entity.setMeals(food);
			entity.setStatus(flightModelResponse.getStatus());
			System.out.println(flightModelResponse.getStatus());
			manageFlightRepo.save(entity);
		}

	}

	
	@Override
	public FlightModelResponse getById(int id) {
		// TODO Auto-generated method stub
		Optional<ManageFlightEntity> manageFlightEntity = manageFlightRepo.findById(id);
		FlightModelResponse flightModelResponse = null;
		if (manageFlightEntity.isPresent()) {

			ManageFlightEntity m = manageFlightEntity.get();
			flightModelResponse = new FlightModelResponse(m.getFlightId(), m.getAirlineName(), m.getFromPlace(),
					m.getToPlace(), m.getStartDateTime(), m.getEndDateTime(),
					Arrays.asList(m.getScheduleDays().split(",")), m.getInstrumentUsed(), m.getTotalNoOfSeats(),
					m.getTotalNoOfBussinessSeats(), m.getPrice(), m.getNoOfRows(),
					Arrays.asList(m.getMeals().split(",")),m.getStatus());
		}

		return flightModelResponse;
	}

}
