<!DOCTYPE html>
<%@page import="com.tour_guide.model.TouristGuide"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Update Tourist Guide</title>
		

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="tourist-guides-front/fonts/linearicons/style.css">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="tourist-guides-front/fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

		<!-- DATE-PICKER -->
		<link rel="stylesheet" href="tourist-guides-front/vendor/date-picker/css/datepicker.min.css">
		
		<!-- STYLE CSS -->
		<link rel="stylesheet" href="tourist-guides-front/css/style.css">
	</head>

	<body>
		<% 
			TouristGuide tg = (TouristGuide)request.getAttribute("GUIDE");
		%>

		<div class="wrapper">
			<div class="inner">
				<form action="UpdateTouristGuideServlet" method="post">
					<h3>Update Tourist Guide</h3>
					<div class="form-row">
						<div class="form-wrapper">
							<input type="hidden" class="form-control" value = <%=tg.getGuideID() %> name="id">
							<label for="">Name *</label>
							<input type="text" class="form-control" value = <%=tg.getName() %> name="name">
						</div>
					</div>
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Licen No *</label>
							<input type="text" class="form-control" value = <%=tg.getLicenNo() %> name="licen">
						</div>
					</div>
				
				`<div class="form-row">
						<div class="form-wrapper">
							<label for="">Languages *</label>
							<input type="text" class="form-control" value = <%=tg.getLanguages() %> name="lng">
						</div>
					</div>
				
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Gender *</label>
							<input type="text" class="form-control" value = <%=tg.getGender() %> name="gender">
						</div>
					</div>
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Age *</label>
							<input type="text" class="form-control" value = <%=tg.getAge() %> name="age">
						</div>
					</div>
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Rate  *</label>
							<input type="text" class="form-control" value = <%=tg.getRate() %> name="rate"> 
						</div>
					</div>
                    
                    
                    
					<button data-text="Update">
						<span>Update</span>
					</button>
				</form>
			</div>
		</div>
		
		<script src="js/jquery-3.3.1.min.js"></script>

		<!-- DATE-PICKER -->
		<script src="vendor/date-picker/js/datepicker.js"></script>
		<script src="vendor/date-picker/js/datepicker.en.js"></script>

		<script src="js/main.js"></script>
	</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>