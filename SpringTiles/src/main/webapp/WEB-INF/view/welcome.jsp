<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<form:form modelAttribute="contactForm" commandName="contactForm" class="form-horizontal" action="insert.htm">


<fieldset>
<!-- Form Name -->
<legend>Form Name</legend>



<%-- <div class="form-group">
			<label class="col-md-4 control-label" for="name">Student</label>//
			<div class="col-md-4">
				<form:hidden path="contactId" type="text"/>
				

			</div>

</div>
 --%>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Firstname">Firstname</label> 
  
   
  <div class="col-md-4">
  <form:input id="Firstname" path="Firstname" type="text" placeholder="firstname" class="form-control input-md"/>
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Lastname">Lastname</label>  
  <div class="col-md-4">
  <form:input id="Lastname" path="Lastname" type="text" placeholder="lastname" class="form-control input-md"/>
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Email</label>  
  <div class="col-md-4">
  <form:input id="Email" path="Email" type="text" placeholder="Email" class="form-control input-md"/>
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Contact">Contact</label>  
  <div class="col-md-4">
  <form:input id="Telephone" path="Telephone" name="Telephone" type="text" placeholder="contact" class="form-control input-md"/>
    
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="submit">submit</label>
  <div class="col-md-4">
    <button id="submit" name="submit"  class="btn btn-primary">Submit</button>
  </div>
</div>

</fieldset>

</form:form>

</body>
</html>
