package com.au.Expense.Tracker.Entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Expenses_Detail")

public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "expense_amount")
	private Long expenseAmount;

	@Column(name = "shop")
	private String shop;

	@Column(name = "date_of_Expenses")
	private Date dateOfExpenses ;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	

	public Expense(Long id, Long expenseAmount, String shop, Date dateOfExpenses) {
		super();
		this.id = id;
		this.expenseAmount = expenseAmount;
		this.shop = shop;
		this.dateOfExpenses = dateOfExpenses;
//		this.user = new User()
	}

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Long expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public Date getDateOfExpenses() {
		return dateOfExpenses;
	}

	public void setDateOfExpenses(Date dateOfExpenses) {
		this.dateOfExpenses = dateOfExpenses;
	}

	public Long getCategoryId() {
		return category.getCategoryId();
	}

	public void setCategoryId(Long category_id) {
		this.category = new Category(category_id,"");
	}
	
	public Long getUserId() {
		return user.getUserId();
	}

	public void setUserId(Long user_id) {
		this.user = new User(user_id,"","","", null);
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", expenseAmount=" + expenseAmount + ", shop=" + shop + ", dateOfExpenses="
				+ dateOfExpenses + ", category=" + category.getCategoryId() + ", user=" + user.getUserId() + "]";
	}

	
}
