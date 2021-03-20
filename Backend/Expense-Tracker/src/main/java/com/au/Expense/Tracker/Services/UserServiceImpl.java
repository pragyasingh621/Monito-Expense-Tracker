package com.au.Expense.Tracker.Services;

import java.util.List;
import org.json.simple.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.Expense.Tracker.Entities.User;
import com.au.Expense.Tracker.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
		
	@Override
	public User addUser(User user) {
	  return userDao.save(user);

	}

	@Override
	public List<User> getAllUser() {
		return userDao.findAll();
		
		
	}
	@Override
	public Long findByEmailAndPassword(String email,String password) {
		Long id =  userDao.findByEmailAndPassword(email,password);
		return id;
	}

}
