<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $(".show-text").click(function(){
    	$('#myModal').find(".lots-of-text").toggle();
        $('#myModal').modal('handleUpdate');
    });
});
</script>
<style type="text/css">
.bs-example{
	margin: 20px;
}
.lots-of-text{
    display: none;
}
</style>
</head>
<body>
<div class="bs-example">
    <div class="alert alert-info fade in">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Note!</strong> Also try this example without using the .modal('handleUpdate') method (simply comment out the line no-13), you will see the modal is jumping to the left side if viewport scrollbar is appear due to loading of huge amount of content inside the modal while it is open.
    </div>
    
    <!-- Button HTML (to Trigger Modal) -->
    <input type="button" data-toggle="modal" data-target="#myModal" class="btn btn-lg btn-primary" value="Show Adjustable Modal">
    
    <!-- Modal HTML -->
    <div id="myModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Confirmation</h4>
                </div>
                <div class="modal-body">
                    <p><button type="button" class="btn btn-link show-text">Patient has been added successfully in the system</button></p>
                    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-dismiss="modal">View Patients</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
                           