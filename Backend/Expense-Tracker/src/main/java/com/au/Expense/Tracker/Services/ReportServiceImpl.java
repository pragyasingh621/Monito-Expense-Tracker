package com.au.Expense.Tracker.Services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.Expense.Tracker.DTO.ReportDTO;
import com.au.Expense.Tracker.Entities.Expense;
import com.au.Expense.Tracker.dao.ReportDao;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportDao reportDao;
	
	@Override
	public List<ReportDTO> getReport(int id) {
		System.out.println("ID is "+id);
		return this.reportDao.getReport(id);

}
	@Override
	public Long getTotalExpense(Long user_id) {
		return this.reportDao.getTotalExpense(user_id);
	}
	@Override
	public Long getTodayExpense(Date date,Long user_id) {
		
		return this.reportDao.getTodayExpense(date,user_id);
	}
	@Override
	public Long getMonthlyExpense(Long user_id,Date date) {
		
		return this.reportDao.getMonthlyExpense(user_id,date);
	}
}