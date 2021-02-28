<%@page import="com.tour_guide.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>

<html>
	<head>
		<title>Introspect by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
        <link rel="stylesheet" href="assets/css/sub1.css">
        
        <% 
        	
        	User u = new User();
        	u = (User)session.getAttribute("activeUser");//catch the current session
        
        %>
        
	</head>
	<body style="background-color: beige;">

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
                
            <div class = "custom1" >
            <br/>
            <br/>
            <br/>
            <br/>    
            <h1 style="margin-top: 20px;color:black;font-size: 40px">My profile</h1> 
        
            </div>
        
            
		          <div class="row" style="align-content: center;margin-top: 80px;margin-left: 40%;margin-right: 40%;">
                   
                      
                      <div class="col-sm-12">
                    <div class="card" style="margin-bottom: 40px;border: 2px solid black;width: 600px; "  >
                      <div class="card-body" >
                        <h5 class="card-title" style="text-align: center;color: black;"><i class="fa fa-user" aria-hidden="true" style="font-size: 120px;"></i></h5>
                        <p class="card-text" style="text-align:left">
                            <br/><br/>
                            <b style="color: black;font-size: 20px;">Name : <br/> <%= u.getFullName() %></b> <br/><br/>
                            <b style="color: black;font-size: 20px;">Email :<br/> <%= u.getEmail() %> </b> <br/><br/>
                            <b style="color: black;font-size: 20px;">Phone : <br/> <%= u.getMobile() %> </b> <br/><br/>
                            
                               
                          
                          
                          </p>
                          <a href="updateProfile.jsp" style = "background-color: midnightblue;color: aliceblue;">Update Account</a>
                          <a onclick="window.location.href = 'DeleteUserServlet';" style = "background-color: darkred;color: aliceblue;">Delete Account</a>
                      </div>
                    </div>
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