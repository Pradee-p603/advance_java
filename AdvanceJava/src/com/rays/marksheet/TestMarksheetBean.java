package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetBean {
	public static void main(String[] args) throws Exception {
		//testSearch();
		testFindById();
	}

	private static void testFindById() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findById(6);
		if(bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getName());
			 System.out.print("\t"+bean.getRollNo());
			 System.out.print("\t"+bean.getPhysics());
			 System.out.print("\t"+bean.getChemistry());
			 System.out.println("\t"+bean.getMaths());
			 
		}else {
			System.out.println("Id does not exits.......!!!!");
		}
		
	}

	private static void testSearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		 List List = model.search();
		 
		 Iterator it = List.iterator();
		 while(it.hasNext()) {
			 MarksheetBean bean =(MarksheetBean) it.next();
			 System.out.print(bean.getId());
			 System.out.print("\t"+bean.getName());
			 System.out.print("\t"+bean.getRollNo());
			 System.out.print("\t"+bean.getPhysics());
			 System.out.print("\t"+bean.getChemistry());
			 System.out.println("\t"+bean.getMaths());
			 
		 }
		 
		
	}


}
