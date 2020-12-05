package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Employee;

public class EmployeeController {

//stores info about current login (user/password)session so that you can pass info page to page and you have to re-get the info every single time
	public static void getSessionEmployee(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
	//request with variable called ("currentemp")
		Employee emp =  (Employee) req.getSession().getAttribute("currentemp");
		//response in json object
		res.getWriter().write(new ObjectMapper().writeValueAsString(emp));
}
}
