
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	${pageContext.request.contextPath}/resources
	
	<%-- <script src="${pageContext.request.contextPath}/resources/bootstrap/3.3.7/js/bootstrap.min.js"></script>  --%>
	
<!--  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  -->

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

 <script type="text/javascript">

 $(function() {		
	 var resp;
		$("#patient_fullname").autocomplete({
			source: function (request, response) {
				
	            resp=$.getJSON("${pageContext.request.contextPath}/getMachedNames.hms", {
	                term: request.term
	             
	            },function(){alert('hello');})
	            
	            /* select: response */
	            
	                /*  $.each(response, function(i, data) {
	                	 $("#patsResponse option").remove();
						msg = "<option>"+ data + "</option>";
						 $(msg).appendTo("#patsResponse");
						});   */
	            	
	               // $('p').text('You selected: ' + ui.item.value);

	              
	            
	        }
	      	
		});
		alert(resp);
		
	}); 
	
/* $('#patient_fullname').autocomplete({
    serviceUrl: '/getMachedNames.hms',
    onSelect: function (suggestion) {
        alert('You selected: ' + suggestion.value + ', ' + suggestion.data);
    }
}); */


	 
</script>


<script>
$(document).ready(function()
		{  
	$("#patSearchs").click(function() 
			{
		var word = $('input[id=patient_fullname]').val();
		alert(word);

		$.ajax({
			type : "post",
			url : "getpatientinformation.hms",
			cache : false,
			data : 'patient_fullname=' + word,
			dataType : "json",
			success : function(response) 
			{
				
				alert(response);
				
				$('#patfullname').val(response.patient_fullname)
				//$('#name').val(response.name)  
			
			},
			error : function() {
				alert('Error while request..');
			}

			
		    });

			});
	
		});
</script>

<!-- <script>
$(document).ready(function()
		{
	
    $("#patient_fullname").keyup(function() 
		{
	
	var n = $('input[id=patient_fullname]').val();
	    	var n = $(this).val();
			//alert(n)
			$.ajax({
				type : "post",
				url : "getMachedNames.hms",
				cache : false,
				data : 'name=' + n,
				dataType : "json",
				
				success : function(response) 
				{
					
					console.log(response);
					$("#patsResponse option").remove();
					var msg = "";

				$.each(response, function(i, data) {
					
					msg = "<option>"+ data + "</option>";
					
					 $(msg).appendTo("#patsResponse");
					});  
				
				},
				error : function() {
					alert('Error while request..');
				}

				
			});

		}); 
});

</script> -->
 
 <div class="app-content content container-fluid">
    <div class="content-wrapper">
       <div class="content-body">
           <section id="form-action-layouts">
		    <div class="row">
              <div class="col-md-12">
                <div class="card">
					<div class="card-header">
					
					  <a class="heading-elements-toggle"><i class="fa fa-ellipsis-v font-medium-3"></i></a>
					  <div class="heading-elements">
						<ul class="list-inline mb-0">
						  <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
						  <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
						  <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
						  <li><a data-action="close"><i class="ft-x"></i></a></li>
						</ul>
					 </div>
					</div>
					  <div class="row">
						       <div class="col-xs-12">
								  <div class="card">
									
									 <div class="row" style="margin-left:10px;">
									<div class="card-body collapse in">
									  <div class="card-block card-dashboard">
									  <h4 class="card-title">Patient Table</h4>
									   <input type="search" id="patient_fullname"  name="patient_fullname" autosave=some_unique_value>
										<button style="margin-left:10px;margin-bottom:10px;background-color:#0edac9;color:white;height:30px;border-radius:8px;width:80px;" id="patSearchs">button</button>
									 
									  <a class="heading-elements-toggle"><i class="fa fa-ellipsis-v font-medium-3"></i></a> 
										<table class="table table-striped table-bordered file-export" style="width:980px;">
										  <thead>
									
										<div id="patsResponse" >
										</div>
										
			
											<tr>
											 
											  <th style="text-align:center;">Patients</th>
											</tr>
										  </thead>
										  <tbody id="patfullname">
										  
										  <c:forEach items="${patientlist}" var="rec" varStatus="row">
										  
											<tr>
										<td>
						             <div class="row" style="background-color:#eef4f5;">
						             <div class="col-md-1">
									<div class="form-group">			
								  <div style="margin:2px;padding:2px;">
								  <a href="" class="a1"><i class="fa fa-plus-square" style="color:#10c888;"></i></a>
								  <a href="" class="a2"><i class="fa fa-remove" style="color:#fbc02d;"></i></a>
                                   
								   <a href="" class="a3"><i class="	fa fa-minus-circle" style="color:#f5530e;"></i></a>
                                 </div>								   
                             </div>						   
						   </div>
						 
			              <div class="col-md-3">
							 <div class="form-group">
							    <label for="">Name:${rec.patient_fullname}</label></br>
							 <label for="">DOB:${rec.dob}</label>
 						 </div>
						    </div>
							 <div class="col-md-2">
							 <div class="form-group">
							    <label for="">Patient ID:${rec.patient_master_id}</label></br>
								   <label for="">Gender:${rec.gender_id}</label>
							 </div>
						    </div>
							<div class="col-md-3">
							 <div class="form-group">
							    <label for="">Patient Type:</label></br>
								   <label for="">Address:${rec.patient_address}</label>
							 </div>
						    </div>
						    <div class="col-md-3">
							 <div class="form-group">
							     <button type="button" class="btn btn-icon btn-success mr-1" data-toggle="tooltip" data-placement="right"  title="Appointment">Apt</button>
								 <button type="button" class="btn btn-icon  btn-primary mr-1" data-toggle="tooltip" data-placement="top"  title="OPD">OPD</button>
								 <button type="button" class="btn btn-icon  btn-secondary mr-1" data-toggle="tooltip" data-placement="top"  title="IPD">IPD</button>
								 <button type="button" class="btn btn-icon  btn-info mr-1" data-toggle="tooltip" data-placement="left"  title="Billing Counter">Bill</button>
								 <button type="button" class="btn btn-icon   btn-warning mr-1" data-toggle="tooltip" data-placement="right"  title="Outstanding">O/S</button>
								 <button type="button" class="btn btn-icon   btn-danger mr-1" data-toggle="tooltip" data-placement="bottom"  title="OPD">O/S</button>
								 <button type="button" class="btn btn-icon  mr-1" style="background-color:#fff176;color:white;"data-toggle="tooltip" data-placement="bottom"  title="OPD">O/S</button>
								 <button type="button" class="btn btn-icon  mr-1" style="background-color:#b0bec5;color:white;"data-toggle="tooltip" data-placement="left"  title="OPD">O/S</button>
							 </div>
						    </div>
						</div>
						  </td>
								</tr>
												
						   			 </c:forEach>	
							
							  </tbody>
										  <tfoot>
											<tr>
											
											  <th style="text-align:center;">Patients</th>
											  
											  
											</tr>
										  </tfoot>
										</table>
									  </div>
									</div>
								  </div>
								</div>
							  </div>
						  </div>	
						 	   
			         </div>
			   </div>
			</div>
			 
		   </section>
      </div>
	</div>
  </div>
 