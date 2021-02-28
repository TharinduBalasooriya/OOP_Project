<!DOCTYPE html>
<%@page import="com.tour_guide.model.User"%>
<html lang="en">
<head>
	<title>Login V13</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="signUP-front/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="signUP-front/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="signUP-front/css/util.css">
	<link rel="stylesheet" type="text/css" href="signUP-front/css/main.css">
<!--===============================================================================================-->


<% 
	if(session.getAttribute("activeUser") == null){
	response.sendRedirect("customerLogin.jsp");	

	}else{
	
	
	User user = new User();
	user = (User)session.getAttribute("activeUser");
	String userType = (String)session.getAttribute("userType");

%>

</head>
<body style="background-color: #999999;">

	
	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more" style="background-image: url('signUP-front/images/bg-01.jpg');"></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action = "UpdateUserServlet">
					<span class="login100-form-title p-b-59">
						Update My Profile
					</span>
						<input type = "hidden" value=<%= user.getUserID() %> name = "id">
						<input type = "hidden" value=<%= userType %> name = "uType">
					<div class="wrap-input100 validate-input" data-validate="Name is required">
						<span class="label-input100">Full Name</span>
						<input class="input100" type="text" name="name" value = <%= user.getFullName() %>>
						<span class="focus-input100"></span>
					</div>
	
					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<span class="label-input100">Email</span>
						<input class="input100" type="text" name="email" value = <%= user.getEmail() %>>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Username is required">
						<span class="label-input100">Mobile No</span>
						<input class="input100" type="text" name="phone" value = <%= user.getMobile() %>>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="text" name="pass" value = <%= user.getPassword() %>>
						<span class="focus-input100"></span>
					</div>
					<%
						}
					%>
					<div class="wrap-input100 validate-input" data-validate = "Repeat Password is required">
						<span class="label-input100">Repeat Password</span>
						<input class="input100" type="text" name="repeat-pass" placeholder="*************">
						<span class="focus-input100"></span>
					</div>

					<div class="flex-m w-full p-b-33">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								<span class="txt1">
									I agree to the
									<a href="#" class="txt2 hov1">
										Terms of User
									</a>
								</span>
							</label>
						</div>

						
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" type="submit">
								Update
							</button>
						</div>

						<a href="customerLogin.jsp" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
							Sign in
							<i class="fa fa-long-arrow-right m-l-5"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="signUP-front/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/vendor/bootstrap/js/popper.js"></script>
	<script src="signUP-front/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/vendor/daterangepicker/moment.min.js"></script>
	<script src="signUP-front/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="signUP-front/js/main.js"></script>

</body>
</html>