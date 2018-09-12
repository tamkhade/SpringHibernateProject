
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>

<style>

label.error{
    width:20%;
    color: red;
    font-style: italic;
    margin-left: 0px;
    margin-bottom: 200px;
}
.userform input.submit {
    margin-left: 120px;
}

</style>
<!-- <script>
$(document).ready(function() {
    $("#userform").validate({
    	
        rules: {
        	firstname: "required",
        	lastname:"required",
            
        },
        messages: {
        	firstname: "Please enter your name",
        	lastname:"please enter your last name",
        	
           
        }
    });
});
</script> -->

</head>
<body>

<form:form method="GET" id="userform" commandName="sample" modelAttribute="sample" action="saveemp.htm">
First Name<form:input type="text" path="firstname" id="firstname" name="firstname" /><br>
 <form:errors path="firstname" cssStyle="color:red" />

 Last Name:<form:input type="text" path="lastname" id="lastname" name="lastname"/><br>
  <form:errors path="lastname" cssStyle="color:red" />

<input type="submit" value="save">
</form:form>
</body>
</html>