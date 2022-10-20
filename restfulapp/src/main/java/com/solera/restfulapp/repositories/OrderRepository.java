package com.solera.restfulapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.restfulapp.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
