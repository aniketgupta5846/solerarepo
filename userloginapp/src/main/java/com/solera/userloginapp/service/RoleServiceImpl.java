package com.solera.userloginapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.userloginapp.entities.Role;
import com.solera.userloginapp.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public Role addRole(Role role) {

		return roleRepo.save(role);
	}

	@Override
	public Role getRoleById(Integer roleId) {
		Optional<Role> role = roleRepo.findById(roleId);
		if (role.isPresent()) {
			return role.get();
		}
		return null;
	}

	@Override
	public Role getRoleByName(String roleName) {

		return roleRepo.findByRoleName(roleName);
	}

	@Override
	public void deleteRole(Integer roleId) {
		roleRepo.deleteById(roleId);

	}

	@Override
	public Role updateRole(Role role) {
		Optional<Role> rol = roleRepo.findById(role.getRoleId());
		Role r = null;
		if (rol.isPresent()) {
			r = rol.get();
			r.setRoleName(role.getRoleName());
			roleRepo.save(r);

		}
		return r;
	}

}
