package com.solera.userloginapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.userloginapp.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	public User findByUserName(String userName);

}
