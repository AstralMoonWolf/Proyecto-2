package com.lucatinder.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Override
	public List<User> getFirstNamesLike(String username) {
		Query query = entityManager.createNativeQuery("SELECT em.* FROM spring_data_jpa_example.username as em " +
                "WHERE em.username LIKE ?", User.class);
        query.setParameter(1, username + "%");
        return query.getResultList();
	}
	
}
