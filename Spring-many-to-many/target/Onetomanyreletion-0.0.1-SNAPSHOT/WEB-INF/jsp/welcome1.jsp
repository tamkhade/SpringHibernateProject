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

	<form:form method="POST" modelAttribute="studentform"
		commandName="studentform" action="saveContact">

		<table style="color: red;" border="4" width="80%">
			<%-- <form:input type="hidden" path="s_id" readonly="true" /> --%>


			
			<tr>
				<td>userName:</td>
				<td><form:input path="name" type="text" /></td>

			</tr>



			<c:forEach items="${studentform.batch_list}" var="batch"
				varStatus="row">

				
					<%-- <form:input type="hidden"
							path="batch_list[${row.index}].id" readonly="true" /></td> --%>
				
				<tr>
					<td>year:<form:input path="batch_list[${row.index}].year"
							type="text" /></td>
				</tr>

				<tr>
					<td>percentage:<form:input
							path="batch_list[${row.index}].percentage" type="text" /></td>
				<tr>
				<tr>

					<td>grade:<form:input path="batch_list[${row.index}].grade"
							type="text" /></td>
				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
			
		</table>
	</form:form>

</body>
</html>