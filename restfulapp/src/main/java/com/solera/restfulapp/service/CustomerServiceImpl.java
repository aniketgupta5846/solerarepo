package com.solera.restfulapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.restfulapp.entities.Customer;
import com.solera.restfulapp.exception.CustomerNotFoundException;
import com.solera.restfulapp.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public Customer createCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public Customer retrieveCustomer(Integer customerId) throws CustomerNotFoundException {
		Optional<Customer> customer =customerRepo.findById(customerId);
		if(customer.isPresent()) {
			return customer.get();
		}
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		Optional<Customer> cust =customerRepo.findById(customer.getCustomerId());
		Customer c;
		if(cust.isPresent()) {
			  c= cust.get();
			  c.setCustomerName(customer.getCustomerName());
			  c.setOrders(customer.getOrders());
			  return customerRepo.save(c);
			  
		}
		return customer;
	}

	@Override
	public String deleteCustomer(Integer customerId) throws CustomerNotFoundException {
		customerRepo.deleteById(customerId);
		return "Deleted Successfully";
	}

}
