package com.solera.restfulapp.service;

import com.solera.restfulapp.entities.Customer;
import com.solera.restfulapp.exception.CustomerNotFoundException;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);

	public Customer retrieveCustomer(Integer customerId) throws CustomerNotFoundException;

	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	public String deleteCustomer(Integer customerId) throws CustomerNotFoundException;

}
