package com.lucatinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/profile/{id}")
	public User showUser(@PathVariable int id) {
		return this.userService.findById(id);
	}
	
	/*@GetMapping("/dislike")
	public String dislike(@RequestParam("id1") int id1, @RequestParam("id2") int id2, ModelMap model) {
		logger.info("-------UsuarioController dislike");
		userService.dislike(id1, id2);
		model.addAttribute("usuariologin", userService.findById(id1));
		model.addAttribute("userList", userService.list());
		return "listprofilesnuevo";
	}*/
	

}
