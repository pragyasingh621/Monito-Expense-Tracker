package com.au.Expense.Tracker.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "user")
//@SecondaryTable(name="role",
//pkJoinColumns=@PrimaryKeyJoinColumn(name="role_id"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@ManyToOne()
	@JoinColumn(name = "role_id")
	private Role role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String userName, String email, String password,Long role_id) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
//		this.role = new Role(role_id,"");
	}

	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getRoleId() {
		return role.getId();
	}

	public void setRoleId(Long role_id) {
		this.role = new Role(role_id,"");
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", role=" + role.getId() + "]";
	}

	

}
