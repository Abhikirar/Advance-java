package com.rays.jdbc.PrepareStatment;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestModel {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testdelete();
		// testupdate();
		// findByLogin();
		// pk();
//		authencation();
		testsearch();

	}

	// Add query
	private static void testadd() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(7);
		bean.setFirstName("Ranu");
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

	// update query
	private static void testupdate() throws Exception {
		UserModal modal = new UserModal();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		bean.setId(6);
		bean.setFirstName("ram");
		bean.setLastName("yadav");
		bean.setLogin("yadav@gmail.com");
		bean.setPassword("yadav@1234");
		bean.setDob(sdf.parse("2003-02-21"));
		modal.update(bean);
	}

	// query testFindBylogin

	private static void findByLogin() throws Exception {
		UserModal model = new UserModal();
		UserBean bean = new UserBean();

		bean = model.findByLogin("Lucky@gmail.com");

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());

	}

	private static void pk() throws Exception {
		UserModal model = new UserModal();
		UserBean bean = new UserBean();

		bean = model.pk(1);

		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());

	}

	private static void authencation() throws Exception {
		UserModal model = new UserModal();
		UserBean bean = new UserBean();

		bean = model.authencation("vyas@gmail.com", "vyas@1234");

		if (bean == null) {
			System.out.println("invalid");
		} else {

			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());

		}
	}

	private static void testsearch() throws Exception {
		UserModal model = new UserModal();
		UserBean bean = new UserBean();

		bean.setFirstName("Abhishek");

		List list = model.search(bean);

		Iterator<UserBean> it = list.iterator();

		while (it.hasNext()) {
			bean = it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLogin());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
		}
	}
}
