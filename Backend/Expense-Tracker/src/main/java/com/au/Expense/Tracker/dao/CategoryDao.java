package com.au.Expense.Tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.au.Expense.Tracker.Entities.Category;

public interface CategoryDao extends JpaRepository<Category,Long>{

}
