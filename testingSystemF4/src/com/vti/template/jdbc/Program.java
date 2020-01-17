package com.vti.template.jdbc;

/**
 * This class is program for JDBC.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class Program {
	public static void main(String[] args) {
		Function function = new Function();
		//function.login();
		
		function.getUserByID();
		function.importListUser();
	}
}
