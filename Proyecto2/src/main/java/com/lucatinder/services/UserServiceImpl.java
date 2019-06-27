package com.lucatinder.services;

import com.lucatinder.dao.IUserRepository;
import com.lucatinder.model.User;
/**
 * 
 * @author Raul
 * @version 1
 * Esta clase se utiliza para llamar a métodos del repositorio por defecto del usuario
 *
 */
public class UserServiceImpl implements IUserService {

	private IUserRepository userDAO;
	
	/**
	 * Este método añade un bean de usuario a la bbdd
	 */
	public void add(User user) {
		userDAO.save(user);
	}
	
}
