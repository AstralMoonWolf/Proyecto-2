package com.lucatinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucatinder.model.User;
@Repository
public interface IUserRepository extends JpaRepository<User,Integer>,IUserRepositoryCustom{

}
