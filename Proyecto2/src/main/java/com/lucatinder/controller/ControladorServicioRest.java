package com.lucatinder.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucatinder.model.User;
import com.lucatinder.services.UserService;

@RestController
@RequestMapping("/lucatinder")
public class ControladorServicioRest {

	@Autowired
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//Devuelve el usuario de la id que le hemos dado
	@PostMapping("/profile/{id}")
	public User showUser(@PathVariable int id) {
		return this.userService.findById(id);
	}
	
	
	//método que devuelve la lista de usuarios
	@GetMapping("/listausuarios")
	List<User> listausuarios(){
		return this.userService.list();
	}
	

}
