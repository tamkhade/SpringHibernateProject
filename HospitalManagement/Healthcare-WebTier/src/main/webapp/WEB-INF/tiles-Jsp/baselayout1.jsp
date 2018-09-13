<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
  <meta name="description" content="Stack admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
  <meta name="keywords" content="admin template, stack admin template, dashboard template, flat admin template, responsive admin template, web app">
  <meta name="author" content="PIXINVENT">
  <title>Hosiptal Master|Kalgaonkar Consultancy Services</title>
  <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/resources/app-assets/images/ico/apple-icon-120.png">
  <link rel="shortcut icon" type="image/x-icon" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/images/ico/favicon.ico">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i%7COpen+Sans:300,300i,400,400i,600,600i,700,700i"
  rel="stylesheet">
  <!-- BEGIN VENDOR CSS-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/fonts/feather/style.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/fonts/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/fonts/flag-icon-css/css/flag-icon.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/vendors/css/extensions/pace.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/vendors/css/pickers/daterange/daterangepicker.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/vendors/css/forms/icheck/icheck.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/vendors/css/forms/icheck/custom.css">
  <!-- END VENDOR CSS-->
  <!-- BEGIN STACK CSS-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/bootstrap-extended.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/app.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/colors.min.css">
  <!-- END STACK CSS-->
  <!-- BEGIN Page Level CSS-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/core/menu/menu-types/vertical-menu.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/plugins/forms/checkboxes-radios.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/core/menu/menu-types/vertical-overlay-menu.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/core/colors/palette-gradient.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/plugins/forms/wizard.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/app-assets/css/plugins/pickers/daterange/daterange.min.css">
  <!-- END Page Level CSS-->
  <!-- BEGIN Custom CSS-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assets/css/style.css">
  <!-- END Custom CSS-->
</head>
<body >
	<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="leftsidebar" />
		<tiles:insertAttribute name="sidebar" />

		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />


		<div class="control-sidebar-bg"></div>
	</div>
	
	<h6>Welcome to HMS</h6>
	
	  <%-- <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/vendors.min.js" type="text/javascript"></script>  --%> --%>
  <!-- BEGIN VENDOR JS-->
  
  <!-- BEGIN PAGE VENDOR JS-->
<%--    <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/jquery.dataTables.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/datatable/dataTables.bootstrap4.min.js"
  type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/datatable/dataTables.buttons.min.js"
  type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/buttons.flash.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/jszip.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/pdfmake.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/vfs_fonts.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/buttons.html5.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/tables/buttons.print.min.js" type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  
  <!-- BEGIN PAGE VENDOR JS-->
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/extensions/jquery.steps.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/pickers/dateTime/moment-with-locales.min.js"
  type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/pickers/daterange/daterangepicker.js"
  type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/forms/validation/jquery.validate.min.js"
  type="text/javascript"></script>
  <!-- END PAGE VENDOR JS-->
  <!-- BEGIN STACK JS-->
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/core/app-menu.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/core/app.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/scripts/customizer.min.js" type="text/javascript"></script>
  <!-- END STACK JS-->
  <!-- BEGIN PAGE LEVEL JS-->
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/scripts/forms/wizard-steps.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/scripts/forms/wizard-steps.hospital.js" type="text/javascript"></script>
  
    <script src="${pageContext.request.contextPath}/resources/app-assets/vendors/js/forms/icheck/icheck.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/app-assets/js/scripts/forms/checkbox-radio.min.js" type="text/javascript"></script>
   <script src="${pageContext.request.contextPath}/resources/app-assets/js/scripts/tables/datatables/datatable-advanced.js"
  type="text/javascript"></script>  --%>
</body>
</html>