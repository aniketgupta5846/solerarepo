package com.solera.userloginapp.service;

import com.solera.userloginapp.entities.UserDetails;

public interface AdminService {

	public String deleteUser(Integer userId);

	public UserDetails updateUser(UserDetails userDetails);

}
