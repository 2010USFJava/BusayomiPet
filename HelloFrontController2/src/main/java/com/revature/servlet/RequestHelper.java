package com.revature.servlet;


	import javax.servlet.http.HttpServletRequest;

	import com.revature.controller.HomeController;
	import com.revature.controller.LoginController;

	public class RequestHelper {

		public static String process(HttpServletRequest req) {
			
			System.out.println(req.getRequestURI());//came frm HttpServletReq obj
			switch(req.getRequestURI()) {
			
			
			case "/HelloFrontController2/login.change":
				System.out.println("in login.change rhelper");
				return LoginController.login(req);
				
			case "/HelloFrontController2/home.change":
				System.out.println("in home.change rhelper");
				return HomeController.home(req);
				
			default:
				System.out.println("in default case");
				return "resources/html/unsuccessfullogin.html";
				
			}
			
		}

	}