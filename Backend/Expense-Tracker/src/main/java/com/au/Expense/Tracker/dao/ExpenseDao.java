package com.au.Expense.Tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.au.Expense.Tracker.Entities.Expense;

public interface ExpenseDao extends JpaRepository<Expense, Long> {

}
