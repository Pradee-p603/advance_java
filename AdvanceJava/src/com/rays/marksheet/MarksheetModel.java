package com.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {
	public List search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1");
     ResultSet rs = ps.executeQuery();
     
     ArrayList list = new ArrayList();
     
    while(rs.next()) {
    	MarksheetBean bean = new MarksheetBean();
    	bean.setId(rs.getInt(1));
    	bean.setName(rs.getString(2));
    	bean.setRollNo(rs.getInt(3));
    	bean.setPhysics(rs.getInt(4));
    	bean.setChemistry(rs.getInt(5));
    	bean.setMaths(rs.getInt(6));
    	
    	list.add(bean);
    }
		
		
		return list;
		
	}
	
	
	public MarksheetBean findById(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheets", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1 where id = ?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		while(rs.next()) {
			bean = new MarksheetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
	    	bean.setRollNo(rs.getInt(3));
	    	bean.setPhysics(rs.getInt(4));
	    	bean.setChemistry(rs.getInt(5));
	    	bean.setMaths(rs.getInt(6));
		}
		return bean;

		
	}

}
