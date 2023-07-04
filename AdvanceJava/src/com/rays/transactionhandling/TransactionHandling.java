package com.rays.transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		conn.setAutoCommit(false);
		// transaction handle
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into Marksheet1 values(14, 'mhadev', 1102, 65, 43, 66)");
		i = stmt.executeUpdate("insert into Marksheet1 values(15, 'parvati', 1102, 65, 43, 66)");
		i = stmt.executeUpdate("insert into Marksheet1 values(15, 'ganesh', 1102, 65, 43, 66)");
		System.out.println("data inserted = " + 1);
		conn.commit();
	}

}
