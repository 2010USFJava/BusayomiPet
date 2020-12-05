package com.revature.controller;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.SuperVillain;
import com.revature.service.VillainService;

public class LoginController {

	

		static VillainService vServ = new VillainService();// 
		
		
		//controls login page for security purpose
		public static String login(HttpServletRequest req) {
			if(!req.getMethod().equals("POST")) {//to check method use
				return "resources/html/index.html";
			}
			
			String name = req.getParameter("villainname");//name
			String superpower = req.getParameter("superpower");//password
			SuperVillain vill = vServ.loginGetVillain(name, superpower);
			if(vill==null) {
				return "wrongcreds.change";//direct to wrong login page
			}else {
				req.getSession().setAttribute("currentvill", vill);// currentvill equals to vill
				return "home.change";
			}
			
		}
}
