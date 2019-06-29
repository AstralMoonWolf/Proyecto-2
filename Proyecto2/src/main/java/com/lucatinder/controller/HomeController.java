package com.lucatinder.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

	@Autowired
	private IUserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@GetMapping({"/","/index"})
	public String handleRequest(ModelMap model) throws Exception {
		logger.info("-- en Index");
		model.addAttribute("userList", userService.list());
		return "index";
	}
	
	//mapping de prueba, se borrará
	@GetMapping("/pruebalista")
	public String pruebalista(ModelMap model)throws Exception{
		logger.info("-- en listado de prueba");
		model.addAttribute("userList", userService.list());
		//userService.list();
		return "pruebalista";
	}	
	
	@GetMapping("/profile")
	public String profile(ModelMap model)throws Exception{
		logger.info("-- en lista contactos");
		//userService.list();
		return "profile";
	}
	
	@GetMapping("/listacontactos")
	public String listaContactos(ModelMap model)throws Exception{
		logger.info("-- en lista contactos");
		//userService.list();
		return "listprofiles";
	}
	
	
	
	@PostMapping("/new")
	public String newUser(ModelMap model) throws Exception  {
		logger.info("-- en New");
		model.addAttribute("user", new User());
		return "UserForm";
	}
	
	@PostMapping("/Acces")
	public String newId(ModelMap model)throws Exception{
		logger.info("-- en Access");
		return "profile";
	}
	
		
}
