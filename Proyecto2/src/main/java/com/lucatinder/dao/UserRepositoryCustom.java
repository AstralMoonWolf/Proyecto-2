package com.lucatinder.dao;

import java.util.List;
import com.lucatinder.model.User;

/**
 * 
 * @author Andrea
 * @version 1
 * Esta clase lista los nombres de los usuarios
 */

public interface UserRepositoryCustom {

	void like(int id1, int id2);
	
	void dislike(int id1, int id2);
	
	//List<User> getFirstNames(String nombre);
	
	//public void login(int id);

	//public void listUsersGender(User user);
	
	

}
