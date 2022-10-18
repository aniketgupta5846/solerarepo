package com.solera.userloginapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.userloginapp.entities.UserDetails;
import com.solera.userloginapp.repositories.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepo;
	@Override
	public UserDetails createUserProfile(UserDetails userDetails) {

		return userDetailsRepo.save(userDetails);
	}

	@Override
	public UserDetails updateUserProfile(UserDetails userDetails) {
		Optional<UserDetails> userDetals = userDetailsRepo.findById(userDetails.getUserId());
		UserDetails userData;
		if (userDetals.isPresent()) {
			userData = userDetals.get();
			userData.setEmail(userDetails.getEmail());
			userData.setFirstName(userDetails.getFirstName());
			userData.setLastName(userDetails.getLastName());
			userData.setMobile(userDetails.getMobile());
			userData.setUser(userDetails.getUser());
			return userDetailsRepo.save(userData);
		}
		return userDetails;
	}

}
