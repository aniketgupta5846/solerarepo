package com.solera.restfulapp.handeler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.solera.restfulapp.exception.CustomerNotFoundException;
import com.solera.restfulapp.exception.OrderNotFoundException;

@RestControllerAdvice
public class ExceptionHandeler {

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotfoundException() {
		return new ResponseEntity<String>("Customer not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleOrdeNotfoundException()
	{
		return new ResponseEntity<String>("Order not found", HttpStatus.NOT_FOUND);
	}

}
