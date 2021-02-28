<!DOCTYPE HTML>

<%@page import="java.io.PrintWriter"%>
<%@page import="com.tour_guide.model.TourPackage"%>
<html>
	<head>
		<title>Introspect by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body style="background-image: url(images/GettyImages-184058551-e1476717797666-1.jpg)">
	
		<% 
			/*
				catching the tour package, by HTTP request object
			*/
			TourPackage tp = (TourPackage)request.getAttribute("TOUR");
			/*
			 displaying description of the relevent tour package
			*/
		
		%>

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index.jsp" class="logo">explore-Sri-Lanka</a>
					<nav id="nav">
						<a href="index.jsp">Home</a>
						<a href="tourPackages.jsp">Tour Packages</a>
						<a href="#">My Requests</a>
                        <a href="#">Tourist Guides</a>
                        <a href="profile.jsp">Profile</a>
                        <a href="UserSignOutServlet">Sign OUT</a>
					</nav>
				</div>
			</header>
			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

        <div class = "description">
            
                <h1 style = "color: black;text-align: center;"> <%=tp.getTitle() %> </h1>
            <div style="text-align: left;">
                <h3 style="color: black;">Price : <pre style="font-size: 20px;display: inline; font-weight: 900;"> <%=tp.getPrice() %> </pre> </h3>
                <br/>
                <h3 style="color: black;">Start Date : <pre style="font-size: 20px;display: inline; font-weight: 900;"> <%=tp.getStartDate() %> </pre> </h3>
                <br/>
                <h3 style="color: black;">End Date : <pre style="font-size: 20px;display: inline; font-weight: 900;">   <%= tp.getEndDate() %> </pre> </h3>
                <br/>
                <h3 style="color: black;">Destinations : <pre style="font-size: 20px;display: inline; font-weight: 900;">  <%= tp.getDestinations() %> </pre> </h3>
                <br/>
                <h3 style="color: black;">Available Seats : <pre style="font-size: 20px;display: inline; font-weight: 900;">  <%= tp.getAvailableSeats() %> </pre> </h3><br/>
                <h3 style="color: black;">Discription : <pre style="font-size: 20px;display: inline; font-weight: 900;">  <%= tp.getDiscription() %> </pre> </h3><br/>
                
                
            </div>
                 
        	
        
        </div>

		<!-- Footer -->
			<section id="footer">
				<div class="inner">
					<header>
						<h2>Get in Touch</h2>
					</header>
					<form method="post" action="#">
						<div class="field half first">
							<label for="name">Name</label>
							<input type="text" name="name" id="name" />
						</div>
						<div class="field half">
							<label for="email">Email</label>
							<input type="text" name="email" id="email" />
						</div>
						<div class="field">
							<label for="message">Message</label>
							<textarea name="message" id="message" rows="6"></textarea>
						</div>
						<ul class="actions">
							<li><input type="submit" value="Send Message" class="alt" /></li>
						</ul>
					</form>
					<div class="copyright">
						&copy; Untitled Design: <a href="https://templated.co/">TEMPLATED</a>. Images <a href="https://unsplash.com/">Unsplash</a>
					</div>
				</div>
			</section>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
            <script src="assets/js/bootstrap.js"></script>
            

	</body>
</html>