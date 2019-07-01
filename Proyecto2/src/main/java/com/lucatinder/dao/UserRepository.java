package com.lucatinder.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucatinder.model.User;

/**
 * 
 * @author Raul
 * @version 1
 * Esta clase tiene la implementacion JPA
 */

@Repository
public interface UserRepository extends JpaRepository<User,Integer>,UserRepositoryCustom{

	

}
