package com.vti.template.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * This class is test JDBC Connection.
 * 
 * @Description: .
 * @author: CTAnh
 * @create_date: Dec 7, 2019
 * @version: 1.0
 * @modifer: CTAnh
 * @modifer_date: Dec 7, 2019
 */
public class TestJDBC {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/JavaFinalTest?autoReconnect=true&useSSL=false&characterEncoding=latin1";

		try {
			// connect database
			// username & password
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "root");

			Class.forName("com.mysql.cj.jdbc.Driver");

			// connect
			Connection connection = DriverManager.getConnection(jdbcUrl, properties);
			System.out.println("Connect successful!");

			// select data
			Statement statement = connection.createStatement();
			// execute Query
			ResultSet result = statement.executeQuery("SELECT * FROM Recruiment");
			while (result.next()) {
				System.out.println("Code: " + result.getInt("Code"));
				System.out.println("Position: " + result.getString("Position"));
				System.out.println("RecruimentPackage: " + result.getString("RecruimentPackage"));
			}

			// select prepared
			PreparedStatement prepared = connection.prepareStatement("SELECT * FROM Recruiment r WHERE r.Code = ?");

			// set parameters to statement
			prepared.setInt(1, 12803);

			// execute Query Update
			result = prepared.executeQuery();
			System.out.println("***************************************");
			while (result.next()) {
				System.out.println("Code: " + result.getInt("Code"));
				System.out.println("Position: " + result.getString("Position"));
				System.out.println("RecruimentPackage: " + result.getString("RecruimentPackage"));
			}

			// insert
			prepared = connection.prepareStatement(
					"INSERT INTO Candidate (FirstName, LastName, Address, Phone, Email, Candidate_type, "
							+ "Majors, Semester, University_Name, BirthDate) "
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			// set 1 param to statement
			prepared.setString(1, "nguyen");
			prepared.setString(2, "duy");
			prepared.setString(3, "nam dinh");
			prepared.setString(4, "123456789");
			prepared.setString(5, "duy@vti.com.vn");
			prepared.setInt(6, 1);
			prepared.setString(7, "Java");
			prepared.setInt(8, 1);
			prepared.setString(9, "national university");
			prepared.setString(10, "2013-06-18");
			// execute Query Update
			int resultInt = prepared.executeUpdate();
			System.out.println("resultInt: " + resultInt);
			// close connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
