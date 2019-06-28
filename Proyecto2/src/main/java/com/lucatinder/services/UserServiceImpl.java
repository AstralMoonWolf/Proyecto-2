package com.lucatinder.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.dao.IUserRepository;
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
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userDAO;
	
	
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
	
	/**
	 * Este metodo hay que ver si esta bien ***********DUDA***************
	 */
	
	
	/*public void login(int id) {
		userDAO.login(id);
	}*/

	/*@Override
	public void listUsersGender(User user) {
		userDAO.listUsersGender(user);
	}*/
	
}
