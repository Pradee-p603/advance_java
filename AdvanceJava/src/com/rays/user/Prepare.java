package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepare {
	public static void main(String[] args) throws Exception {
	//	testInsert();
		testupdate();
	}

	private static void testupdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update  Marksheet1 set name = 'bhandari' where id = 14");
		int i = ps.executeUpdate();
		System.out.println("data updated = " + i);

	}

	private static void testInsert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into Marksheet1 values (14, 'mahadev', 1106, 55, 55, 60)");
		int i = ps.executeUpdate();
		System.out.println("data inserted = " + i);

	}

}
