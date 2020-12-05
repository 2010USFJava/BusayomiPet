package com.revature.driver;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.EmployeeDao;
import com.revature.model.Employee;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Employee emp = new Employee(0,"ade@bpt.net", "password", "Ade", "Geoge", 1, 1);
		//List<Employee>empList = new ArrayList<Employee>();
		//empList.add(emp);
		//insertEmployee(empList);
	//	EmployeeDao ed = new EmployeeDao();
		//Employee emp2 = new Employee(ed.findEmployeeById(2));
		EmployeeDao empdoa = new EmployeeDao();
		System.out.println(empdoa.getAllEmployee());
		System.out.println(empdoa.findEmployeeByFirstname("Busayomi"));
		System.out.println(empdoa.findEmployeeById(1));
		System.out.println(empdoa.findEmployeeByEmail("ade@bpt.net"));
		
	}

	/*public static void insertEmployee(List<Employee> empList) {
		EmployeeDao empdoa = new EmployeeDao();
		for(int i =0; i< empList.size(); i++) {
			empdoa.insertEmployee(empList.get(i));
		}
		System.out.println(empdoa.getAllEmployee());
		System.out.println(empdoa.findEmployeeByFirstname("Busayomi"));
		
	}*/
}
