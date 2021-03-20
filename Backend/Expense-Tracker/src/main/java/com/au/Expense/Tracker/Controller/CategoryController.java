package com.au.Expense.Tracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.Expense.Tracker.Entities.Category;
import com.au.Expense.Tracker.Services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/category")
	@CrossOrigin(origins = "*")
	public List<Category> getAllCategory(){
		  return this.categoryService.getAllCategory();
		  
	}

}
