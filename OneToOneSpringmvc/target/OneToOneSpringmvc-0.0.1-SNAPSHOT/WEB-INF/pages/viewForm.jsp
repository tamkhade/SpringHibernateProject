<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		<h3>
			<a href="link1">New Student</a>
		</h3>
		<table border="1">

			<th>First Name</th>
			<th>Last Name</th>
			<th>Section</th>
			<th>Street</th>
			<th>City</th>
			<th>Country</th>
			<th>Action</th>

			<c:forEach var="student" items="${studentList}">
				<tr>

					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.section}</td>
					<td>${student.address.street}</td>
					<td>${student.address.city}</td>
					<td>${student.address.country}</td>
					<td><a href="editStudent?id=${student.id}">Edit</a> <a
						href="deleteStudent?id=${student.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
