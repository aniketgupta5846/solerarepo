package com.solera.userloginapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.userloginapp.entities.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {



}
