package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDynamic {
	public static void main(String[] args) throws Exception {
		// testInsert();
		// testUpdate();
		testDelete();

	}

	private static void testDelete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from marksheet1 where id = ?");
		ps.setInt(1, 20);
		int i = ps.executeUpdate();
		System.out.println("data deleted = " + i);

	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement(
				"update Marksheet1 set name = ?, rollno = ?, physics = ? , chemistry = ?, maths = ? where id = ? ");
		ps.setString(1, "bahubali");
		ps.setInt(2, 1112);
		ps.setInt(3, 66);
		ps.setInt(4, 55);
		ps.setInt(5, 66);
		ps.setInt(6, 2);
		int i = ps.executeUpdate();
		System.out.println("data updated = " + i);

	}

	private static void testInsert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into Marksheet1 values(?,?,?,?,?,?)");
		ps.setInt(1, 20);
		ps.setString(2, "hanuman");
		ps.setInt(3, 1111);
		ps.setInt(4, 50);
		ps.setInt(5, 55);
		ps.setInt(6, 88);

		int i = ps.executeUpdate();
		System.out.println("data inserted = " + i);

	}

}
