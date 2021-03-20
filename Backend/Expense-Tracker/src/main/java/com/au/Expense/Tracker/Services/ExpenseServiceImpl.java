package com.au.Expense.Tracker.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.Expense.Tracker.Entities.Expense;
import com.au.Expense.Tracker.dao.ExpenseDao;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	private ExpenseDao expenseDao;

	@Override
	public Expense addExpense(Expense expense) {
		expenseDao.save(expense);
		return expense;
	}
	
	@Override
	public List<Expense> getExpense() {
		return expenseDao.findAll();

}
}