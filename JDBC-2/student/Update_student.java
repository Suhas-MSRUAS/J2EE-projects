package com.js.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_student {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_2";
			String user ="root";
			String password ="root";
			String query ="update student set name = 'rajanna', age =30, email='rajanna@gmail.com', phone=9632178651 where id=2";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection(url, user, password);
			Statement s= c.createStatement();
			s.execute(query);
			c.close();
			System.out.println("updated");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
