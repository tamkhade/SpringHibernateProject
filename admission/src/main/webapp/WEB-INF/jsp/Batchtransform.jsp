<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Batch Transfer</title>
</head>
<body>
<center>
		<h1>Student Form</h1>
		<form:form modelAttribute="student" method="post" action="insertbatch">
		<table>
			
			<form:input path="s_id" type="text"  />	
		
		<tr>
		<td>Student Name:</td>
		<td><form:input path="name" type="text" /></td></tr>
		
	
			<tr>
			<td>enroll:</td>
			<td><form:input path="enroll"  type="text" /></td>
			</tr>
		
			<c:forEach items="${student.batch_list}" var="batch" varStatus="row">
			
			<form:input type="hidden" path="batch_list[${row.index}].id"
										readonly="true" />
		<tr>
 		<td>grade:</td>
 		<td><form:input path="batch_list[${row.index}].grade" type="text" /></td>
 		</tr>
 		<tr>
 		<td>Percentage:</td>
		<td><form:input path="batch_list[${row.index}].percentage" type="text" /></td>
		</tr>
		<tr>
 		<td>year:</td>
 		<td><form:input path="batch_list[${row.index}].year" type="text" /></td>
 		</tr>
		
		</c:forEach>
			
		
		
		<tr>
		<td colspan=2>
		<form:input path="" type="submit" value="submit" />
		</td>
		</tr>
			
		</table>
		</form:form>

	</center>

	<hr>


</body>
</html>