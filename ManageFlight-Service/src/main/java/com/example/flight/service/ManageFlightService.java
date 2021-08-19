package com.example.flight.service;

import java.util.List;

import com.example.flight.model.FlightModel;
import com.example.flight.model.FlightModelResponse;

public interface ManageFlightService {

	void addFlights(FlightModel flightModel);

	List<FlightModelResponse> getAll();

	void deleteFlight(int id);

	void updateFlight(FlightModelResponse flightModelResponse, int id);

	FlightModelResponse getById(int id);




}
