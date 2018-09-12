<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<form:form modelAttribute="student" class="form-horizontal"
	name="cart" />

<title>shopping mall</title>
</head>
<body>
	<center>
		<h1>cart</h1>

		<form:form modelAttribute="Userform" method="post" action="insert">


			<form:input type="text" path="userId" readonly="true" />
			<br>
			<br>
				userName:<form:input path="userName" type="text" />
			<br>
			<br>

			<c:forEach items="${Userform.list}" var="items" varStatus="row">
				<form:input type="text" path="list[${row.index}].itemId"
					readonly="true" />
				itemsName:<form:input path="list[${row.index}].itemsName"
					type="text" />
					
					
					items price:<form:input path="list[${row.index}].price"
					type="text" />
			</c:forEach>
			<br>
			<input type="submit" value="submit" />
		</form:form>

		<br> <br>
		<%-- <table border="0" bordercolor="red">
			<thead>
				<tr>
					<th>StudentID</th>
					<th>StudentName</th>
					<th>College</th>
					<th>edit</th>
					<th>delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${collegeList}" var="college">

					<c:forEach items="${college.studentList}" var="student">
						<td>${student.studentName }</td>
					</c:forEach>

					<tr>
						<td>${college.collegeId}</td>
						<td>${college.collegeName}</td>
						<td><select>

						</select></td>
						<td><a href="edit?id=${college.collegeId}">edit</a></td>
						<td><a href="delete?id=${college.collegeId}">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table> --%>

		<table border="0" bordercolor="red">
			<head>
				<tr>
				
					<th>ItemsName</th>
					<th>price</th>
                    <th>user name</th>
					<th>edit</th>
					<th>delete</th>
				</tr>
			</head>
			<body>
				<c:forEach items="${itemlist}" var="itemlist1">
					
						<tr>
						<td>${itemlist1.itemsName}</td>
						
						
						<td>${itemlist1.price}</td>
						
                       
						<td>${itemlist1.user.userName }</td>
					
                        
						<td><a href="edit?id=${itemlist1.itemId}">edit</a></td>
					
						
						<td><a href="delete?id=${itemlist1.itemsName}">delete</a></td>
				
				
				</c:forEach>
			</body>
		</table>
	</center>
</body>
</html>




















