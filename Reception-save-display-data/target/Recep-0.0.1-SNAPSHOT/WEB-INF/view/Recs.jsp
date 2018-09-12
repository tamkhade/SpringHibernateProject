
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">



<h1>Receptionst Form</h1>
<form:form action=savereception commandName="reception">


<table style="color:red;" border="4"  width="80%">
  
 <tr>
	<td>First name:</td>
	<td><form:input type="text" path="firstname" placeholder="firstname"/></td>
  </tr>
  
  <tr>
  <td>Last name:</td>
  <td><form:input type="text" path="lastname" placeholder="lastname"/><td>
  </tr>
  
  <tr>
  <td>Email:</td>
  <td><form:input type="text" path="email" placeholder="email"/></td>
  </tr>
  
  
  <tr>
 <td>Date Of birth</td>
 <td><form:input type="text" path="dateofbirth"placeholder="Date of birth"/></td>
 </tr>
 
 
  <tr>
  <td>PhoneNo</td>
 <td><form:input type="text" path="phoneno" placeholder="phoneno"/></td>
 </tr>
 
   <tr>
  <td>Address:</td>
  <td><form:input type="text" path="address" placeholder="address"/></td>
  </tr>
  
  
   <tr>
  <td>Adharcard:</td>
  <td><form:input type="text" path="adharcard" placeholder="adharcard"/></td>
  </tr>
  
  
  
   <tr>
  <td>pancard:</td>
  <td><form:input type="text" path="pancard" placeholder="pancard"/></td>
  </tr>
  
  
    <tr>
  <td>gender:</td>
  <td><form:input type="radio" path="gender" value="gender" />Male<br>
      <form:input type="radio" path="gender" value="female"/> Female<br> </td>
  </tr>
  <tr>
 <tr>
 <td> bloodgroup</td>
  <td><form:input type="text" path="bloodgroup" placeholder="bloodgroup"/></td>
  </tr>
 
 
 <!-- <tr>
 <td>Attachphoto</td>
 <td><input type="submit" value="attach photos"></td>
 </tr>
  -->
 
 
 
 <!-- <tr>
  <td>Dr:</td>
  <td>
  <select>
  <option value="abc">abc
 <option value="abc">xyz</option>
  </select>
  </td>
  </tr>
  --> 
  
   <tr>
  <td>Date</td>
  <td><form:input type="text" path="Date" placeholder="date"/></td>
 </tr>

<tr>
  <td>appointmentTime</td>
  <td><form:input type="text" path="time" placeholder="Time"/></td>
 </tr>  
 
 
 <tr> 
 <td><input type="submit" value="Submit"/></td>
 </tr>
 
 </table>
</form:form> 
</body>
</html>