package com.au.Expense.Tracker.Services;

import java.util.List;

import org.json.simple.JSONObject;

import com.au.Expense.Tracker.Entities.User;

public interface UserService {
	
	public User addUser(User u);
	public List<User> getAllUser();
	public Long findByEmailAndPassword(String email,String password);

}
