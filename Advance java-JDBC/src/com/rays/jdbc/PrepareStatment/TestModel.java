package com.rays.jdbc.PrepareStatment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestModel {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(2);
		bean.setFristName("Abhishek");
		bean.setLastName("Yadav");
		bean.setLogin("abhishek@gmail.com");
		bean.setPassword("Pass@1234");
		bean.setDob(sdf.parse("2005-10-30"));
		modal.add(bean);

	}
}
