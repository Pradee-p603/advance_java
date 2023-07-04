package com.rays.advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) throws Exception {
	//testInsert();
	//testUpdate();
	testDelete();
	
}

private static void testDelete() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheets", "root", "root");
	Statement st = conn.createStatement();
	int i = st.executeUpdate("delete from marksheet1 where id = 14"); 
	System.out.println("data Deleted = "+ i);
	
	
}

private static void testUpdate() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheets", "root", "root");
	Statement st = conn.createStatement();
	int i = st.executeUpdate("update marksheet1 set name = 'abhilash' where id = 2");
	System.out.println("data update = "+ i);
	
	
	
}

private static void testInsert() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheets", "root", "root");
	Statement st = conn.createStatement();
	int i = st.executeUpdate("insert into marksheet1 values(7, 'ram', 1106, 43, 66, 78)");
	System.out.println("data inserted = "+ i);
	
	 
	
}
}
