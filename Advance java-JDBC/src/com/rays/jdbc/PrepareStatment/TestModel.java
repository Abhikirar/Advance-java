package com.rays.jdbc.PrepareStatment;

import java.text.SimpleDateFormat;

public class TestModel {
	public static void main(String[] args) throws Exception {
		 testadd();
		// testdelete();
		//testupdate();

	}

	// Add query
	private static void testadd() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(7);
		bean.setFristName("Ranu");
		bean.setLastName("Vyas");
		bean.setLogin("vyas@gmail.com");
		bean.setPassword("vyas@1234");
		bean.setDob(sdf.parse("2002-02-21"));
		modal.add(bean);

	}
	// delete query

	private static void testdelete() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();

		bean.setId(2);

		modal.Delete(bean);
	}

	private static void testupdate() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(6);
		bean.setFristName("ram");
		bean.setLastName("yadav");
		bean.setLogin("yadav@gmail.com");
		bean.setPassword("yadav@1234");
		bean.setDob(sdf.parse("2003-02-21"));
		modal.update(bean);
	}
}
