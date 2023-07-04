package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDynamic3 {
	public static void main(String[] args) throws Exception {
		testInsert(20,"hanumanji", 1110, 80,90,100);
		
	}

	private static void testInsert(int id, String name, int rollno, int physics, int chemistry, int maths) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into marksheet1 values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, rollno);
		ps.setInt(4, physics);
		ps.setInt(5,chemistry);
		ps.setInt(6, maths);
		
		int i = ps.executeUpdate();
		System.out.println("Data inserted = " + i);
		
		
		
	}

}
