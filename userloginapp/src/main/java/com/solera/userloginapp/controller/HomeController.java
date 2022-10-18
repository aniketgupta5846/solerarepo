package com.solera.userloginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.solera.userloginapp.service.UserDetailsService;

@Controller
public class HomeController {

	@Autowired
	private UserDetailsService userDetalisSevice;

	// http://localhost:8080/home
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getCustomerForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}



}
