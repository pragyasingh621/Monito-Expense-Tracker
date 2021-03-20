package com.au.Expense.Tracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.au.Expense.Tracker.Services.ExpenseService;
import com.au.Expense.Tracker.Entities.Expense;


@RestController
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	
	@PostMapping("/expense")
	@CrossOrigin(origins = "*")
	public Expense addExpense(@RequestBody Expense expense) {
		return this.expenseService.addExpense(expense);
	}

	
	@GetMapping("/expense")
	@CrossOrigin(origins = "*")
	public List<Expense> getExpense() {
		return this.expenseService.getExpense();

	}
}
