package com.rays.transactionhandling;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rays.util.JdbcDataSource;

public class TransactionHandlingpractice {
	public static void main(String[] args) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		// transaction handle
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into Marksheet1 values(27, 'mhadev', 1102, 65, 43, 66)");
		i = stmt.executeUpdate("insert into Marksheet1 values(28, 'parvati', 1102, 65, 43, 66)");
		i = stmt.executeUpdate("insert into Marksheet1 values(29, 'ganesh', 1102, 65, 43, 66)");
		System.out.println("data inserted = " + 1);
		conn.commit();
	}

		
	}



