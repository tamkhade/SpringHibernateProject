<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>

	<form:form modelAttribute="studentform" method="post" action="link2">

		<form:input path="id" type="hidden" />
		<br>
		<br>
		First Name:<form:input path="firstName" type="text" />
		<br>
		<br>
		Last Name:<form:input path="lastName" type="text" />
		<br>
		<br>
		Section:<form:input path="section" type="text" />
		<br>
		<br>
		Street:<form:input path="address.street" type="text" />
		<br>
		<br>
		City:<form:input path="address.city" type="text" />
		<br>
		<br>
		country:<form:input path="address.country" type="text" />

		<br>
		<input type="submit" value="submit">

	</form:form>


</body>
</html>
