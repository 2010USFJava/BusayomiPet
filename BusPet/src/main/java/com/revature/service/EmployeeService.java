package com.revature.service;

import java.util.List;

import com.revature.dao.EmployeeDao;
import com.revature.model.Employee;

public class EmployeeService {
	
	EmployeeDao empdao = new EmployeeDao();
	
	public boolean loginVerify(String email, String password) {//to login
		List<Employee> empList =  empdao.getAllEmployee();//it will pull all list of employee to verify
		boolean verify = false;
		
		for(Employee emp: empList) {
			if(emp.getEmail().equals(email)&& emp.getPassword ().equals(password)) {// to check if my login credential exist
				verify = true;
			}
		}
		return verify;
		
	}
	
	public Employee loginGetEmployee(String email, String password) {//to verify login 
		
		if(loginVerify(email,password)) {
			return empdao.findEmployeeByEmail(email);//give this back to user
		}
		return null;
	}
	
	public void insertNewEmployee(Employee emp) {//to insert new villain
		empdao.insertEmployee(emp);
	}

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

}
