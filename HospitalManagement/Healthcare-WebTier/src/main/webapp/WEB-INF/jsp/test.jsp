<div class="app-content content container-fluid">
    <div class="content-wrapper">
        <div class="content-body">
            <!-- Form wizard with icon tabs section start -->
            <section id="icon-tabs">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="card">
                           
                            <div class="card-body collapse in">
                                <div class="card-block">
                                    <form action="#" class="icons-tab-steps wizard-circle">
                                        <!-- Step 1 -->
                                        <h6><i class="step-icon ft-home"></i>1. Organization Info</h6>
                                        <fieldset>
                                            <div class="row">
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="hospital type">Organization Type :</label>
                                                        <select class="custom-select form-control input-sm" id="ht" name="ht">
                                                            <option value="">Organization Type </option>
                                                            <option value="Clinic">Clinic</option>
                                                            <option value="Hospital">Hospital</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="hospital name ">Organization Name :</label>
                                                        <input type="text" class="form-control input-sm" name="hn">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="website">Website :</label>
                                                        <input type="text" class="form-control input-sm" id="wb" name="wb">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="email">Email :</label>
                                                        <input type="email" class="form-control input-sm" id="em" name="em">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="row">
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="">Address :</label>
                                                        <textarea class="form-control " rows="4" id="ad" name="ad" style="margin:10px;"></textarea>
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label>Pincode:</label>
                                                        <input type="text" class="form-control input-sm" id="em" placeholder="Enter Pincode" name="em">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>City:</label>
                                                        <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                            <option value="0" disabled="true">Select City</option>
                                                            <option value="1">Pune</option>

                                                        </select>
                                                    </div>

                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label>Landmark:</label>

                                                        <input id="text" class="form-control input-sm " id="" placeholder="Enter Landmark">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>State:</label>
                                                        <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                            <option value="0" disabled="true">Select State</option>
                                                            <option value="1">maharashtra</option>

                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label>Area:</label>
                                                        <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                            <option value="0" disabled="true">Select Area</option>
                                                            <option value="1">Hadapsar</option>

                                                        </select>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Country:</label>
                                                        <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                            <option value="0" disabled="true">Select Country</option>
                                                            <option value="1">India</option>

                                                        </select>
                                                    </div>
                                                </div>

                                            </div>

                                            <div class="row">
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="lno">Land-line Number :</label>
                                                        <input type="text" class="form-control input-sm" id="ln" name="ln">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="cno">Contact Number :</label>
                                                        <input type="text" class="form-control input-sm" id="cn" name="cn">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group" style="margin-left:10px;padding-left:10px;">
                                                        <label for="logo">Logo :</label>
                                                        <input id="fileUpload" class="form-control " name="FileUpload" multiple="" type="file">
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group">
                                                        <label for="pincode">Hospital Reg No:</label>
                                                        <input type="text" class="form-control input-sm" id="pin" name="pin">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-2">
                                                    <div class="form-group">
                                                        <label>Having Branch</label>
                                                        
                                                    </div>
                                                </div>
                                            </div>

                                            <div id="dvBranch" style="display:none;">
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label for="hospital type">Organization Type :</label>
                                                            <select class="custom-select form-control input-sm" id="ht" name="ht">
                                                                <option value="">Organization Type </option>
                                                                <option value="Clinic">Clinic</option>
                                                                <option value="Hospital">Hospital</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label for="hospital name ">Branch Name :</label>
                                                            <input type="text" class="form-control input-sm" name="hn">
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label for="website">Website :</label>
                                                            <input type="text" class="form-control input-sm" id="wb" name="wb">
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label for="email">Email :</label>
                                                            <input type="email" class="form-control input-sm" id="em" name="em">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label for="">Address :</label>
                                                            <textarea class="form-control " rows="4" id="ad" name="ad" style="margin:10px;"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label>Pincode:</label>
                                                            <input type="text" class="form-control input-sm" id="em" placeholder="Enter Pincode" name="em">
                                                        </div>
                                                        <div class="form-group">
                                                            <label>City:</label>
                                                            <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                                <option value="0" disabled="true">Select City</option>
                                                                <option value="1">Pune</option>

                                                            </select>
                                                        </div>

                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label>Landmark:</label>

                                                            <input id="text" class="form-control input-sm " id="" placeholder="Enter Landmark">
                                                        </div>
                                                        <div class="form-group">
                                                            <label>State:</label>
                                                            <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                                <option value="0" disabled="true">Select State</option>
																<option value=" 1 ">maharashtra</option>

															</select>
														</div>
													</div>
													<div class="col-md-3 ">
								     <div class="form-group ">
										<label>Area:</label>
										<select class="custom-select form-control input-sm " id="ct " name="ct ">
											<option value="0 " disabled="true">Select Area</option>
                                                                <option value="1">Hadapsar</option>

                                                            </select>
                                                        </div>
                                                        <div class="form-group">
                                                            <label>Country:</label>
                                                            <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                                <option value="0" disabled="true">Select Country</option>
											<option value=" 1 ">India</option>

										  </select>
									 </div>
								  </div>
								  </div>
								 <div class="row ">
								   <div class="col-md-3 ">
										<div class="form-group ">
											<label for="lno ">Land-line Number :</label>
											<input type="text " class="form-control input-sm " id="ln " name="ln ">
										</div>
                             </div>
						    <div class="col-md-3 ">
                            <div class="form-group ">
                              <label for="cno ">Contact Number :</label>
                              <input type="text " class="form-control input-sm " id="cn " name="cn ">
                            </div>
                          </div>
						   <div class="col-md-3 ">
                            <div class="form-group " style="margin-left:10px;padding-left:10px; ">
                              <label for="logo ">Logo :</label>
                            <input id="fileUpload " class="form-control " name="FileUpload " multiple=" " type="file ">
						   </div>
                          </div>
						   <div class="col-md-3 ">
                            <div class="form-group ">
                              <label for="pincode ">Branch Reg No:</label>
                              <input type="text " class="form-control input-sm " id="pin " name="pin ">
                            </div>
                          </div>
                           </div>

						</div>

                      </fieldset>
                      <!-- Step 2 -->
                      <h6><i class="step-icon ft-comment-circle "></i>2. Administration</h6>
                    <fieldset>
					  <div class="row ">
                          <div class="col-md-1 ">
						     <div class="form-group ">
							    <label for="dr "> Title:</label>
                                <select class="custom-select form-control input-sm " id="sl " name="sl ">
                                <option value="dr ">Dr</option>
                                <option value="mr ">Mr</option>
                                <option value="miss ">Miss</option>
                                </select>
							 </div>
						  </div>
						  <div class="col-md-3 ">
						     <div class="form-group ">
							    <label for="lname ">First Name :</label>
                                   <input type="text " class="form-control input-sm " id="lname " name="lname ">
							 </div>
						  </div>
						  <div class="col-md-4 ">
						     <div class="form-group ">
							     <label for="fname ">Middle Name :</label>
                                   <input type="text " class="form-control input-sm " id="fname " name="fname ">
							 </div>
						   </div>
						   <div class="col-md-4 ">
							  <div class="form-group ">
							    <label for="mname ">Last Name :</label>
                                  <input type="text " class="form-control input-sm " id="mname " name="mname ">
						      </div>
						   </div>
						  </div>
						  <div class="row ">
						    <div class="col-md-3 ">
                                    <div class="form-group ">
							            <label for="roles "> Roles :</label>
                                            <select class="custom-select form-control input-sm " id="role " name="role ">
                                                <option value="ad ">Admin</option>
                                            </select>
							        </div>
					      	</div>
								 <div class="col-md-3 ">
						            <div class="form-group ">
							            <label for="lname ">Username :</label>
                                            <input type="text " class="form-control input-sm " id="lname " name="lname ">
							        </div>
								</div>
								<div class="col-md-3 ">
                                    <div class="form-group ">
							            <label for="password ">Password :</label>
                                            <input type="password " class="form-control input-sm " id="password " name="password ">
							        </div>
							    </div>
							    <div class="col-md-3 ">
                                    <div class="form-group ">
							                <label for="confirm_password ">Confirm Password :</label>
                                                <input type="confirm_password " class="form-control input-sm " id="confirm_password " name="confirm_password ">
						            </div>
							    </div>
						  </div>

                        <div class="row ">								
							    <div class="col-md-3 ">
                                     <div class="form-group ">
							            <label for="mobileno ">Mobile Number :</label>
                                            <input type="text " class="form-control input-sm " id="mobile " name="mobile ">
							         </div>
							     </div>
							    <div class="col-md-3 ">
                                        <div class="form-group ">
							             <label for="mobileno ">Alternate Mobile Number :</label>
                                          <input type="text " class="form-control input-sm " id="mobile " name="mobile ">
							            </div>
							    </div>

                            <div class="col-md-3 ">
                                <div class="form-group ">
							        <label for="email ">Email ID:</label>
                                      <input type="email " class="form-control input-sm " id="email " name="email ">
							    </div>
							</div>
							 <div class="col-md-3 ">
                                    <div class="form-group input-sm ">
							           <label for="username ">Education :</label>
                                            <select class="custom-select form-control input-sm " id="ci " name="ci ">
                                                <option value="city ">e1</option>
                                                <option value="Amsterdam ">e2</option>
                                                <option value="Berlin ">e3</option>
                                                <option value="Frankfurt ">e4</option>
                                            </select>
							        </div>
							    </div>
						</div>
						<div class="row ">
						   <div class="col-md-3 ">
									<div class="form-group ">
										<label for=" ">Address :</label>
											<textarea class="form-control " rows="4 " id="ad " name="ad " style="margin:10px; "></textarea>
									</div>
							   </div>
							    <div class="col-md-3 ">
									<div class="form-group ">
										<label>Pincode:</label>
										<input type="text " class="form-control input-sm " id="em " placeholder="Enter Pincode " name="em ">	
									 </div>
									 <div class="form-group ">
										<label>City:</label>
									    <select class="custom-select form-control input-sm " id="ct " name="ct ">
											<option value="0 " disabled="true ">Select City</option>
											<option value="1 ">Pune</option>

										  </select>	
									 </div>

								</div>
								 <div class="col-md-3 ">
								   <div class="form-group ">
										<label>Landmark:</label>

                                    <input id="text " class="form-control input-sm " id=" " placeholder="Enter Landmark ">
									 </div>
									 <div class="form-group ">
										<label>State:</label>
										 <select class="custom-select form-control input-sm " id="ct " name="ct ">
											<option value="0 " disabled="true">Select State</option>
                                                                <option value="1">maharashtra</option>

                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-3">
                                                        <div class="form-group">
                                                            <label>Area:</label>
                                                            <select class="custom-select form-control input-sm" id="ct" name="ct">
                                                                <option value="0" disabled="true">Select Area</option>
											<option value=" 1 ">Hadapsar</option>

										  </select>
									 </div>
									 <div class="form-group ">
										<label>Country:</label>
										 <select class="custom-select form-control input-sm " id="ct " name="ct ">
											<option value="0 " disabled="true">Select Country</option>
                                                                <option value="1">India</option>

                                                            </select>
                                                        </div>
                                                    </div>

                                                </div>

                                        </fieldset>
                                        <!-- Step 3 -->
                                        <h6><i class="step-icon ft-airplay"></i>3. Speciality & Modules List</h6>
                                        <fieldset>
                                            <p class="text-primary">1. EMR / Speciality List</p>
                                            <div class="row skin skin-flat">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">General Practitioner</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Gynecology</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Pediatric</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row skin skin-flat">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Orthopedic</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Ophthalmology</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Cardiology</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <p class="text-primary">2. Module List</p>
                                            <div class="row skin skin-flat">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Reception</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Billing Counter</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">IPD</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row skin skin-flat">
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Store</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">Insurance</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-4">
                                                    <div class="form-group">
                                                        <input type="checkbox" id="input-15">
                                                        <label for="input-15">LIS</label>
                                                    </div>
                                                </div>
                                            </div>
                                        </fieldset>
                                        <!-- step 4 -->

                                        <h6><i class="step-icon ft-airplay"></i>4. Bank-Account Details</h6>
                                        <fieldset>
                                            <div class="row">
                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2">Bank Name :</label>
                                                        <select id="s3" class="form-control input-sm">
                                                            <option value="0" disabled="true">Select Bank Name</option>
                                                            <option value="1">IDBI</option>

                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2">Bank Branch :</label>
                                                        <select id="s3" class="form-control input-sm">
                                                            <option value="0" disabled="true">Select Bank Branch</option>
                                                            <option value="1">Pune Branch</option>

                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2">IFSC Code:</label>
                                                        <input id="text" class="form-control input-sm " id="" placeholder="Enter IFSC Code">
                                                    </div>
                                                </div>
                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2">MICR Code:</label>
                                                        <input id="text" class="form-control input-sm " id="" placeholder="Enter MICR Code">
                                                    </div>
                                                </div>
                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2"> Account Type :</label>
                                                        <select id="s3" class="form-control input-sm">
                                                            <option value="0" disabled="true">Select Account Type</option>
                                                            <option value="1">saving</option>

                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-2">
                                                    <div class="form-group input-sm">
                                                        <label for="eventName2">Account Number:</label>
                                                        <input id="text" class="form-control input-sm " id="" placeholder="Enter Bank Acc No">
                                                    </div>
                                                </div>

                                            </div>
                                        </fieldset>

                                    </form>
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