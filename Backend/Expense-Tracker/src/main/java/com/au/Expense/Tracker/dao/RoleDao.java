package com.au.Expense.Tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.au.Expense.Tracker.Entities.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}
