<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.tour_guide.model.TourPackage"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>RegistrationForm_v9 by Colorlib</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="add-tour-front/fonts/linearicons/style.css">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="add-tour-front/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

		<!-- DATE-PICKER -->
		<link rel="stylesheet" href="add-tour-front/vendor/date-picker/css/datepicker.min.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="add-tour-front/css/style.css">
	</head>
	<% 
	
		//tour package update form
		/*
			catch the tour package from 
			Http request object
		*/
		TourPackage tp = (TourPackage)request.getAttribute("TOUR");
	
		/*
			display current details
		*/
	%>

	<body>

		<div class="wrapper">
			<div class="inner">
				<form action="UpdateTourPackageServlet" method= "post">
					<input type = "hidden" value=<%= tp.getTourId() %> name= "tourID">
					<h3>Update Tour package</h3>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Title *</label>
							<input type="text" class="form-control"  name = "title" value = <%= tp.getTitle() %>>
						</div>
					</div>
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Price *</label>
							<input type="text" class="form-control" value=<%= tp.getPrice() %> name="price">
						</div>
					</div>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Start-date *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here"  id="dp1" name="sDate"
							value=<%=tp.getStartDate() %>>
						</div>
						<div class="form-wrapper">
							<label for="">End - date *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here"  id="dp2" name = "eDate"
							value=<%=tp.getEndDate() %>>
						</div>
					</div>
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Available seats *</label>
							<input type="text" class="form-control" value=<%=tp.getAvailableSeats() %> name= "seats">
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Destinations : </label>
							<input type="text" class="form-control"  name = "dst" value=<%=tp.getDestinations() %>>
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Discount : </label>
							<input type="text" class="form-control" name = "discount" value = <%= tp.getDiscount() %>>
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">ImageUrl : </label>
							<input type="text" class="form-control" name = "image" value=<%=tp.getImageURL() %>>
						</div>
					</div>
					
					
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Description *</label>
                            <br/>
							<textarea id="w3mission" rows="4" cols="50" name = "dsc" >
                               
                               <%=tp.getDiscription() %>
                            </textarea>
                            
						</div>
					</div>
					<button data-text="Update" type= "submit">
						<span>Update Details</span>
					</button>
				</form>
			</div>
		</div>
		
		<script src="js/jquery-3.3.1.min.js"></script>

		<!-- DATE-PICKER -->
		<script src="vendor/date-picker/js/datepicker.js"></script>
		<script src="vendor/date-picker/js/datepicker.en.js"></script>

		<script src="js/main.js"></script>
	</body>
</html>