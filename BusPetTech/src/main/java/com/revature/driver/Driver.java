package com.revature.driver;

import com.revature.daoImpl.EmployeeDaoImpl;
import com.revature.model.Employee;

public class Driver {

	EmployeeDaoImpl edi = new EmployeeDaoImpl();
	Employee e = new Employee(edi.findEmployeeById(2));
}