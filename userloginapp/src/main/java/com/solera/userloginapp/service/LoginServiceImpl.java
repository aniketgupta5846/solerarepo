package com.solera.userloginapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.userloginapp.entities.User;
import com.solera.userloginapp.repositories.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public String login(User user) {
		User usr = userRepo.findByUserName(user.getUserName());
		boolean isValidUser;
		if (usr != null) {
			isValidUser = checkUsers(usr, user);
			if (isValidUser) {
				return "Login successful";
			}
		}
		return "User details mismatch";
	}

	private boolean checkUsers(User usr, User user) {
		if (!((usr.getUserName()).equals(user.getUserName())) && ((usr.getPassword()).equals(user.getPassword()))) {
			return false;
		}
		return true;
	}

	@Override
	public String logout(User user) {
		return "User logged out successfully";
	}

}
