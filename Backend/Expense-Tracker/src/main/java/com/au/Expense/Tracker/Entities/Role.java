package com.au.Expense.Tracker.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "role")

public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private Long id;
	
	@Column(name="role_name")
	private String roleName;

	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + "]";
	}

}
