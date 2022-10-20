package com.solera.restfulapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.restfulapp.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
