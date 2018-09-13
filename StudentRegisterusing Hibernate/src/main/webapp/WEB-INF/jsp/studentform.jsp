<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- <meta charset="utf-8"> -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">




<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Student Form</h1>
		<form:form modelAttribute="studentform1" method="post" action="insert">
		<table>
			
			<form:input path="s_id" type="text"  />	
		
		<tr>
		<td>Student Name:</td>
		<td><form:input path="name" type="text" /></td></tr>
		
		<tr>
		<td>enroll:</td>
		<td><form:hidden path="enroll"  type="text"/> </td>
		</tr>
			

		
   

      <c:forEach items="${studentform1.batch_list}" var="studentForm"
				varStatus="row">
				<form:input type="text" path="batch_list[${row.index}].id"
					readonly="true" />
      				Student year:<form:input path="batch_list[${row.index}].year"
					type="text" />
					Student percentage:<form:input path="batch_list[${row.index}].percentage"
					type="text" />
					Student grade:<form:input path="batch_list[${row.index}].grade"
					type="text" />
					
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
