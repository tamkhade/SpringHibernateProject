<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  modelAttribute="serarching"
		commandName="serarching">
<table border="1">
			<tr>
				<td class="heading">User Id</td>
				<td class="heading">Name</td>
			</tr>


	<c:forEach var="list1" items="${serarching}">
				<tr>
					<td>${list1.s_id}</td>
			
					<td>${list1.enroll}</td>
				</tr>
				
</c:forEach>
</table>
</form:form>
</body>
</html>