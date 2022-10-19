package com.solera.userloginapp.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
public class AdminRoleModel {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long mobile;
	private String roleName;
}
