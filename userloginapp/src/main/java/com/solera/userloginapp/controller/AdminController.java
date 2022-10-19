package com.solera.userloginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.solera.userloginapp.model.AdminRoleModel;
import com.solera.userloginapp.service.AdminService;
import com.solera.userloginapp.utility.AdminUtility;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private AdminUtility adminUtility;

	@GetMapping("/admin")
	public ModelAndView getUserDetailsForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin");
		return mv;
	}

//	@RequestMapping(value = "/adminupdate", method = RequestMethod.POST)
//	public ModelAndView updateUserDetails(@ModelAttribute("userlogin") AdminRoleModel adminRoleModel) {
//		ModelAndView mv = new ModelAndView();
//		UserDetails userDetails = adminService
//				.updateUser(adminUtility.createUserRoleDetailsFromModel(adminRoleModel));
//		mv.setViewName("registered");
//		mv.addObject("registered", userDetails);
//		return mv;
//	}

	// http://localhost:8080/admin
	@RequestMapping(value = "/adminupdate", method = RequestMethod.POST)
	public String deleteUser(@ModelAttribute("userlogin") AdminRoleModel adminRoleModel) {
		adminService.deleteUser(adminRoleModel.getUserId());
		return "registered";
	}
}
