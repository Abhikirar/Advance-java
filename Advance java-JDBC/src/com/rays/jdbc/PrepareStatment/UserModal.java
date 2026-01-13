package com.rays.jdbc.PrepareStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class UserModal {
	public void add(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement("insert into st_user values(?,?,?,?,?,?)");

		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getFristName());
		pstmt.setString(3, bean.getLastName());
		pstmt.setString(4, bean.getLogin());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));

		int i = pstmt.executeUpdate();

		System.out.println(i + "row affected data inserted");

		conn.close();
		pstmt.close();
	}

	public void Delete(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement("Delete from st_user where id = ?");

		pstmt.setInt(1, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println(i + "row affected data deleted");

		conn.close();
		pstmt.close();

	}
	// update query

	public void update(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement(
				"update st_user set firstName = ?, lastName = ?, login = ?, password = ?, dob = ? where id =?");

		pstmt.setString(1, bean.getFristName());
		pstmt.setString(2, bean.getLastName());
		pstmt.setString(3, bean.getLogin());
		pstmt.setString(4, bean.getPassword());
		pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setInt(6, bean.getId());

		int i = pstmt.executeUpdate();

		System.out.println(i + "row affected data  update");

		conn.close();
		pstmt.close();
	}
}
