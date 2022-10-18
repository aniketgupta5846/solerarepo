package com.solera.userloginapp.service;

import com.solera.userloginapp.entities.User;

public interface LoginService {
	public String login(User user);

	public String logout(User user);
}
