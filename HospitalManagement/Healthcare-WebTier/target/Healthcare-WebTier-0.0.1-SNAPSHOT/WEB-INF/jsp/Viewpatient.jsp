
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
		$("#patSearch").autocomplete({
			source: function (request, response) {
	            $.getJSON("${pageContext.request.contextPath}/getMachedNames.hms", {
	                term: request.term
	            }, response);
	        }
		});
	});
	
</script>
 
 
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
				
				<%-- <c:forEach items="${patientlist}" var="rec" varStatus="row"> --%>
		
					  <div class="row">
						       <div class="col-xs-12">
								  <div class="card">
									
									 <div class="row" style="margin-left:10px;">
									<div class="card-body collapse in">
									  <div class="card-block card-dashboard">
									  <h4 class="card-title">Patient Table</h4>
									  <a class="heading-elements-toggle"><i class="fa fa-ellipsis-v font-medium-3"></i></a>
									
										<table class="table table-striped table-bordered file-export" style="width:980px;">
										  <thead>
										<input type="search" style="margin-bottom:10px;" id="patSearch">
										<button style="margin-left:10px;margin-bottom:10px;">search</button>
									
											<tr>
											 
											  <th style="text-align:center;">Patients</th>
											</tr>
										  </thead>
										  <tbody>
										  
										  <c:forEach items="${patientlist}" var="rec" varStatus="row">
										  
											<tr>
										<td>
					 
					 
						<div class="row" style="background-color:#eef4f5;">
						   <div class="col-md-1">
									<div class="form-group">
									 
									  <!-- <span><img id="blah" src="profile-pictures.png" style="height:50px;width:50px;margin:2px;padding:2px;margin-top:4px;" /></span> -->
								
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
 