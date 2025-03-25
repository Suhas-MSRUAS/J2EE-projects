<%@page import="com.js.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="silver">
	<h1>STUDENT DETAILS</h1>
	<table border="5px" cellSpacing="10px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Delete</th>
		</tr>


		<%
			List<Student> students = (List) request.getAttribute("list");
			for (Student s : students) {
		%>
		<tr>
		<td><%=s.getName() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getEmail() %></td>
		<td><%=s.getAge() %></td>
		<td><%=s.getPhone() %></td>
		<td><a href="delete?id=<%=s.getId()%>">delete</a></td>
		</tr>
		
		
		
		
		<%
			}
		%>
		



	</table>
	
	<form action="welcome.jsp">
	<input type="submit" value = "Home">
	</form>
	
</body>
</html>