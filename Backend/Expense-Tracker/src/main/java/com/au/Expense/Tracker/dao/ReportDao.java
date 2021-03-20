package com.au.Expense.Tracker.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.au.Expense.Tracker.DTO.ReportDTO;
import com.au.Expense.Tracker.Entities.Expense;

public interface ReportDao extends JpaRepository<Expense, Long> {
	
	
	@Query(value = "select sum(e.expense_amount),c.category from category c inner join expenses_detail e on c.category_id=e.category_id where e.user_id=?1 group by c.category_id",
            nativeQuery=true)

    public List<ReportDTO> getReport(int user_id);
	
	@Query(value = "select sum(e.expense_amount) from expenses_detail e where e.user_id = ?1",
		    nativeQuery=true)
	public Long getTotalExpense(Long user_id);
	
	@Query(value = "select sum(e.expense_amount) from expenses_detail e where e.date_of_expenses = ?1 AND e.user_id= ?2",
		    nativeQuery=true)
	public Long getTodayExpense(Date date,Long user_id);
		
	@Query(value = "select sum(e.expense_amount) ,e.date_of_expenses from expenses_detail e where e.user_id=?1 AND e.date_of_expenses < ?2 group by e.date_of_expenses",
            nativeQuery=true)
	public Long getMonthlyExpense(Long user_id,Date date);
}