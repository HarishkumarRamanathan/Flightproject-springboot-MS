package com.example.flight.controller;

import java.util.List;

import org.example.flight.exception.ManageFlightExceptionController;
import org.example.flight.exception.ManageFlightNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.configuration.ApplicationConstant;
import com.example.flight.entity.ManageFlightEntity;
import com.example.flight.model.FlightModel;
import com.example.flight.model.FlightModelResponse;
import com.example.flight.service.ManageFlightService;

@RestController
@RequestMapping("/flights")
@CrossOrigin
public class ManageFlightController {

	@Autowired
	private ManageFlightService manageFlightService;
	
	@Autowired
	private KafkaTemplate<String, List<FlightModelResponse>> kafkaTemplate;
	
//	private static final String TOPIC = "kafka_topic_name";


	@GetMapping("/home")
	public String index() {
		return "welcome";
	}
	
	@GetMapping("/publish")
	public String sendMessage() {
		List<FlightModelResponse> list = manageFlightService.getAll();
		try {
			kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, list);
		} catch (Exception e) {
			e.printStackTrace();
			return "Message not sent ";
		}
		return "Message sent succuessfully";
	}

	@PostMapping("/addflight")
	public void addFlights(@RequestBody FlightModel flightModel) {
		System.out.println(flightModel);
		manageFlightService.addFlights(flightModel);

	}

	@GetMapping("")
	public ResponseEntity<List<FlightModelResponse>> getAll() {
		List<FlightModelResponse> list = manageFlightService.getAll();
		return new ResponseEntity<>(list, HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteFlight(@PathVariable int id) {
		manageFlightService.deleteFlight(id);
		
	}
	
	@PutMapping("/update/{id}")
	@Cacheable("flight")
	public ResponseEntity<FlightModelResponse> updateFlight(@RequestBody FlightModelResponse flightModelResponse,@PathVariable int id) {
		manageFlightService.updateFlight(flightModelResponse,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@Cacheable("flight")
	public ResponseEntity<FlightModelResponse> getById(@PathVariable int id){
		FlightModelResponse list = manageFlightService.getById(id);
		if(list == null) {
			throw new ManageFlightNotFound();
		}
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

}
