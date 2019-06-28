package com.lucatinder.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatinder.model.Genero;
import com.lucatinder.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * 
 * @author Andrea
 * @version 1
 * Esta clase recoje los datos (nombres de usuarios) de la BD
 */

@Repository
public class UserRepositoryImpl implements IUserRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	
	/*public List<User> getFirstNames(String nombre) {
		Query query = entityManager.createNativeQuery("SELECT nombre FROM lucatinder.usuarios as u " +
                "WHERE u.nombre LIKE ?", User.class);
        query.setParameter(1, nombre + "%");
        return query.getResultList();
	}*/
	
	/*public void login(int id) {
		
	}*/

	//@Override
	/*public void listUsersGender(User user) {
		
		if(user.getGenero() == Genero.H) {
			
		}
		else {
			
		}
		
	}*/
	
}
