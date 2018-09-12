<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Country</title> <
<script type="text/javascript" language="javascript"
	src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
<script type="text/javascript"
	src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>

<script>
	$(document).ready(function() {
		$("#selectid").change(function() {
			$("#stateid").empty();
			var n = $(this).val();
			alert('value=' + n);
			$.ajax({
				type : "post",
				url : "add.htm",
				cache : false,
				data : 'id=' + n,
				dataType : "json",
				success : function(response) {
					alert(response);
					
					$.each(response, function(i, data) {
					var msg_data = "<option  value="+data.sid+">"+ data.state + "</option>";
						$(msg_data).appendTo("#stateid");
					
					});
				},
				error : function() {
					alert('Error while request..');
				}

				 

			});

		});
	});
</script>



<script>
	$(document).ready(function() {
		$("#stateid").change(function() {
		
			var n = $(this).val();
			alert('value=' + n);
			$.ajax({
				type : "post",
				url : "state.htm",
				cache : false,
				data : 'id=' + n,
				dataType : "json",
				success : function(response) {
					alert(response);
					
					$.each(response, function(i, data) {
					var msg_data = "<option  value="+data.idcity+">"+ data.city + "</option>";
						$(msg_data).appendTo("#cityid");
					
					});
				},
				error : function() {
					alert('Error while request..');
				}

				 

			});

		});
	});


</script>



</head>

<body>
	 <center>
		 <h1>country Form</h1>
		<form:form modelAttribute="countryForm" method="post"
			action="insertbatch">
			 <%-- <table>

				<form:input path="cid" type="hidden" />

				<tr>
					<td>country Name:</td>
					<td><form:input path="country" type="text" /></td>
				</tr> --%>
  
 


				<c:forEach items="${countryForm.statelist}" var="statelist"
					varStatus="row">

					<form:input type="hidden" path="statelist[${row.index}].sid"
						readonly="true" />
					<tr>
						<td>state:</td>
						<td><form:input path="statelist[${row.index}].state"
								type="text" /></td>
					</tr>


				</c:forEach>



				<tr>
					<td colspan=2><form:input path="" type="submit" value="submit" />
					</td>
				</tr>

			</table>
		</form:form>
	</center>

	<th>country</th>
	<select id="selectid">
		<c:forEach items="${displaylist}" var="country">
			<option id="countryid" value="${country.cid}">
				${country.country}</option>
		</c:forEach>
	</select>

	<th>state</th>
	<select id="stateid">
	<option value="${state.sid}"></option>	
	</select>
	
	
	<th>city</th>
	<select id="cityid">
	
	</select>
	
	
</body>

</html>