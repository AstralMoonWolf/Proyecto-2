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

	
	public List<User> list();
	
	public void add(User user);
	
	public void login(int id);
	
	public void listUsersGender(User user);
}
