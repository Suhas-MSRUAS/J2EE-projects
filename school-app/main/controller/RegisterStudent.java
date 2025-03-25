package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.StudentCRUD;
import com.js.dto.Student;
@WebServlet(value = "/register")

public class RegisterStudent extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		long phone = Long.parseLong(req.getParameter("phone"));
		
		
		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setAge(age);
		s.setPhone(phone);
		
		
		StudentCRUD sc = new StudentCRUD();
		boolean bo = sc.saveStudent(s);
		
		
		PrintWriter pw = resp.getWriter();
		if(bo) {
			pw.print("inserted successfully");
		}else {
			pw.print("failed to insert");
		}
	}
}
