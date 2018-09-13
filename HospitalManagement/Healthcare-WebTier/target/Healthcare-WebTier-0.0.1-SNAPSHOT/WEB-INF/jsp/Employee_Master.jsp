<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="app-content content container-fluid">
	<div class="content-wrapper">
		<div class="content-header row"></div>
		<div class="">
			<!-- Form wizard with icon tabs section start -->
			<section id="icon-tabs">
				<div class="row">
					<div class="col-xs-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title">Employee Registration Form</h4>
								<a class="heading-elements-toggle"><i
									class="fa fa-ellipsis-v font-medium-3"></i></a>
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
									<form:form method="post"
										modelAttribute="employeeMasterFormModel"
										commandName="employeeMasterFormModel" action="#"
										class="icons-tab-steps wizard-circle">

										<!-- Step 1 -->
										<h6>
											<i class="step-icon ft-home"></i>1. User Info
										</h6>
										<fieldset>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="firstName2">Select Role</label> 
														<form:select path="user_type_id"
															class="custom-select form-control input-sm"
															id="location2" name="location">
															<form:option value="">Select Role</form:option>
															<form:option value="1">Receptionist</form:option>
															<form:option value="2">Accountant</form:option>
															<form:option value="3">Cashier</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="firstName2">Users Available :</label> 
														<input
															type="text" class="form-control input-sm" id="firstName2">
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="firstName2">Username :</label> <form:input
															type="text" class="form-control input-sm" id="firstName2"
															placeholder="Enter Username" path="user_name" />
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="firstName2">Password :</label> 
														<form:input
															type="password" class="form-control input-sm"
															id="user-password" placeholder="Enter Password" path="user_password" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="lastName2">Confirm Password :</label> <input
															type="password" class="form-control input-sm"
															id="user-password" placeholder="Enter Password">
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="lastName2">Gender :</label> 
														<form:select
															class="custom-select form-control input-sm"
															id="location2" name="location" path="gender_id">
															<form:option value="">Select Gender</form:option>
															<form:option value="1">Male</form:option>
															<form:option value="2">Female</form:option>
															<form:option value="3">Other</form:option>
														</form:select>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-1">
													<div class="form-group">
														<label for="firstName2">Title:</label> 
														<form:select path="title_id"
															class="custom-select form-control input-sm" id="ct"
															name="ct">
															<form:option value="1">MR.</form:option>
															<form:option value="2">MRS.</form:option>
															<form:option value="3">MS</form:option>
															<form:option value="4">BABY OF</form:option>
															<form:option value="5">MASTER</form:option>
															<form:option value="6">DR</form:option>
															<form:option value="7">BABY</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label for="firstName2">First Name :</label> 
														<form:input
															type="text" class="form-control input-sm" id="firstName2" path="first_nm" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="lastName2">Middle Name :</label> <form:input
															type="text" class="form-control input-sm" id="lastName2" path="middle_nm" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="lastName2">Last Name :</label> <form:input
															type="text" class="form-control input-sm" id="lastName2" path="last_nm" />
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Date of Birth :</label> 
														<form:input path="DOB" type="date" class="form-control input-sm" id="lastName2" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="location2">Joining Date :</label> 
														<form:input
															type="date" class="form-control input-sm" id="date2" path="DOJ" />
													</div>
												</div>
											</div>
										</fieldset>
										<!-- Step 2 -->
										<h6>
											<i class="step-icon ft-comment-circle"></i>2. Contact Details
										</h6>
										<h6>
											<i class="step-icon ft-comment-circle"></i>2. Contact Details
										</h6>
										<fieldset>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Mobile Number :</label> 
														<form:input
															type="text" class="form-control input-sm" id="date2" path="moblie_no"
															placeholder="Enter Mobile Number" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Alternative Mobile
															Number :</label> <form:input type="text" class="form-control input-sm"
															id="date2" placeholder="Enter Alternative Mobile Number" path="alt_mob_no" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Email Id :</label> <form:input
															type="text" class="form-control input-sm" id="date2" path="email_id"
															placeholder="Enter Email Id" />
													</div>
												</div>

												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Country :</label> 
														<form:select
															class="custom-select form-control input-sm"
															id="location2" name="location" path="country_id">
															<form:option value="">Select Country</form:option>
															<form:option value="1">India</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">State :</label> <form:select
															class="custom-select form-control input-sm"
															id="location2" name="location" path="state_id">
															<form:option value="">Select State</form:option>
															<form:option value="1">Maharastra</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">City :</label> <form:select
															class="custom-select form-control input-sm"
															id="location2" name="location" path="city_id">
															<form:option value="">Select City</form:option>
															<form:option value="1">Pune</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Area :</label> <form:select
															class="custom-select form-control input-sm"
															id="location2" name="location" path="area_id">
															<form:option value="">Select Area</form:option>
															<form:option value="1">Vadgaon</form:option>
														</form:select>
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Pincode :</label> <form:input
															type="text" class="form-control input-sm" id="date2"
															placeholder="Enter Pincode" path="pincode" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="emailAddress3">Address :</label>
														<form:textarea name="shortDescription" id="shortDescription3"
															rows="4" class="form-control" path="address"></form:textarea>
													</div>
												</div>
											</div>
										</fieldset>
										<!-- Step 3 -->
										<h6>
											<i class="step-icon ft-airplay"></i>3. Document Details
										</h6>
										<fieldset>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="eventName2">Photo :</label> <form:input
															id="fileUpload" class="form-control " name="FileUpload"
															 type="file" path="emp_photo" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="eventName2">Pancard Number :</label> <form:input
															type="text" class="form-control" id="date2"
															placeholder="Enter Pancard Number" path="aadhar_no" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="eventName2">Pancard :</label> <form:input
															id="fileUpload" class="form-control" name="FileUpload"
															 type="file" path="pan_doc_image" />
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-4">
													<div class="form-group">
														<label for="eventName2">Adhar Card Number :</label> 
														<form:input path="aadhar_no"
															type="text" class="form-control " id="date2"
															placeholder="Enter Adhar Number" />
													</div>
												</div>
												<div class="col-md-4">
													<div class="form-group">
														<label for="eventName2">AdharCard :</label> <form:input
															id="fileUpload" class="form-control " name="FileUpload"
															multiple type="file" path="aadhar_doc_image" />
													</div>
												</div>
											</div>
										</fieldset>
										<!-- Step 4 -->
										<h6>
											<i class="step-icon ft-layout"></i>4. Role & Permissions
										</h6>
										<fieldset>
											<div class="row col-md-8">

												<div class="treeview" data-role="treeview">
													<ul>
														<li class="node" data-mode="checkbox" data-name="c0">
															<span class="leaf">Indeterminate</span> <span
															class="node-toggle"></span>
															<ul>
																<li data-mode="checkbox" data-name="c1" class="node">
																	<span class="leaf">Play video</span> <span
																	class="node-toggle"></span>
																	<ul>
																		<li data-mode="checkbox" data-name="c1_1"><span
																			class="leaf">AVI</span></li>
																		<li data-mode="checkbox" data-name="c1_2"><span
																			class="leaf">MPEG</span></li>
																		<li data-mode="checkbox" data-name="c1_3"><span
																			class="leaf">VIDX</span></li>
																		<li data-mode="checkbox" data-name="c1_3"><span
																			class="leaf">XVID</span></li>
																	</ul>
																</li>
																<li data-mode="checkbox" data-name="c2" class="node">
																	<span class="leaf">Options</span> <span
																	class="node-toggle"></span>
																	<ul>
																		<li data-mode="checkbox" data-name="c2_1"><span
																			class="leaf">Option 1</span></li>
																		<li data-mode="checkbox" data-name="c2_2"><span
																			class="leaf">Option 2</span></li>
																		<li data-mode="checkbox" data-name="c2_3" class="node">
																			<span class="leaf">Sub Options</span> <span
																			class="node-toggle"></span>
																			<ul>
																				<li data-mode="checkbox" data-name="c2_3_1"><span
																					class="leaf">Sub Option 1</span></li>
																				<li data-mode="checkbox" data-name="c2_3_2"><span
																					class="leaf">Sub Option 2</span></li>
																				<li data-mode="checkbox" data-name="c2_3_3"><span
																					class="leaf">Sub Option 3</span></li>
																			</ul>
																		</li>
																	</ul>
																</li>
																<li data-mode="checkbox" data-name="c3_1_1"><span
																	class="leaf">Other</span></li>
															</ul>
														</li>
													</ul>
												</div>

											</div>
										</fieldset>
									</form:form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</section>
			<!-- Form wizard with icon tabs section end -->
		</div>
	</div>
</div>