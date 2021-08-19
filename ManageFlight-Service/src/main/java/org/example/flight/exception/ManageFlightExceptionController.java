package org.example.flight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManageFlightExceptionController {

	@ExceptionHandler(value = ManageFlightNotFound.class)
	   public ResponseEntity<Object> exception(ManageFlightNotFound exception) {
	      return new ResponseEntity<>("Flight not found", HttpStatus.NOT_FOUND);
	   }
}
