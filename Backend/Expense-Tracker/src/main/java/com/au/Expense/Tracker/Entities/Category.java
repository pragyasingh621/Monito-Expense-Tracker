package com.au.Expense.Tracker.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Long categoryId;
	
	@Column(name="category")
	private String category;
	
	
	public Category(Long category_id, String category) {
		super();
		this.categoryId = category_id;
		this.category = category;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", category=" + category + "]";
	}
	

}
