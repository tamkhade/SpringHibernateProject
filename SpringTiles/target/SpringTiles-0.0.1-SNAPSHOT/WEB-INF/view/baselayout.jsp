<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<table border="1">
		<tr>
			<th><tiles:insertAttribute name="header" /></th>
		</tr>
		<tr>
			<th><tiles:insertAttribute name="body" /></th>
		</tr>
		<tr>
			<th><tiles:insertAttribute name="footer" /></th>
		</tr>

	</table>

</body>
</html>