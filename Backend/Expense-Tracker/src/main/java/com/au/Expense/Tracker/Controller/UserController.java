package com.au.Expense.Tracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.au.Expense.Tracker.Services.*;
import com.au.Expense.Tracker.Entities.Login;
import com.au.Expense.Tracker.Entities.User;

import java.util.List;

import org.json.simple.JSONObject;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;

//	@GetMapping("/home")
//	@CrossOrigin(origins = "*")
//	public JSONObject home() {
//		JSONObject obj = new JSONObject();
//        obj.put("msg", "Hello World");
//		return obj;
//	}
	
	@PostMapping("/signUp")
	@CrossOrigin(origins = "*")
	public User addUser(@RequestBody User u) {
		
		return this.userService.addUser(u);
	}
	
	@GetMapping("/User")
	@CrossOrigin(origins = "*")
	public List<User> getAllUser(){
		  return this.userService.getAllUser();
		  
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "*")
	public Long findIdByEmailAndPassword(@RequestBody Login obj) {
		
		Long id =  this.userService.findByEmailAndPassword(obj.getEmail(),obj.getPassword());
		System.out.println(obj);
		return id;
	}
}
