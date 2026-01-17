package com.rays.jdbc.CallableStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class TestCallableStatment {
	public static void main(String[] args) throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.App");
		
		String driver = rb.getString( "Driver");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String pasword = rb.getString( "password");
		

		Class.forName(driver);

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		CallableStatement ctmt = conn.prepareCall("{CALL seachById()}");
		ResultSet rs = ctmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getDate(6));
			}
		ctmt.close();
		conn.close();

	}

}
