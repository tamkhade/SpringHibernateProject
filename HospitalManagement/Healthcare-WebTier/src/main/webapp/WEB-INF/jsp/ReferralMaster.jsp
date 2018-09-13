<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="app-content content container-fluid">
	<div class="content-wrapper">
		<div class="content-header row">
			<div class="content-header-left col-md-6 col-xs-12 mb-2">
				<h3 class="content-header-title mb-0">Referral</h3>
				<div class="row breadcrumbs-top">
					<div class="breadcrumb-wrapper col-xs-12">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="index-2.html">Home</a>
							</li>
							<li class="breadcrumb-item"><a href="#">Form Layouts</a></li>
							<li class="breadcrumb-item active"><a href="#">Form </a></li>
						</ol>
					</div>
				</div>
			</div>
			<div class="content-header-right col-md-6 col-xs-12">
				<div role="group" aria-label="Button group with nested dropdown"
					class="btn-group float-md-right">
					<div role="group" class="btn-group">
						<button id="btnGroupDrop1" type="button" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"
							class="btn btn-outline-primary dropdown-toggle dropdown-menu-right">
							<i class="ft-cog icon-left"></i> Settings
						</button>
						<div aria-labelledby="btnGroupDrop1" class="dropdown-menu">
							<a href="card-bootstrap.html" class="dropdown-item">Bootstrap
								Cards</a> <a href="component-buttons-extended.html"
								class="dropdown-item">Buttons Extended</a>
						</div>
					</div>
					<a href="calendars-clndr.html" class="btn btn-outline-primary"><i
						class="ft-mail"></i></a> <a href="timeline-center.html"
						class="btn btn-outline-primary"><i class="ft-pie-chart"></i></a>
				</div>
			</div>
		</div>
		<div class="content-body">
		
		
			<section id="form-action-layouts">
			<form:form method="post" modelAttribute="referralMasterModel"
					commandName="referralMasterModel" action="getRefferalMaster.hms">
					<div class="row" >
										<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<h4 class="card-title" id="from-actions-multiple">Referral</h4>
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
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Facility :</label>
													<div class="form-group">
														<form:select class="custom-select form-control input-sm "
															id="ct" name="ct" path="org_id">
															<option value="country">Select Facility </option>
															<option value=1>KCS</option>
															<option value=2>KCS1</option>
															<option value=3>KCS2</option>
														</form:select>
													</div>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Referral Type :</label>
													<form:select class="custom-select form-control input-sm "
														id="ct" name="ct" path="ref_typ_id" items="${referencetypemasterList}" >

													</form:select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Code:</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Code" id="mname" name="mname"
														path="ref_code"/>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Referral Name:</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Referral Name" id="mname" name="mname"
														path="ref_name" />
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Marketing Person :</label>
													<form:select class="custom-select form-control input-sm"
														id="ct" name="ct" path="mrkt_prsn_id" items="${marketpersonList}">

													</form:select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Contact Person :</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Contact Person" id="mname" name="mname"
														path="contct_persn_nm" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Landline Number</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Landline Number" id="mname"
														name="mname" path="ref_ph_no" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Contact Number</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Landline Number" id="mname"
														name="mname" path="ref_mob_no" />
												</div>
											</div>


										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label"> Alternate Contact
														Number</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Landline Number" id="mname"
														name="mname" path="ref_alt_mob_no" />
												</div>
											</div>

											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Email ID :</label>
													<form:input type="email" class="form-control input-sm"
														placeholder="Enter Your Email ID" id="mname" name="mname"
														path="ref_email" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Active From :</label>
													<div class="input-group">
														<span class="input-group-addon"> <span
															class="fa fa-calendar-o"></span>
														</span>
														<form:input type='text'
															class="form-control input-sm pickadate"
															placeholder="Active From" path="ref_actv_frm" />
													</div>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Active To :</label>
													<div class="input-group">
														<span class="input-group-addon"> <span
															class="fa fa-calendar-o"></span>
														</span>
														<form:input type='text'
															class="form-control input-sm pickadate"
															placeholder="Active To" path="ref_actv_to" />
													</div>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Address 1:</label>
													<textarea class="form-control input-sm" rows="1"
														id="comment"></textarea>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Address 2:</label>
													<form:textarea class="form-control input-sm" rows="1"
														id="comment" path="ref_address"></form:textarea>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Pincode:</label>
													<form:input type="text" class="form-control input-sm"
														placeholder="Enter Pincode" id="" name=""
														path="ref_pincode" />
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Country :</label> <select
														class="custom-select form-control input-sm " id="ct"
														name="ct">
														<option value="country">Select Country </option>
														<option value="">India</option>
														<option value="">Japan</option>
														<option value="">China</option>
													</select>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">State :</label> <select
														class="custom-select form-control input-sm " id="ct"
														name="ct">
														<option value="country">Select State  </option>
														<option value="">Maharashtra</option>
														<option value="">Asam</option>
														<option value="">Gujarat</option>
													</select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">City/Town :</label> <select
														class="custom-select form-control input-sm " id="ct"
														name="ct">
														<option value="country">Select City/Town </option>
														<option value="">Pune</option>
														<option value="">Mumbai</option>
														<option value="">Kolhapur</option>
													</select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label for="mname" class="label">Area :</label>

													<form:select class="custom-select form-control input-sm "
														id="ct" name="ct" path="area_id">
														<option value="country">Select Area</option>
														<option value=1>Karve Nagar</option>
														<option value=2>Nal Stop</option>
													</form:select>
												</div>
											</div>
											<div class="col-md-3">
												<div class="form-group">
													<label>Birth Date :</label>
													<div class="input-group">
														<span class="input-group-addon"> <span
															class="fa fa-calendar-o"></span>
														</span>
														<form:input type='text'
															class="form-control input-sm pickadate" placeholder=""
															path="ref_dob" />
													</div>
												</div>
											</div>

										</div>
										<div class="row">
											<div class="col-md-3">
												<div class="form-group">
													<label>Anniversary From :</label>
													<div class="input-group">
														<span class="input-group-addon"> <span
															class="fa fa-calendar-o"></span>
														</span>
														<form:input type='text'
															class="form-control input-sm pickadate"
															placeholder="Anniversary From" path="ref_anniversary" />
													</div>
												</div>
											</div>
										<!-- 	<div class="col-md-3">
												<div class="form-group">
													<label for="" class="label">Is Active :</label> </br> <input
														type="checkbox" class="form-group input-sm" sid="" name="">
												</div>
											</div> -->
										</div>
										<div class="row">
											<div class="col-md-12">
												<div class="form-group">
													<button type="submit" class="btn btn-primary btn-sm"
														style="float: right;">Submit</button>
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
		<div class="row">
			<div class="col-md-12">
				<!-- BEGIN EXAMPLE TABLE PORTLET-->
				<div class="portlet light bordered">
					<div class="portlet-title">
						<div class="caption font-dark">
							<i class="icon-settings font-dark"></i> <span
								class="caption-subject bold uppercase">Buttons</span>
						</div>
						<div class="tools"></div>
					</div>
					<div class="portlet-body">

						<table class="table table-striped table-bordered table-hover"
							id="sample_1">
							<thead>
								<tr>
									<th>Contact Person</th>
									<th>Referral Name:</th>
									<th>Email ID :</th>
									
								</tr>
							</thead>

							<c:forEach items="${referralmasterlist}" var="referralmaster">
								<tfoot>
									<tr>
										
										<th>${referralmaster.contct_persn_nm}</th>
										<th>${referralmaster.ref_name}</th>
										<th>${referralmaster.ref_email}</th>
										


									</tr>
								</tfoot>

							</c:forEach>

						</table>
					</div>
				</div>
				<!-- END EXAMPLE TABLE PORTLET-->
			</div>
		</div>
		<!-- cbody -->
	</div>
</div>