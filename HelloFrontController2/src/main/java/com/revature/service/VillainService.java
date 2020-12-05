package com.revature.service;

import java.util.List;

import com.revature.dao.SuperVillainDao;
import com.revature.model.SuperVillain;

public class VillainService {
	
	SuperVillainDao svdao = new SuperVillainDao();
	
	public boolean loginVerify(String name, String superpower) {//to login
		List<SuperVillain> villList =  svdao.getAllVillains();
		boolean verify = false;
		
		for(SuperVillain vill: villList) {
			if(vill.getName().equals(name)&& vill.getSuperpower().equals(superpower)) {
				verify = true;
			}
		}
		return verify;
		
	}
	
	public SuperVillain loginGetVillain(String name, String superpower) {//to verify login 
		
		if(loginVerify(name,superpower)) {
			return svdao.getVillainByName(name);//give this back to user
		}
		return null;
	}
	
	public void insertNewVillain(SuperVillain vill) {//to insert new villain
		svdao.insertVillain(vill);
	}

	public VillainService() {
		// TODO Auto-generated constructor stub
	}

}