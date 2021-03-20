package com.au.Expense.Tracker.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.Expense.Tracker.Entities.Category;
import com.au.Expense.Tracker.dao.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService{
	
    @Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategory() {
		return categoryDao.findAll();
	}

}
