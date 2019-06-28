package com.lucatinder.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lucatinder.model.User;
import com.lucatinder.services.IUserService;
/**
 * 
 * @author Andrea,Raul
 * @version 1
 * Esta clase contiene el CRUD del usuario
 */

@Controller
public class HomeController {

	//@Autowired
	private IUserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String handleRequest(ModelMap model) throws Exception {
		
		logger.info("-- en Listado");
		model.addAttribute("userList", userService.list());

		return "index";
	}
	
	@PostMapping("/new")
	public String newUser(ModelMap model) throws Exception  {
		logger.info("-- en New");
		//model.addAttribute("user", new User());
		return "UserForm";
	}
	
	@PostMapping("/Acces")
	public String newId(ModelMap model)throws Exception{
		logger.info("-- en Access");
		return "profile";
	}
}
