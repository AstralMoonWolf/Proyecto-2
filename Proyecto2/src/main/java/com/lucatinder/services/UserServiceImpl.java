package com.lucatinder.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.dao.UserRepository;
import com.lucatinder.model.User;
/**
 * 
 * @author Raul
 * @version 1
 * Esta clase se utiliza para llamar a métodos del repositorio por defecto del usuario
 *
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userDAO;
	
	
	/**
	 * Este método lista los usuarios
	 */
	@Override
	public List<User> list() {

		return userDAO.findAll();
	}
	/**
	 * Este método añade un bean de usuario a la bbdd
	 */
	
	@Override
	public void add(User user) {
		userDAO.save(user);
	}
	
	@Override
	public User deleteById(int id) {
		User user = findById(id);
		if (user != null) {
			userDAO.delete(user);
		}
		return user;
	}
	
	@Override
	public User findById(int id) {
		return userDAO.findById(id).orElse(null);
	}

	@Override
	public User update(User user) {
		return userDAO.save(user);
	}
	@Override
	public void listUsersGender(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
