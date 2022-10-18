package com.solera.userloginapp.service;

import com.solera.userloginapp.entities.UserDetails;

public interface UserDetailsService {

	public UserDetails createUserProfile(UserDetails userDeatails);

	public UserDetails updateUserProfile(UserDetails userDeatails);


}
