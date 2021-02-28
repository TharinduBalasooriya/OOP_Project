<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add new Tour Package</title>
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

	<body>

		<div class="wrapper">
			<div class="inner">
				<form action="AddTourPackageServlet" method= "post">
					<h3>Add new Tour package</h3>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Title *</label>
							<input type="text" class="form-control" placeholder="Title" name = "title">
						</div>
					</div>
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Price *</label>
							<input type="text" class="form-control" placeholder="Price" name="price">
						</div>
					</div>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Start-date *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here"  id="dp1" name="sDate"
							placeholder = "start date">
						</div>
						<div class="form-wrapper">
							<label for="">End - date *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here"  id="dp2" name = "eDate"
							placeholder = "end date">
						</div>
					</div>
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Available seats *</label>
							<input type="text" class="form-control" placeholder="seats" name= "seats">
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Destinations : </label>
							<input type="text" class="form-control"  name = "dst">
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Discount : </label>
							<input type="text" class="form-control" name = "discount">
						</div>
					</div>
					
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">ImageUrl : </label>
							<input type="text" class="form-control" name = "image">
						</div>
					</div>
					
					
                    
                    <div class="form-row">
						<div class="form-wrapper">
							<label for="">Description *</label>
                            <br/>
							<textarea id="w3mission" rows="4" cols="50" name = "dsc">
                                Description of tour Packages.
                            </textarea>
                            
						</div>
					</div>
					<button data-text="ADD" type= "submit">
						<span>ADD</span>
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