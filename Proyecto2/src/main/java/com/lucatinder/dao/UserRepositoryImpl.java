package com.lucatinder.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatinder.controller.HomeController;
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
public class UserRepositoryImpl implements UserRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);
	
	
	@Override
	public void like(int id1, int id2) {
		// TODO Auto-generated method stub
		logger.info("--- En método like de la clase PerfilRpositoryImpl");
		entityManager.createNativeQuery("INSERT INTO lucatinder.contactos (idcontacto, fk_idusuario, fk_idusuario2) VALUES (?,?,?)")
	      .setParameter(1, null)
	      .setParameter(2, id1)
	      .setParameter(3, id2)
	      .executeUpdate();
	}
	
	@Override
	public void dislike(int id1, int id2) {
		// TODO Auto-generated method stub
		logger.info("--- En método dislike de la clase PerfilRpositoryImpl");
		entityManager.createNativeQuery("INSERT INTO lucatinder.descartes (idcontacto, fk_idusuario, fk_idusuario2) VALUES (?,?,?)")
	      .setParameter(1, null)
	      .setParameter(2, id1)
	      .setParameter(3, id2)
	      .executeUpdate();
	}
	
	/*public List<User> getFirstNames(String nombre) {
		Query query = entityManager.createNativeQuery("SELECT nombre FROM lucatinder.usuarios as u " +
                "WHERE u.nombre LIKE ?", User.class);
        query.setParameter(1, nombre + "%");
        return query.getResultList();
	}*/
	
	/*@Override
	public void login(int id) {
		
	}*/

	/*@Override
	public void listUsersGender(User user) {
		
		if(user.getGenero() == "h") {
			
		}
		else {
			
		}
		
	}*/
	
}
