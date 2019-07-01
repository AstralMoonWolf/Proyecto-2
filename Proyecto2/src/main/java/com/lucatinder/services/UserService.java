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

public interface UserService {

	
	public List<User> list();
	
	public void add(User user);
	
	public void listUsersGender(User user);
	
	User deleteById(int id);

	User findById(int id);

	User update(User user);
}
