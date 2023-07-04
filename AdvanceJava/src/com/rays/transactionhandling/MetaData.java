package com.rays.transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class MetaData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Marksheets", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Marksheet1");
		ResultSetMetaData rsmt = rs.getMetaData();
		
		System.out.println("catelog name = " + rsmt.getCatalogName(1));
		System.out.println("table name = " + rsmt.getTableName(1));
		
		int ColumnCount = rsmt.getColumnCount();
		System.out.println("total count = " + ColumnCount);
	
		for (int i = 1; i <= ColumnCount; i++) {
			System.out.println("Column :" + (i));
			System.out.println("Label :" + rsmt.getColumnLabel(i));
			System.out.println("Name :" + rsmt.getColumnName(i));
			System.out.println("type :" + rsmt.getColumnType(i));
			System.out.println("Size :" + rsmt.getColumnDisplaySize(i));
			System.out.println("precision : " + rsmt.getPrecision(i));
			System.out.println();
			
		}
		
		
	}

}
