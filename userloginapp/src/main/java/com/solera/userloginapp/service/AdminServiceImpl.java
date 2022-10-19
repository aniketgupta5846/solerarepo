package com.solera.userloginapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.userloginapp.entities.UserDetails;
import com.solera.userloginapp.repositories.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepo;

	@Override
	public UserDetails updateUser(UserDetails userDetails) {

		Optional<UserDetails> usr = adminRepo.findById(userDetails.getUserId());
		if (usr.isPresent()) {
			return adminRepo.save(userDetails);

		}
		return null;
	}

	@Override
	public String deleteUser(Integer userId) {
		adminRepo.deleteById(userId);
		return "Dealer deleted";
	}

}
