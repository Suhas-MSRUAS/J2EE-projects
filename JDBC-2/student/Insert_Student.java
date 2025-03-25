package com.js.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Student {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_2";
		String user ="root";
		String password = "root";
		String query = "insert into student values(4, 'thunder', 26, 'thunder@gmail.com', 8413446896)";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection(url, user, password);
		Statement s = c.createStatement();
		s.execute(query);
		c.close();
		System.out.println("Inserted");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}


