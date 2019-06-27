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
public interface IUserRepository extends JpaRepository<User,Integer>,IUserRepositoryCustom{

	public void login(int id);

	public void list(User genero);

}
