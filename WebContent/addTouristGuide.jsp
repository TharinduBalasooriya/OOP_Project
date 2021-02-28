<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add New Tourist Guide</title>
		

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

		<div class="wrapper">
			<div class="inner" >
				<form action="AddTouristGuideServlet" method="post">
					<h3>Add New Tourist Guide</h3>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Name *</label>
							<input type="text" class="form-control" placeholder="Name" name="name">
						</div>
					</div>
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Licen No *</label>
							<input type="text" class="form-control" placeholder="licen No" name="licenNo">
						</div>
					</div>
				
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Gender *</label>
							<input type="text" class="form-control" placeholder="MALE/FEMALE" name="gender">
						</div>
					</div>
                    
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Languages *</label>
							<input type="text" class="form-control" placeholder="languages" name="lng">
						</div>
					</div>
                    
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Age *</label>
							<input type="text" class="form-control" placeholder="age" name = "age">
						</div>
					</div>
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Rate  *</label>
							<input type="text" class="form-control" placeholder="rate per day" name="rate">
						</div>
					</div>
                    
                    
                    
					<button data-text="Add Now">
						<span>Add Now</span>
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