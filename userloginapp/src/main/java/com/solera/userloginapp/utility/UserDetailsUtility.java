package com.solera.userloginapp.utility;

import org.springframework.stereotype.Component;

import com.solera.userloginapp.entities.User;
import com.solera.userloginapp.entities.UserDetails;
import com.solera.userloginapp.model.UserDetailsModel;

@Component
public class UserDetailsUtility {

	public User createUserFromModel(UserDetailsModel userDetailsModel) {
		User user = new User();
		user.setUserName(userDetailsModel.getUserName());
		user.setPassword(userDetailsModel.getPassword());
		return user;
	}

	public UserDetails createUserDetailsFromModel(UserDetailsModel userDetailsModel) {
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(userDetailsModel.getFirstName());
		userDetails.setLastName(userDetailsModel.getLastName());
		userDetails.setEmail(userDetailsModel.getEmail());
		userDetails.setMobile(userDetailsModel.getMobile());
		return userDetails;
	}
}
