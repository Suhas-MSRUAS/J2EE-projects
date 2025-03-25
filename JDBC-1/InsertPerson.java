package com.js.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertPerson {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_1";
		String user ="root";
		String password = "root";
		String query = "insert into person values(1, 'uday', 18)";
		String query1 = "insert into person values(2, 'suhas', 22)";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection(url, user, password);
		Statement s = c.createStatement();
		s.execute(query1);
		c.close();
		System.out.println("Inserted");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}