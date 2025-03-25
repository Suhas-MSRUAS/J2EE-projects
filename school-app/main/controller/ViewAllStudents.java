package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.StudentCRUD;
import com.js.dto.Student;
@WebServlet(value = "/view")
public class ViewAllStudents extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentCRUD sc = new StudentCRUD();
		List<Student> students = sc.getAllStudents();
		if(students.size()>0) {
			RequestDispatcher rs = req.getRequestDispatcher("viewall.jsp");
			req.setAttribute("list", students);
			rs.forward(req, resp);
			
		}else {
			PrintWriter pw = resp.getWriter();
			pw.print("no students registered");
		}
		
	}
}
