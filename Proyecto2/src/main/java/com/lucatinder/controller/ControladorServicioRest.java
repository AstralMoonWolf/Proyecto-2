package com.lucatinder.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucatinder.model.User;
import com.lucatinder.services.UserService;

@RestController
@RequestMapping("/lucatinder")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ControladorServicioRest {

	@Autowired
	private UserService userService;

	@GetMapping("/profile/{id}")
	public User showUser(@PathVariable int id) {
		return this.userService.findById(id);
	}
	
	@GetMapping("/listausuarios")
	public List<User> listausuarios() {
		return userService.list();
	}
	
	
	@GetMapping("/dislike")
	public void dislike(@RequestParam("id1") int id1, @RequestParam("id2") int id2) {
		//logger.info("-------RestController dislike");
		userService.dislike(id1, id2);
	}
	
	@GetMapping("/like")
	public void like(@RequestParam("id1") int id1, @RequestParam("id2") int id2) {
		//logger.info("-------RestController dislike");
		userService.like(id1, id2);
	}
	
	//Metodo que devuelve el usuario creado 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/new")
	public User update(@RequestBody User user) {
		System.out.println("He pasado por aquí!!!!!!!!!!!!!!!!!!!!!!");
		return userService.update(user);
	}
	
}
