package com.au.Expense.Tracker.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.Expense.Tracker.Entities.Role;
import com.au.Expense.Tracker.dao.RoleDao;

@Service
public class RoleServiceImpl implements RoleService {
	

	@Autowired
	private RoleDao roleDao;
	

	@Override
	public List<Role> getAllRole() {
		return roleDao.findAll();
	}

}
