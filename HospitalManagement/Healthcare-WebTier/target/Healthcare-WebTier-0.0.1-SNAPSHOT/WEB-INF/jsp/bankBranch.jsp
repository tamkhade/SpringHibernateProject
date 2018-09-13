<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
            <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
                <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
                    
                        
                            $(document).ready(function() {
                                $("#bankBranchBtnSave").click(function() {
                                   
                                    $('#bankBranch_form').attr('action', 'saveBankBranch.hms')
                                    $("#bankBranch_form").submit()
                                });

                                $("#bankBranchBtnUpdate").click(function() {
                                    $('#bankBranch_form').attr('action', 'updateBankBranch.hms')
                                    $("#bankBranch_form").submit()
                                });
                            });
                        </script>
                    </head>

                       <!-- //////////////////////////////////////////////////////////////////////////////////// -->
                        <div class="app-content content container-fluid">
                            <div class="content-wrapper">
                                <div class="content-body">
                                    <section id="form-action-layouts">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div class="card">
                                                    <div class="card-header">
                                                        <h4 class="card-title" id="from-actions-multiple">BankBranch
										Master</h4>
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
                                                            <form:form id="bankBranch_form" modelAttribute="bankBranchForm" commandName="bankBranchForm" class="horizontal-form" method="post">
                                                                										 
												
                                                                          <h3>Select Bank</h3> 
                                                                          <form:select path="bnk_id" id="bnk_id">
																			<form:option value="0" disabled="true">----Select Bank-----</form:option>
																			<form:options items="${getBankMasterList}"></form:options>
																		  </form:select>  
                                                                        <h5>Add Branch Details</h5>
                                                                        <div class="row">
                                                             <form:input type="hidden" path="bnk_brnch_id" id="bnk_brnch_id" />
                                                                  <div class="col-md-3">
                                                                    <label>Area ID  :</label><br/>
                                                                    <form:select path="area_id" id="area_id">
																			<form:option value="0" disabled="true">----Select Area Id-----</form:option>
																			<form:options items="${getAreaMasterList}"></form:options>
																		  </form:select> 
                                                                  </div>
                                                                   <div class="col-md-3">
                                                                    <label>IFSC Code:</label>
                                                                   <form:input type="text" path="ifsc_cd" id="ifsc_cd" />
                                                                  </div>
                                                                   <div class="col-md-3">
                                                                    <label>MICR Code:</label>
                                                                    <form:input type="text" path="micr_cd" id="micr_cd" />
                                                                  </div>
                                                                  <div class="col-md-3">
                                                                    <label>Address:</label><br/>
                                                                   <form:input type="text" path="bnk_brnch_add" id="bnk_brnch_add" />
                                                                  </div>
                                                                  </div>
                                                                  <div class="row">
                                                                  <c:choose>
                                                                            <c:when test="${bankBranchForm.bnk_brnch_id==0}">
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="bankBranchBtnSave" style="margin-top:10px;padding-top:10px;">
                                                                                        <i class="fa fa-check-square-o"></i>Save
                                                                                    </button>
                                                                                </center>
                                                                            </c:when>
                                                                            <c:otherwise>
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="bankBranchBtnUpdate" style="margin-top:10px;padding-top:10px;">
                                                                                        <i class="fa fa-check-square-o"></i> Update
                                                                                    </button>
                                                                                </center>

                                                                            </c:otherwise>
                                                                        	</c:choose>
                                                                    </div>                                                                
                                                            </form:form>
                                                            </div>
                                                            <div class="row">
                                                                <div class="col-xs-12">
                                                                    <div class="card">

                                                                        <div class="row">
                                                                            <div class="card-body collapse in">
                                                                                <div class="card-block card-dashboard">
                                                                                    <h4 class="card-title">BankBranch Table</h4>
                                                                                    <a class="heading-elements-toggle"><i
																	class="fa fa-ellipsis-v font-medium-3"></i></a>
                                                                                    <table class="table table-striped table-bordered file-export">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>Sr No.</th>
                                                                                                <th>Area-Id</th>
                                                                                                <th>IFSC-Code</th>
                                                                                                <th>MICR-Code</th>
                                                                                                <th>Address</th>
                                                                                                <th>Actions</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <c:forEach items="${getBankBranchList}" var="bankBranch" varStatus="con">
                                                                                                <tr>
                                                                                                    <td>${con.count}</td> 
                                                                                                    <td>${bankBranch.area_id}</td>
                                                                                                    <td>${bankBranch.ifsc_cd}</td>
                                                                                                    <td>${bankBranch.micr_cd}</td>
                                                                                                    <td>${bankBranch.bnk_brnch_add}</td>
                                                                                                    <td>
                                                                                                       
                                                                                         <a href="getBankBranchById.hms?bnk_brnch_id=${bankBranch.bnk_brnch_id}"><img
																						src="../../../app-assets/images/ico/edit.ico"height="20" width="20"></a>
                                                                                         <a href="deleteBankBranch.hms?bnk_brnch_id=${bankBranch.bnk_brnch_id}"><img 
                                                                                         src="../../../app-assets/images/ico/delete.png" height="20" width="20"></a>
                                                                                                        
                                                                                                    </td>
                                                                                                </tr>
                                                                                            </c:forEach>
                                                                                        </tbody>
                                                                                        <tfoot>
                                                                                            <tr>
                                                                                                <th>Sr No.</th>
                                                                                                <th>Area-Id</th>
                                                                                                <th>IFSC-Code</th>
                                                                                                <th>MICR-Code</th>
                                                                                                <th>Address</th>
                                                                                                <th>Actions</th>
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
                                            </div>                                       

                                    </section>
                                    </div>
                                </div>
                            </div>

                        <!-- ////////////////////////////////////////////////////////////////////////////-->

                      

                    </html>