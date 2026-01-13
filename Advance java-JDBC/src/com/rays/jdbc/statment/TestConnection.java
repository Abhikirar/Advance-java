package com.rays.jdbc.statment;
import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // load the Driver class in class loader
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		System.out.println("java is connected with mysql successfully....");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from st_user");

		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("FristName" + rs.getString(2));
			System.out.println("LastName: " + rs.getString(3));
			System.out.println("Login " + rs.getString(4));
			System.out.println("Password " + rs.getString(5));
			System.out.println("Date: " + rs.getDate(6));

		}
		conn.close();

	}

}
