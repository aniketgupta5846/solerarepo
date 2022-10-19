package com.solera.userloginapp.utility;

import org.springframework.stereotype.Component;

import com.solera.userloginapp.entities.Role;
import com.solera.userloginapp.entities.UserDetails;
import com.solera.userloginapp.model.AdminRoleModel;

@Component
public class AdminUtility {

	public UserDetails createUserRoleDetailsFromModel(AdminRoleModel adminRoleModel) {
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(adminRoleModel.getFirstName());
		userDetails.setLastName(adminRoleModel.getLastName());
		userDetails.setEmail(adminRoleModel.getEmail());
		userDetails.setMobile(adminRoleModel.getMobile());
		return userDetails;
	}

	public Role createUserRoleFromModel(AdminRoleModel adminRoleModel) {
		Role role = new Role();
		role.setRoleName(adminRoleModel.getRoleName());
		return role;
	}
}
