package com.revature.daoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.dao.EmployeeDao;
import com.revature.model.Employee;
import com.revature.util.ConnFactory;

public class EmployeeDaoImpl implements EmployeeDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	
	
	@Override
	//public Employee findEmployeeById(int accountId) throws SQLException {
		public Employee findEmployeeById(int id)  {
		
		try {
			Connection conn= cf.getConnection();
			String sql ="select * from employee_table where employee_id =?";
			PreparedStatement ps;
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			Employee e = null;
			
			
			
		while(rs.next()) {
			//a = new Account(rs.getInt(1),rs.getDouble(2), rs.getString(3));
			e = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
		}
			return e;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	
}

	