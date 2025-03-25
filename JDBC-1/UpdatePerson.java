package com.js.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_1";
			String user="root";
			String password="root";
			String query = "update person set name ='udaalbasya', age = 30 where id=3";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url, user, password);
			Statement s = c.createStatement();
			s.execute(query);
			c.close();
			System.out.println("updated");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

}



