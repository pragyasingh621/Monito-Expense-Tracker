package com.au.Expense.Tracker.Services;

import java.sql.Date;
import java.util.List;

import com.au.Expense.Tracker.DTO.ReportDTO;
import com.au.Expense.Tracker.Entities.Expense;

public interface ReportService {

	public List<ReportDTO> getReport(int id);
	
	public Long getTotalExpense(Long user_id);
	
	public Long getTodayExpense(Date date,Long user_id);
	
	public Long getMonthlyExpense(Long user_id,Date date);
}
