package com.rays.transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into Marksheet1 values(17, 'mhadev', 1102, 65, 43, 66)");
			i = stmt.executeUpdate("insert into Marksheet1 values(18, 'parvati', 1102, 65, 43, 66)");
			i = stmt.executeUpdate("insert into Marksheet1 values(19, 'ganesh', 1102, 65, 43, 66)");
			System.out.println("data inserted = " + 1);
			conn.commit();

		} catch (Exception e) {
			conn.rollback();

		}finally {
			conn.close();
			
		}

	}

}
