package com.js.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class GetAllPersons {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_1";
			String user="root";
			String password="root";
			String query = "select * from person";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url, user, password);
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) {
				System.out.println("Person Id : "+rs.getInt("id"));
				System.out.println("Person Name : "+rs.getString(2));
				System.out.println("Person Age : "+rs.getInt("age"));
				System.out.println("--------------------");
			}
			c.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}

}



