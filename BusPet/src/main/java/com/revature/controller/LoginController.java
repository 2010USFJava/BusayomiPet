package com.revature.controller;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Employee;
import com.revature.service.EmployeeService;



public class LoginController {

	
static EmployeeService empServ = new EmployeeService();// 
		
		
		//controls login page for security purpose to make sure all request are post
		public static String login(HttpServletRequest req) {
			
			if(!req.getMethod().equals("POST")) {//to check method use
				return "resources/html/index.html";
			}
			
			String email = req.getParameter("employeeemail");//email
			String password = req.getParameter("password");//password
			Employee emp = empServ.loginGetEmployee(email, password);
			if(emp==null) {
				return "wrongcreds.change";//direct to wrong login page
			}else {
				req.getSession().setAttribute("currentemp",emp);// currentvill equals to vill
				return "home.change";
			}
			
		}
}
