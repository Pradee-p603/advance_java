package com.rays.Bundle;

import java.util.ResourceBundle;

public class TestApp { 
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.Bundle.app");
		System.out.println("Driver = " + rb.getString("Driver"));
		System.out.println("url = " + rb.getString("Url"));
		System.out.println("User = " + rb.getString("Url"));
		System.out.println("password = " + rb.getString("Password"));
		System.out.println("initial pool size = " + rb.getString("initial"));
	}

}
