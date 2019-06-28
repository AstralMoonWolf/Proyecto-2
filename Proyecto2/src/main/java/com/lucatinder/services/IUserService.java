package com.lucatinder.services;

import java.util.List;

import com.lucatinder.model.User;

/**
 * 
 * @author Raul
 * @version 1
 * Esta clase tiene el metodo añadir usuario
 *
 */

public interface IUserService {

	/**
	 * Este método lista los usuarios
	 */
	public List<User> list();
	/**
	 * 
	 * Este metodo añade usuarios
	 */
	public void add(User user);
	
}
