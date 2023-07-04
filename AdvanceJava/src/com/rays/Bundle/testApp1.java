package com.rays.Bundle;

import java.util.ResourceBundle;

public class testApp1 {
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.Bundle.App_hi");
		System.out.println(rb.getString("Greetings"));
	}

}
