package com.lucatinder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lucatinder.model.User;
import com.lucatinder.services.UserService;

/**
 * 
 * @author Andrea,Raul
 * @version 1 Esta clase contiene el CRUD del usuario
 */

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping({ "/", "/index" })
	public String handleRequest(ModelMap model) throws Exception {
		logger.info("-- en Index");
		model.addAttribute("user", new User());
		return "index";
	}

	// mapping de prueba, se borrará
	@GetMapping("/pruebalista")
	public String pruebalista(ModelMap model) throws Exception {
		logger.info("-- en listado de prueba");
		model.addAttribute("userList", userService.list());
		// userService.list();
		return "pruebalista";
	}

	@GetMapping("/pruebalista2")
	public String pruebalista2(@RequestParam("id") int id, ModelMap model) throws Exception {
		logger.info("-- en listado de prueba");

		model.addAttribute("userList", userService.list());
		model.addAttribute("usuariologin", userService.findById(id));
		// userService.list();
		return "listprofilesnuevo";
	}

	@GetMapping("/profile")
	public String profile(ModelMap model) throws Exception {
		logger.info("-- en profile");
		// userService.list();
		return "profile";
	}

	

	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user, ModelMap model) throws Exception {
		logger.info("-- en SAVE");
		userService.add(user);
		if (userService.findById(user.getId()) != null) {
			model.addAttribute("user", userService.findById(user.getId()));
			return "profile";

		} else {
			return "redirect:/index";
		}

	}

	
	@PostMapping("/acces")
	public String newId(@ModelAttribute("user") User user, ModelMap model) throws Exception {
		logger.info("-- en Access");
		if (userService.findById(user.getId()) != null) {
			model.addAttribute("user", userService.findById(user.getId()));
			return "profile";
		} else
			return "redirect:/index";
	}

	
	@GetMapping("/like")
	public String like(@RequestParam("id1") int id1, @RequestParam("id2") int id2, ModelMap model) {
		logger.info("----UsuarioController like");
		userService.like(id1, id2);
		model.addAttribute("usuariologin", userService.findById(id1));
		model.addAttribute("userList", userService.list());
		return "listprofilesnuevo";
	}
	
	
	@GetMapping("/dislike")
	public String dislike(@RequestParam("id1") int id1, @RequestParam("id2") int id2, ModelMap model) {
		logger.info("-------UsuarioController dislike");
		userService.dislike(id1, id2);
		model.addAttribute("usuariologin", userService.findById(id1));
		model.addAttribute("userList", userService.list());
		return "listprofilesnuevo";
	}

}
