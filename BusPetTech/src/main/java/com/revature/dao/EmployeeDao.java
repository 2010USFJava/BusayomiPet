package com.revature.dao;

import java.sql.SQLException;

import com.revature.model.Employee;

public interface EmployeeDao {

	//public Employee findEmployeeById(int accountId) throws SQLException;
	public Employee findEmployeeById(int id);
}
