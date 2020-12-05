package com.revature.drive;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.SuperVillainDao;
import com.revature.model.SuperVillain;

public class MainDriver {

	public static void main(String[] args) {
		SuperVillain s1 = new SuperVillain("Carl","BeigePants", 50);
		SuperVillain s2 = new SuperVillain("Batman","Money", 100000000);
		SuperVillain s3 = new SuperVillain("DeadPool","Sarcasm", 8);
		List<SuperVillain> villList = new ArrayList<SuperVillain>();
		villList.add(s1);
		villList.add(s2);
		villList.add(s3);
		insertVills(villList);
		
	}
	
	public static void insertVills(List<SuperVillain> villList) {
		SuperVillainDao svdao = new SuperVillainDao();
		for(int i = 0; i<villList.size(); i++) {
			svdao.insertVillain(villList.get(i));
		}
		
		System.out.println(svdao.getAllVillains());
		System.out.println(svdao.getVillainByName("Carl"));
	}

	

}
