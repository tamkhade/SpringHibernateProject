 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
function test(){
	var gen=$("#gender_id").val();
	//$("#title_id").val(gen);
	if(gen=="1"){
		$("#title_id").val(1);
	}else if(gen=="2" ){
		$("#title_id").val(3);
	} else{
		$("#title_id").val(0);
	}
	
	
	
}

function test2(){
	var title=$("#title_id").val();
	//$("#title_id").val(gen);
	if(title=="1"){
		$("#gender_id").val(1);
	}else if(title=="2"|| title=="3"){
		
		$("#gender_id").val(2);
	} else{
		$("#gender_id").val(0);
	}
	
	
	
}
</script>
	<script>
	$(document).ready(function() {
			
		
		$("#Reception").click(function() {
			$('#reception').attr('action', 'getReceptionMaster.hms')
			$("#reception").submit()
		});
	
		$("#Receptionupdate").click(function() {
			$('#reception').attr('action', 'getReceptionMasterupdate.hms')
			$("#reception").submit()
		});
		


	});
</script>
	
	
 <div class="app-content content container-fluid">
    <div class="content-wrapper">
       <div class="content-body">
         <section id="form-action-layouts">
          <form:form method="POST" id="reception" modelAttribute="ReceptionFormModel" commandName="ReceptionFormModel" action="getReceptionMaster.hms">
		   <form:input type="hidden" path="patient_master_id" />
		   
		    <div class="row">
              <div class="col-md-12">
                <div class="card">
					<div class="card-header">
					  <h4 class="card-title" id="from-actions-multiple">NEW CASE PAPER FORM</h4>
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
					<div class="card-body collapse in">
					  <div class="card-block">
					        <div class="row" >
							    <div class="form-group" style="margin-left:10px;padding-left:10px;">
                                    <p style="color:#e91e63;font-weight:bold">Today's date: <span  style="color:#00b5b8;font-weight:bold" id="demo" ></span>
                                                    <script>
													var d = new Date();
													document.getElementById("demo").innerHTML = d.toDateString();
													</script>
								</div>
							 </div>
							 
                          <div class="row" >
						      <div class="col-md-4">
							     
							   <div class="form-group" style="margin-top:50px;">
							    <label for="mname"  style="font-weight:bold;">Department :</label>
								<form:select class="custom-select form-control input-sm " id="ct" name="ct" path="departement_id" items="${departmentlist}">
									  <option value="country">Select Department </option>
									  <option value="">Cardiology</option>
									  <option value="">Gynaecology</option>
									  <option value="">Nephrology</option>
								</form:select>
							   </div>
							  </div>
							   <div class="col-md-4">
							   <div class="form-group "style="margin-top:50px;">
							    <label for="mname"  style="font-weight:bold;"> Consultant :</label>
								<form:select class="custom-select form-control input-sm " id="ct" name="ct" path="${consultant_id}">
									  <option value="country">Select Consultant </option>
									  <option value=""></option>
									  <option value=""></option>
									  <option value=""></option>
								</form:select>
							   </div>
							  </div>
							   <div class="col-md-2">
										<div class="form-group"  style="float:left;max-width:100px;;input[type=file]{padding:50px;background:#2d5f2d;};margin-left:60px;" >
										
										  <span><img id="blah" src="../../../app-assets/images/ico/profile-pictures.png" style="height:100px;width:100px;margin-top:10px;" alt="your image" />
										  
										</span>
										 <script>
																function readURL(input) {
																if (input.files && input.files[0]) {
																 var reader = new FileReader();
																 reader.onload = function (e) {
																		$('#blah')
																			.attr('src', e.target.result);
																	};

																	reader.readAsDataURL(input.files[0]);
																}
															}
										 </script>
										</div>
						        </div>
								<div class="col-md-2 style="">
								  <button type="button" class="btn btn-float btn-square btn-float-sm btn-outline-primary btn-sm "style="margin-top:10px;height:1px;"><i class="fa fa-camera"></i></button>
                                    </br>
								  <button type="button" class="btn btn-float btn-float-sm btn-outline-pink btn-sm" style="margin-top:10px;height:1px;" onclick="readURL(1);"><i class="	fa fa-cloud-upload" style="text-align:center;"></i></button>
                                     </br>
								  <button type="button" class="btn btn-float btn-float-sm btn-outline-success btn-sm" style="margin-top:10px;height:1px;" onclick="readURL(1);"><i class="fa fa-check	Try it
"></i></button>
										  						  					
								</div>
						 </div>
						    <div class="row">
								   <div class="col-md-1">
									<div class="form-group">
									  <label for="website">Title:</label>
									   <form:select class="custom-select form-control input-sm" id="title_id" name="ct" path="title_id" items="${titlelist}" onchange="test2();">
									  </form:select>
									</div>
								  </div>
								   <div class="col-md-3">
									   <div class="form-group">
										   <label for=""><font size="2">First Name :</font></label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="patient_first_Name"/>
										</div>
									 </div>
									<div class="col-md-4">
									<div class="form-group">
									  <label for=""><font size="2">Middle Name :</font></label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="patient_middle_Name"/>
									</div>
								  </div>
								  <div class="col-md-4">
									<div class="form-group">
									  <label for=""><font size="2">Last Name :</font></label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="patient_last_Namel"/>
									</div>
								  </div>
						    </div>
							<div class="row">
								  <div class="col-md-2">
									<div class="form-group">
									  <label for=""><font size="2">Gender :</font></label>
									 <form:select class="custom-select form-control input-sm" id="gender_id" name="st" path="gender_id" items="${genderlist}"  onchange="test();">
										<option value="state">Select Gender</option>
										
									  </form:select>
									</div>
								  </div>
								   <div class="col-md-2">
									<div class="form-group">
									  <label for=""><font size="2">Age :</font></label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="pat_age"/>
									</div>
								  </div>
								  <div class="col-md-4">
									 <div class="form-group">
										  <label>DOB :</label>
										  <div class="input-group">
											<span class="input-group-addon">
											  <span class="fa fa-calendar-o"></span>
											</span>
											<form:input path="dob" type="date" class="form-control input-sm" id="lastName2" />
											<%-- <form:input type='date' class="form-control input-sm pickadate" placeholder="" path="dob" id="date2"/> --%>
										  </div>
										</div>
			                      </div>	
								  <div class="col-md-4">
									 <div class="form-group">
										  <label>Marital Status :</label>
												 <form:select class="custom-select form-control input-sm" id="st" name="st" path="maritalStatus_id" items="${maritalStatuslist}">
													<option value="state">Select Marital Status </option>
													<option value="">Married</option>
													<option value="">Unmarried</option>
													<option value="">Divorce</option>
												  </form:select>
									 </div>
			                      </div>	
							</div>
							<div class="row">
							    <div class="col-md-1">
									<div class="form-group">
									  <label for="">Ht(Cm)</label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="height"/>
									</div>
								</div>
								<div class="col-md-1">
									<div class="form-group">
									  <label for=""> Wt(Kg)</label>
									  <form:input type="text" class="form-control input-sm" id="em" name="em" path="weight"/>
									</div>
								</div>
								<div class="col-md-2">
									 <div class="form-group">
										  <label>Blood Group :</label>
												 <form:select class="custom-select form-control input-sm" id="st" name="st" path="bloodgroup_id" items="${bloodlist}">
													<option value="state">Select BloodGroup </option>
													<option value="">O +ve</option>
													<option value="">O -ve</option>
													<option value="">A -ve</option>
													<option value="">A -ve</option>
												  </form:select>
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
										  <label>Referral Doctor :</label>
												 <form:select class="custom-select form-control input-sm" id="st" name="st" path="referaldr_id" items="${refferaldrlist}">
													<option value="state">Select Referral Doctor</option>
													<option value="">Dr. Patil</option>
													<option value="">Dr. Joshi</option>
													<option value="">Dr. Mangesh</option>
													<option value="">Dr. Khan</option>
												  </form:select>
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
										  <label>Patient Reason :</label>
												<form:select class="custom-select form-control input-sm" id="st" name="st" path="patientreason_id" items="${reasonList}">
													<option value="state">Select Patient Reason</option>
													<option value="">Checkup</option>
													<option value="">Appointment</option>
												</form:select>
									 </div>
			                    </div>
							</div>
							<div class="row">
							    <div class="col-md-4">
									 <div class="form-group">
										  <label>Nationality :</label>
												<form:select class="custom-select form-control input-sm" id="st" name="st" path="nationality_id" items="${nationalitylist}">
													<option value="state">Select Nationality</option>
													<option value="">India</option>
													<option value="">Iran</option>
													<option value="">Japan</option>
													<option value="">SriLanka</option>
												</form:select>
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
										  <label>Nationality ID :</label>
										   <form:input type="text" class="form-control input-sm" id="em" name="em" path="passport_nationalityid"/>	
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
										  <label>Religion :</label>
												<form:select class="custom-select form-control input-sm" id="st" name="st" path="religion_id" items="${religionList}">
													<option value="state">Select Religion</option>
													<option value="">Hinduism</option>
													<option value="">Buddhism</option>
													<option value="">Islam</option>
													<option value="">Confusianism</option>
													<option value="">Cristianity</option>
													<option value="">Shinto</option>
													<option value="">Other</option>
												</form:select>
									 </div>
			                    </div>
								
							</div>
							<div class="row">
							  <div class="col-md-4">
									 <div class="form-group">
										  <label>Language :</label>
												<form:select class="custom-select form-control input-sm" id="st" name="st" path="language_id" items="${langlist}">
													<option value="state">Select Language</option>
													<option value="">English</option>
													<option value="">Arabic</option>
													<option value="">French</option>
													<option value="">German</option>
													<option value="">Hokkin</option>
												</form:select>
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
									 
										  <label>Mobile Number :</label>
										
										   <form:input type="text" class="form-control input-sm" value="+91-00000000" placeholder="Mobile Number" id="em" name="em" path="patient_Contno"/>	
									 </div>
			                    </div>
								<div class="col-md-4">
									 <div class="form-group">
										  <label>Alternate Mobile Number :</label>
										   <form:input type="text" class="form-control input-sm" value="+91-00000000" placeholder="Alternate Mobile Number" id="em" name="em" path="patient_alt_Contno"/>	
									 </div>
			                    </div>
							</div>
							<div class="row">
							   <div class="col-md-4">
									<div class="form-group" style="margin:10px;">
										<label for="">Address :</label>
											<form:textarea class="form-control " rows="8"  id="ad" name="ad" path="patient_address"></form:textarea>
									</div>
							   </div>
							    <div class="col-md-4">
									 <div class="form-group">
										<label>Pincode:</label>
										<form:select class="custom-select form-control input-sm" id="ct" name="ct" path="pincode_id" items="${getPinCodeList}" >
											<option value="0" disabled="true">Select Pincode</option>
											<option value="1">416301</option>
										
										  </form:select>
									 </div>
									 <div class="form-group">
										<label>Area:</label>
										<form:select class="custom-select form-control input-sm" id="ct" name="ct" path="areaid" items="${getAreaMasterList}" >
											<option value="0" disabled="true">Select Area</option>
											<option value="1">Hadapsar</option>
										
										  </form:select>
									 </div>
									   <div class="form-group">
										<label>State:</label>
										 <form:select class="custom-select form-control input-sm" id="ct" name="ct" path="stateid" items="${getstateMasterList}">
											<option value="0" disabled="true">Select State</option>
											<option value="1">maharashtra</option>
											
										  </form:select>
									 </div>	
								</div>
								 <div class="col-md-4">
								   <div class="form-group">
										<label>Landmark:</label>
									
                                    <form:input id="text" class="form-control input-sm "  placeholder="Enter Landmark" path="landmark"/>
									 </div>
									 <div class="form-group">
										<label>City:</label>
									    <form:select class="custom-select form-control input-sm" id="ct" name="ct" path="cityid" items="${getCityList}">
											<option value="0" disabled="true">Select City</option>
											<option value="1">Pune</option>
											
										  </form:select>	
									 </div>
									  <div class="form-group">
										<label>Country:</label>
									    <form:select class="custom-select form-control input-sm" id="countryid" name="ct" path="countryid" items="${getcountryMasterList}" >
											<option value="0" disabled="true">Select Country</option>
											<option value="1">India</option>
											
										  </form:select>	
									 </div>	 
								</div>
									
						</div>
							<div class="row">
					            <div class="col-md-4">
									 <div class="form-group">
										  <label>Email ID :</label>
										   <form:input type="email" class="form-control input-sm" id="em" name="em" path="Email_id"/>	
									 </div>
			                    </div>
							</div>
							 <c:choose>
							 <c:when test="${ReceptionFormModel.patient_master_id==0}">
							
							<div class="row">
					            <div class="col-md-12">
									 <div class="form-group" style="float:right;">
										 <button type="submit" class="btn btn-success btn-sm" id="Reception" onclick="Reception()">
											<i class="fa fa-check-square-o"></i> Save
										  </button>
										   </c:when>
                                                 <c:otherwise>
                                                       
                                                   <button type="submit" class="btn btn-success btn-sm" id="Receptionupdate" onclick="Receptionupdate()">
                                                     	<i class="fa fa-check-square-o"></i>Update
										                           </button>
                                                                 </c:otherwise>
                                                                        	</c:choose>
                                                 
										  
										   <button type="submit" class="btn btn-primary btn-sm">
											<i class="fa-times"></i> Clear
										  </button>
										   <button type="submit" class="btn btn-danger btn-sm">
											<i class="	fa fa-close "></i> Cancel
										  </button>
									</div>
			                    </div>
							</div>
					  </div>
					</div>
			    </div>
			   </div>			  
			</div>
	    </form:form>
		   </section>
      </div>
	</div>
  </div>