package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/first_app_db";
	String username = "root";
	String password = "123prithvi";
	String sql = "SELECT * FROM login WHERE uname=? AND pass=?";

	public boolean checkCredentials(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public boolean registerUser(String uname,String pass) {
		
		int res;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement stmt=con.prepareStatement(
					"INSERT INTO login (uname, pass) values(?, ?)");
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			res = stmt.executeUpdate();
			return res > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
