package com.solera.userloginapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.solera.userloginapp.entities.UserDetails;

public interface AdminRepository extends CrudRepository<UserDetails, Integer> {

}
