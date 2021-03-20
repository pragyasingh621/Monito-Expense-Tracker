package com.au.Expense.Tracker.Services;

import java.util.List;

import com.au.Expense.Tracker.Entities.Expense;

public interface ExpenseService {
	
	public Expense addExpense(Expense expense);

    public List<Expense> getExpense();
}
