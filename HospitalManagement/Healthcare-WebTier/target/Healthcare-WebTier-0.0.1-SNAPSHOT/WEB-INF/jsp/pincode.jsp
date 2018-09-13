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
                                $("#pincodeBtnSave").click(function() {
                                   
                                    $('#pincode_form').attr('action', 'savePincode.hms')
                                    $("#pincode_form").submit()
                                });

                                $("#pincodeBtnUpdate").click(function() {
                                    $('#pincode_form').attr('action', 'updatePinCode.hms')
                                    $("#pincode_form").submit()
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
                                                        <h4 class="card-title" id="from-actions-multiple">Pincode
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
                                                            <form:form id="pincode_form" modelAttribute="pincodeForm" commandName="pincodeForm" class="horizontal-form" method="post">
                                                                <div class="row">
                                                                    <div class="col-md-6">

 																		<span><label>Add PinCode :</label>
							   												  <form:input type="hidden" path="pincode_id" id="pincode_id" />
                                                                                <form:input type="text" path="pincode_number" id="pincode_number" />
                                                                        
							     											  <c:choose>
                                                                            <c:when test="${pincodeForm.pincode_id==0}">
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="pincodeBtnSave">
                                                                                        <i class="fa fa-check-square-o"></i>Save
                                                                                    </button>
                                                                                </center>

                                                                            </c:when>
                                                                            <c:otherwise>
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="pincodeBtnUpdate">
                                                                                        <i class="fa fa-check-square-o"></i> Update
                                                                                    </button>
                                                                                </center>

                                                                            </c:otherwise>
                                                                        	</c:choose>
                                                                        </span>
                                                                    </div>
                                                                </div>
                                                            </form:form>
                                                            <div class="row">
                                                                <div class="col-xs-12">
                                                                    <div class="card">

                                                                        <div class="row">
                                                                            <div class="card-body collapse in">
                                                                                <div class="card-block card-dashboard">
                                                                                    <h4 class="card-title">Pincode Table</h4>
                                                                                    <a class="heading-elements-toggle"><i
																	class="fa fa-ellipsis-v font-medium-3"></i></a>
                                                                                    <table class="table table-striped table-bordered file-export">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>Sr No.</th>
                                                                                                <th>Pincode Table</th>
                                                                                                <th>Actions</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <c:forEach items="${getPincodeList}" var="pincode" varStatus="con">
                                                                                                <tr>
                                                                                                    <td>${con.count}</td> 
                                                                                                    <td>${pincode.pincode_number}</td>
                                                                                                    <td>
                                                                                                       
                                                                                         <a href="getPincodeById.hms?pincode_id=${pincode.pincode_id}"><img
																						src="../../../app-assets/images/ico/edit.ico"height="20" width="20"></a>
                                                                                         <a href="deletePincode.hms?pincode_id=${pincode.pincode_id}"><img 
                                                                                         src="../../../app-assets/images/ico/delete.png" height="20" width="20"></a>
                                                                                                        
                                                                                                    </td>
                                                                                                </tr>
                                                                                            </c:forEach>
                                                                                        </tbody>
                                                                                        <tfoot>
                                                                                            <tr>
                                                                                                <th>Sr No</th>
                                                                                                <th>Pincode Table</th>
                                                                                                <th>Action</th>

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
                                        </div>

                                    </section>
                                </div>
                            </div>
                        </div>

                        <!-- ////////////////////////////////////////////////////////////////////////////-->

                      

                    </html>