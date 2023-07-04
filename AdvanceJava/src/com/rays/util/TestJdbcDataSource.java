package com.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rays.marksheet.MarksheetBean;

public class TestJdbcDataSource {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i < 25; i++) {
			System.out.println("connection = " + i);
			testDcp();
			System.out.println("==================================================");
		}
	}

	private static void testDcp() throws Exception {
		
		Connection conn = JdbcDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from Marksheet1 where id = 3");
		ResultSet rs = ps.executeQuery();
		MarksheetBean Bean = null;
		while (rs.next()) {
			Bean = new MarksheetBean();   
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));                       
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

	}

}
