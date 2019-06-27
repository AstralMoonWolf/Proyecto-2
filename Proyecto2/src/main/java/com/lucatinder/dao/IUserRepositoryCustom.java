package com.lucatinder.dao;

import java.util.List;
import com.lucatinder.model.User;

/**
 * 
 * @author Andrea
 * @version 1
 * Esta clase lista los nombres de los usuarios
 */

public interface IUserRepositoryCustom {
	
	List<User> getFirstNamesLike(String username);
	
	

}
