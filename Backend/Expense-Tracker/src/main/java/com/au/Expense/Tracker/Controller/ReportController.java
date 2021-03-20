package com.au.Expense.Tracker.Controller;

import java.sql.Date;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.au.Expense.Tracker.Services.ReportService;
import com.au.Expense.Tracker.DTO.ReportDTO;
import com.au.Expense.Tracker.Entities.Expense;
import com.au.Expense.Tracker.Services.ReportService;

@RestController
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/report")
	@CrossOrigin(origins="*")
	public List<ReportDTO> getReport(@RequestParam("id") int id) {	
//		JSONObject obj = new JSONObject();
//		obj.put("data", reportService.getReport(id));
		return  reportService.getReport(id);
	}
	
	@GetMapping("/totalExpense")
	@CrossOrigin(origins="*")
	public Long getTotalExpense(@RequestParam("id") Long id) {
	return this.reportService.getTotalExpense(id);
	}
	
	@GetMapping("/todayExpense")
	@CrossOrigin(origins="*")
	public Long getTodayExpense(@RequestParam("date") Date date,@RequestParam("id") Long id) {
		return this.reportService.getTodayExpense(date,id);
	}
	
	@GetMapping("/monthlyExpense")
	@CrossOrigin(origins="*")
	public Long getMonthlyExpense(@RequestParam("id") Long id,@RequestParam("date") Date date) {
		return this.reportService.getMonthlyExpense(id,date);
	}
}
