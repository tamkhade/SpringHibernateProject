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
                                $("#cityBtnSave").click(function() {
                                   
                                    $('#city_form').attr('action', 'saveCity.hms')
                                    $("#city_form").submit()
                                });

                                $("#cityBtnUpdate").click(function() {
                                    $('#city_form').attr('action', 'updateCity.hms')
                                    $("#city_form").submit()
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
                                                        <h4 class="card-title" id="from-actions-multiple">City
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
                                                            <form:form id="city_form" modelAttribute="cityForm" commandName="cityForm" class="horizontal-form" method="post">
                                                                <div class="row">
                                                                    <div class="col-md-6">
												<form:select path="state_id" id="state">
													<form:option value="0" disabled="true">----Select State-----</form:option>
													<form:options items="${getstateMasterList}"></form:options>
												</form:select>
												<span><label>Add City :</label>
							   												  <form:input type="hidden" path="city_id" id="city_id" />
                                                                                <form:input type="text" path="city_name" id="city_name" />
                                                                        
							     											  <c:choose>
                                                                            <c:when test="${cityForm.city_id==0}">
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="cityBtnSave">
                                                                                        <i class="fa fa-check-square-o"></i>Save
                                                                                    </button>
                                                                                </center>

                                                                            </c:when>
                                                                            <c:otherwise>
                                                                                <center>
                                                                                    <button type="button" class="btn btn-primary mr-1" id="cityBtnUpdate">
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
                                                                                    <h4 class="card-title">City Table</h4>
                                                                                    <a class="heading-elements-toggle"><i
																	class="fa fa-ellipsis-v font-medium-3"></i></a>
                                                                                    <table class="table table-striped table-bordered file-export">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>Sr No.</th>
                                                                                                <th>City</th>
                                                                                                <th>Actions</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tbody>
                                                                                            <c:forEach items="${getCityList}" var="city" varStatus="con">
                                                                                                <tr>
                                                                                                    <td>${con.count}</td> 
                                                                                                    <td>${city.city_name}</td>
                                                                                                    <td>
                                                                                                       
                                                                                         <a href="getCityById.hms?city_id=${city.city_id}"><img
																						src="../../../app-assets/images/ico/edit.ico"height="20" width="20"></a>
                                                                                         <a href="deleteCity.hms?city_id=${city.city_id}"><img 
                                                                                         src="../../../app-assets/images/ico/delete.png" height="20" width="20"></a>
                                                                                                        
                                                                                                    </td>
                                                                                                </tr>
                                                                                            </c:forEach>
                                                                                        </tbody>
                                                                                        <tfoot>
                                                                                            <tr>
                                                                                                <th>Sr No</th>
                                                                                                <th>City</th>
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