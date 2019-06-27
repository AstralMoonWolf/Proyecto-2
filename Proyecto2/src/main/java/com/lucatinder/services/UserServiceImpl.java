package com.lucatinder.services;

import com.lucatinder.dao.UserRepositoryCustom;
import com.lucatinder.model.User;

public class UserServiceImpl implements IUserService {

	private UserRepositoryCustom userDAO;
	
	
	public void add(User user) {
		userDAO.save(user);
	}
	
}
