package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Employee;

public class EmployeeDao {

	static {
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
	}
}
		private String url ="jdbc:postgresql://java2020usf.c45acbch09dv.us-east-2.rds.amazonaws.com:5432/buspetp1?currentSchema=buspettech";
		private String username="buspet";
		private String password="password";
	
		public List<Employee> getAllEmployee(){
			List<Employee> employeeList = new ArrayList<Employee>();
			try {
				Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
				String sql="SELECT * FROM employee_table";
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					employeeList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7)));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			return employeeList;
			
		}
		
		public void insertEmployee(Employee emp) {
			try {
				Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
				String sql="INSERT INTO employee_table values(?,?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, emp.getId());
				ps.setString(2, emp.getEmail());
				ps.setString(3, emp.getPassword());
				ps.setString(4, emp.getFirstname());
				ps.setString(5, emp.getLastname());
				ps.setInt(6, emp.getDepartmentId());
				ps.setInt(7, emp.getRole());
				ps.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public Employee findEmployeeById(int id)  {

			try {
				Connection conn= DriverManager.getConnection(this.url, this.username, this.password);
				String sql ="SELECT * FROM employee_table where employee_id =?";
				PreparedStatement ps;
				ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
				Employee emp = null;
				
				while(rs.next()) {
				
				emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
			}
				return emp;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
	
public Employee findEmployeeByFirstname(String firstname)  {
			Employee emp = new Employee();
			try {
				Connection conn= DriverManager.getConnection(this.url, this.username, this.password);
				String sql ="SELECT * FROM employee_table where fname =?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, firstname);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					emp.setId(rs.getInt(1));
					emp.setEmail(rs.getString(2));
					emp.setPassword(rs.getString(3));
					emp.setFirstname(rs.getString(4));
					emp.setLastname(rs.getString(5));
					emp.setDepartmentId(rs.getInt(6));
					emp.setRole(rs.getInt(7));
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return emp;
		}
		
public Employee findEmployeeByEmail(String email)  {
	Employee emp = new Employee();
	try {
		Connection conn= DriverManager.getConnection(this.url, this.username, this.password);
		String sql ="SELECT * FROM employee_table where email =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			emp.setId(rs.getInt(1));
			emp.setEmail(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setFirstname(rs.getString(4));
			emp.setLastname(rs.getString(5));
			emp.setDepartmentId(rs.getInt(6));
			emp.setRole(rs.getInt(7));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return emp;
}



	public EmployeeDao() {
		// TODO Auto-generated constructor stub
	}

}
