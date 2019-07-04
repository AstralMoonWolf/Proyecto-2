package com.lucatinder.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.controller.HomeController;
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
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userDAO;
	
	public void like(int id1, int id2) {
		userDAO.like(id1, id2);
	}
	
	public void dislike(int id1, int id2) {
		userDAO.dislike(id1, id2);
	}
	
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		logger.info("---Obtiene el perfil");
		Optional<User> perfilOptional = userDAO.findById(id);
		if (perfilOptional.isPresent()){
			User u = perfilOptional.get();
			System.out.println(u);
			return u;
		}
		else{
		   return null;
		}
	}
	
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
		//return null;
	}
	@Override
	public void listUsersGender(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
