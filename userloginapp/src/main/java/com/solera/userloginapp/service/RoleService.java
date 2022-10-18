package com.solera.userloginapp.service;

import com.solera.userloginapp.entities.Role;

public interface RoleService {

	public Role addRole(Role role);

	public Role getRoleById(Integer roleId);

	public Role getRoleByName(String roleName);

	public void deleteRole(Integer roleIdS);

	public Role updateRole(Role role);
}
