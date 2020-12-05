package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.SuperVillain;

public class SuperVillainDao {

	public SuperVillainDao() {
		// TODO Auto-generated constructor stub
	}

	static {
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	private String url="jdbc:postgresql://java2020usf.c45acbch09dv.us-east-2.rds.amazonaws.com:5432/postgres?currentSchema=supervillaindb";
	private String username="vill";
	private String password="password";
	
	public List<SuperVillain> getAllVillains(){
		List<SuperVillain> villList = new ArrayList<SuperVillain>();
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username, this.password);
			String sql = "SELECT * FROM SuperVillain";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				villList.add(new SuperVillain(rs.getString(1),rs.getString(2), rs.getInt(3)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return villList;
	}
	
	public void insertVillain(SuperVillain vill) {
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username, this.password);
			String sql = "INSERT INTO SuperVillain values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vill.getName());
			ps.setString(2, vill.getSuperpower());
			ps.setInt(3, vill.getBounty());
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public SuperVillain getVillainByName(String name) {
		SuperVillain vill = new SuperVillain();
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username, this.password);
			String sql = "SELECT * FROM SuperVillain WHERE name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vill.setName(rs.getString(1));
				vill.setSuperpower(rs.getString(2));
				vill.setBounty(rs.getInt(3));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return vill;
	}

}
