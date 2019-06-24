package com.ejemplos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/////////////////////////////////
/////////////////////////////////
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ejemplos.spring.model.User;
import com.ejemplos.spring.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String handleRequest(ModelMap model) throws Exception {
		logger.info("-- en Listado");		
		model.addAttribute("userList", userService.list());
		return "UserList";
	}	
	
	@GetMapping("/new")
	public String newUser(ModelMap model) {
		logger.info("-- en NEW");
		model.addAttribute("user", new User());
		return "UserForm";		
	}
	
	@GetMapping("/edit")
	public String editUser(ModelMap model, @RequestParam("id") int id) {
		logger.info("-- en EDIT");
		model.addAttribute("user", userService.get(id));
		return "UserForm";		
	}
	
	//@DeleteMapping("/")
	@GetMapping("/delete")
	public ModelAndView deleteUser(@RequestParam("id") int id) {
		logger.info("-- en DELETE");
		userService.delete(id);
		return new ModelAndView("redirect:/");		
	}
	
	@PostMapping("/save")
	public ModelAndView saveUser(@ModelAttribute User user) {
		logger.info("-- en SAVE");
		userService.add(user);
		return new ModelAndView("redirect:/");
	}
	
}
