package com.rays.bundle;

import java.util.ResourceBundle;

public class TestApp {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.App");

		String driver = rb.getString("Driver");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");

		System.out.println(driver + "\n" + url + "\n" + username + "\n" + password);
	}

}
