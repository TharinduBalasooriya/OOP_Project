<!DOCTYPE HTML>

<%@page import="javax.websocket.SendResult"%>
<%@page import="com.tour_guide.model.User"%>
<html>
	<head>
		<title>Introspect by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		
		
		<% 
			//checking the user login
			if(session.getAttribute("activeUser") == null){
				//if user has not logged in
				response.sendRedirect("customerLogin.jsp");	
			
			}
		
		%>
	</head>
	<body>

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index.jsp" class="logo">explore-Sri-Lanka</a>
					<nav id="nav">
						<a href="index.jsp">Home</a>
						<a href="tourPackages.jsp">Tour Packages</a>
						<a href="#">My Requests</a>
                        <a href="list-tourist-guides.jsp">Tourist Guides</a>
                        <a href="profile.jsp">Profile</a>
                        <a href="UserSignOutServlet">Sign OUT</a>
					</nav>
				</div>
			</header>
			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<h1>Enjoy <span>your journey<br />
					</span>WITH US !!!</h1>
					<ul class="actions">
						<li><a href="#" class="button alt">Get Started</a></li>
					</ul>
				</div>
			</section>
        <br/><br/>
        
        <!-- carousel-->
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="d-block w-100" src="images/colombo.jpg" alt="First slide" width="30px;" height="500px;">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="images/kandy.jpg" alt="Second slide" width="30px;" height="500px;">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="images/gangarama.jpg" alt="Third slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="images/ella.jpg" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>
        

		<!-- One -->
			<section id="one">
				<div class="inner">
					<header>
						<h2 style="color: darkblue">About Us</h2>
					</header>
					<p> In 1966, the Government decided to develop tourism in a planned and a systematic manner, after identifying the need to set up an institutional framework. The Ceylon Tourist Board (created by the Ceylon Tourist Board Act No. 10 of 1966) and the Ceylon Hotels Corporation (created by Ceylon Hotels Corporation Act of 1966) were set up duly. </p>
					<ul class="actions">
						<li><a href="#" class="button alt">Learn More</a></li>
					</ul>
				</div>
			</section>

		<!-- Two -->
			<section id="two">
				<div class="inner">
					<article>
						<div class="content">
							<header>
								<h3>Hotel Partners</h3>
							</header>
							<div class="image fit">
								<img src="images/hotelP.jpg" alt="" />
							</div>
							<p>You can find our hotel partners on every continent in the world. Many of the hotels offer exquisite restaurants and bars, a variety of fitness facilities and peaceful havens of relaxation.</p>
						</div>
					</article>
					<article class="alt">
						<div class="content">
							<header>
								<h3>Insuarance Partners</h3>
							</header>
							<div class="image fit">
								<img src="images/pic02.jpg" alt="" />
							</div>
							<p>We have collaborated with best insurance partners.We ensure your safe during the journey</p>
						</div>
					</article>
				</div>
			</section>

		
        
        

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
						&copy; Untitled Design: <a href="https://templated.co/"></a>. Images <a href="#">Unsplash</a>
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