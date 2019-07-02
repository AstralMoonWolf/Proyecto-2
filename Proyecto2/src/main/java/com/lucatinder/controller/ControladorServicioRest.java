package com.lucatinder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucatinder.model.User;
import com.lucatinder.services.UserService;

@RestController
@RequestMapping("/lucatinder")
public class ControladorServicioRest {

	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(ControladorServicioRest.class);
	
	@GetMapping("/{acces}")
	public String newId(@ModelAttribute("user") User user, ModelMap model) throws Exception {
		logger.info("-- en Access");
		if (userService.findById(user.getId()) != null) {
			model.addAttribute("user", userService.findById(user.getId()));
			return "profile";
		} else
			return "redirect:/index";
	}
				
	
	}