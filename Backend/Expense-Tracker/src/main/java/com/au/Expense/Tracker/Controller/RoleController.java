package com.au.Expense.Tracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.Expense.Tracker.Entities.Role;
import com.au.Expense.Tracker.Services.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role")
	@CrossOrigin(origins = "*")
	public List<Role> getAllRole(){
		  return this.roleService.getAllRole();
		  
	}

}
