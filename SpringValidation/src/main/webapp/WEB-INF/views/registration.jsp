<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form commandName="EmployeeForm" modelAttribute="EmployeeForm" method="post" action="registerUser">
	   <table>
	   <tr>
	   <td>
	   	First Name :<form:input path="name" type="text" />
	   		<form:errors path="name" />
	</td>
	   </tr>

	   <tr>
	   <td>
		Mobile  :<form:input path="mobile" type="text" />
		<form:errors path="mobile" />
	</td>
	   </tr>

	   <tr>
	   <td>
		Address :<form:input path="address" type="text" />
		<form:errors path="address" />
	   </td>
	   </tr>

	   <tr>
	   <td>
        EmailId:<form:input path="emailid" type="text"  />
		<form:errors path="emailid" />
	   </td>
	   </tr>

     <tr>
        <td>Gender :</td>
        <td>
            <form:radiobutton path="gender" value="M" label="M" />
            <form:errors path="gender" /> 
         </td>
         <td>
            <form:radiobutton path="gender" value="F" label="F" />
            <form:errors path="gender" />
         </td>
        </tr>
        <tr><td>
         <tr>
				<td>Country:</td>
				<td><form:select path="country" items="${country}">
					 <!-- <form:option value="NONE" label="--- Select ---" />
					   <option value="US">United Stated</option>
                       <option value="CHINA">China</option>
                       <option value="SG">Singapore</option>
                      <option value="MY">Malaysia</option> -->
				       </form:select>
                                </td>
				<td><form:errors path="country" cssClass="error" /></td>
			</tr>
		</td>
            </tr>
            
            <tr>
				<td>Favourite Languages :</td>
				<td>
                      <form:checkbox path="favLanguages" value="Java" />Java
                      <form:checkbox path="favLanguages" value="C++" />C++
                      <form:checkbox path="favLanguages" value=".Net" />.Net
                               
                  </td>
				<td><form:errors path="favLanguages" cssClass="error" />
				</td>
			</tr>    
      <tr>
      <td>
		<form:input path="" type="submit" value="submit" />
		</td>
		</tr>
		</table>
		
		
	</form:form>
</body>
</html>