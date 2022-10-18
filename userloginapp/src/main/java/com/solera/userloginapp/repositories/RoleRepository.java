package com.solera.userloginapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.userloginapp.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	public Role findByRoleName(String roleName);
}
