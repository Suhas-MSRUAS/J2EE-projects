package com.js.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Get_studentby_name {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_2";
			String user="root";
			String password="root";
			String query = "select * from student where name='suhas'";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url, user, password);
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) {
				System.out.println("student Id : "+rs.getInt("id"));
				System.out.println("student Name : "+rs.getString("name"));
				System.out.println("student Age : "+rs.getInt("age"));
				System.out.println("email: "+rs.getString("email"));
				System.out.println("phone number : "+rs.getLong("phone"));
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



