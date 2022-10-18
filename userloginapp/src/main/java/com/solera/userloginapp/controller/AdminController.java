package com.solera.userloginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.solera.userloginapp.entities.UserDetails;
import com.solera.userloginapp.model.AdminModel;
import com.solera.userloginapp.service.UserDetailsService;
import com.solera.userloginapp.utility.UserDetailsUtility;

@Controller
public class AdminController {
	@Autowired
	private UserDetailsService userDetalisSevice;
	@Autowired
	private UserDetailsUtility userDetailsUtility;

	@GetMapping("/admin")
	public ModelAndView getUserDetailsForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin");
		return mv;
	}

	@RequestMapping(value = "/adminupdate", method = RequestMethod.POST)
	public ModelAndView updateUserDetails(@ModelAttribute("userlogin") AdminModel adminModel) {
		ModelAndView mv = new ModelAndView();
		UserDetails userDetails = userDetalisSevice
				.createUserProfile(userDetailsUtility.createUserDetailsFromModel(userDetailsModel));
		mv.setViewName("registered");
		mv.addObject("registered", userDetails);
		return mv;
	}
}
