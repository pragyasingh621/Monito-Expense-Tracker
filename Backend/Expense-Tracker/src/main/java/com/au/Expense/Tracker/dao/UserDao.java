package com.au.Expense.Tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.au.Expense.Tracker.Entities.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	 @Query(value = "SELECT user_id FROM user u WHERE u.email = ?1 AND u.password = ?2 ",
	            nativeQuery=true
	    ) 
	public Long findByEmailAndPassword(String email,String password);
}
