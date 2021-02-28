<!DOCTYPE HTML>

<%@page import="com.tour_guide.model.TouristGuide"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tour_guide.serviceImpl.TouristguideServiceImpl"%>
<%@page import="com.tour_guide.serviceImpl.TourPackageServiceImpl"%>
<%@page import="com.tour_guide.service.TouristguideService"%>
<html>
	<head>
		<title>Introspect by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="tourist-guides-front/main.css" />
	</head>
	<body style="background-image: url(images/GettyImages-184058551-e1476717797666-1.jpg)">

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
			
			<% 
			
			if(session.getAttribute("activeUser") == null){
				response.sendRedirect("adminLogin.jsp");	
		
			}else{
				
			
				String userType = (String)session.getAttribute("userType");
			
				TouristguideService tg = new TouristguideServiceImpl();
				ArrayList<TouristGuide> guideList = tg.getAllTourGuides();
				for(TouristGuide t : guideList){
			
			%>

        <div class = "description">
            
          
                <img src="images/tourist-guides/%E2%80%94Pngtree%E2%80%94vector%20avatar%20icon_4013749.png">
                   
            
            <div class = "description-in">
                <h5 style="color: black;">Name : <pre style="font-size: 20px;display: inline; font-weight: 900;"> <%=t.getName() %> </pre> </h5>
                <br/>
                <h5 style="color: black;">Licen No : <pre style="font-size: 20px;display: inline; font-weight: 900;"> <%=t.getLicenNo() %> </pre> </h5>
                <br/>
                <h5 style="color: black;">Gender : <pre style="font-size: 20px;display: inline; font-weight: 900;"><%=t.getGender() %> </pre> </h5>
                <br/>
                <h5 style="color: black;">Languages : <pre style="font-size: 20px;display: inline; font-weight: 900;"><%= t.getLanguages() %></pre> </h5>
                <br/>
                <h5 style="color: black;">Age : <pre style="font-size: 20px;display: inline; font-weight: 900;">  <%= t.getAge() %></pre> </h5><br/>
                <h5 style="color: black;">Rate : <pre style="font-size: 20px;display: inline; font-weight: 900;"> <%=t.getRate() %>$  </pre> </h5><br/>
                <a href="#" style="background-color: blue;color: white;display: inline-block;">Contact Now</a>
                
                <% 
                	if(userType.equals("admin")){
                %>
                <a style="background-color: darkred;color: white;display:inline-block;"   onclick="window.location.href = 'GetTouristGuideServlet?id=<%=t.getGuideID() %>';" >Update</a>
                <a href="#" style="background-color: darkred;color: white;display:inline-block;" onclick="window.location.href = 'DeleteTouristGuideServlet?id=<%=t.getGuideID() %>';" >Delete</a>
                <% 
                	}
                %>
                
                </div>
        	</div>
        
                <% 
                
					}
			
                %>
            
            <% 
            	if(userType.equals("admin")){
            %>
        <div class="addBtn" >
            <a href="addTouristGuide.jsp" style="background-color:firebrick;color: white;display: inline-block;"><br/>Add New Tourist Guide</a>
            
        </div>
        <%
            	}
			}
        %>
        
        
       

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