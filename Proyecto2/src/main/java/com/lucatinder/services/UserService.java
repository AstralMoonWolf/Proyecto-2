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
	public void like(int id1, int id2);
	
	public void dislike(int id1, int id2);

	User get(int id);
	
	User deleteById(int id);

	User findById(int id);

	User update(User user);
}
