package com.solera.restfulapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solera.restfulapp.entities.Customer;
import com.solera.restfulapp.exception.CustomerNotFoundException;
import com.solera.restfulapp.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// http://localhost:8080/customer/add
	@PostMapping("/add")
	public Customer newCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	// http://localhost:8080/customer/customerdetail/1
	@GetMapping("/customerdetail/{id}")
	public Customer retrieveCustomerById(@PathVariable Integer id) throws CustomerNotFoundException {
		return customerService.retrieveCustomer(id);
	}

	// http://localhost:8080/customer/delete?id=1
	@DeleteMapping("/delete")
	public String deleteCustomerById(@RequestParam("id") Integer customerId) throws CustomerNotFoundException {
		
		return customerService.deleteCustomer(customerId);
	}
}
