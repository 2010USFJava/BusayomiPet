package com.revature.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.SuperVillain;

public class VillainController {

	//this method is the helper to get current vill
		public static void getSessionVillain(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
			SuperVillain vill =  (SuperVillain) req.getSession().getAttribute("currentvill");
			res.getWriter().write(new ObjectMapper().writeValueAsString(vill));
}
}