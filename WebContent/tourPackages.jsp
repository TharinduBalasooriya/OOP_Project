<!DOCTYPE HTML>

<%@page import="com.tour_guide.model.TourPackage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tour_guide.serviceImpl.TourPackageServiceImpl"%>
<%@page import="com.tour_guide.service.TourPackageService"%>
<html>
	<head>
		<title>Introspect by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/sub1.css" /> 
		<link rel="stylesheet" href="assets/css/main.css" />
		
		<% 
			//checking the user login
			if(session.getAttribute("activeUser") == null){
				//if user has not logged in
				response.sendRedirect("customerLogin.jsp");	
		
			}else{
			//if user has already logged in
			
			/*
				catching the user type from Http session object,
				beacuse some options are only visble for administrator
			*/
			String userType = (String)session.getAttribute("userType");
		
		%>
        
	</head>
	<body style="background-image: url(images/GettyImages-184058551-e1476717797666-1.jpg)" >

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index.jsp" class="logo">explore-Sri-Lanka</a>
					<nav id="nav" >
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
            <h1 style="margin-top: 20px;color:black;font-size: 60px">Tour packages</h1> 
        
        </div>
        
        
        
        <section style="margin-top: 100px;margin-bottom:600px;">
            
          <div class="container-fluid">
            <div class="container" >
              <div class="row" >
                <!-- 1st object -->
                
                <% 
                		/*
                			get all available tour packges
                			from tour_packages_table
                		*/
                		TourPackageService tourS = new TourPackageServiceImpl();
                		ArrayList<TourPackage> tourList = tourS.getAllTourPackages();
                	
                		for(TourPackage t : tourList){
                
                		//displaying availble tour packages
                
                %>
                  
                  <div class="col-sm-4">
                  <div class="card text-center" style="background-image: url(images/<%=t.getImageURL() %>);margin-bottom: 70px;">
                    <div class="title">
                      <i class="fa fa-plane" aria-hidden="true"></i>
                      <h2><%= t.getTitle() %></h2>
                    </div>
                    <div class="price">
                      <h4><sup>$</sup><%= t.getPrice() %></h4>
                    </div>
                    <div class="option">
                      <ul>
                      <li> <i class="fa fa-check" aria-hidden="true"></i>Discount : <%= t.getDiscount() %> </li>
                      <li> <i class="fa fa-check" aria-hidden="true"></i> Available : <%=t.getAvailableSeats() %> seats </li>
                      
                      </ul>
                    </div>
                    <a onclick="window.location.href = 'GetTourPackageServlet?id=<%=t.getTourId() %>&next=1';">Learn More </a>
                    <a href="#">Register Now</a>
                    
                    <% 
                   
                    			if(userType.equals("admin")){
                    				/*
                    					Update and delete functions are only visble
                    					for administrators
                    				*/
                    
                    
                    %>
                    <!-- calling GetTourPackageServlet using an anchor Tag -->
                    <a onclick="window.location.href = 'GetTourPackageServlet?id=<%=t.getTourId() %>&next=2';" style="background-color: darkred;color: aliceblue;">Update Package</a>
                    <!-- calling DeleteTourPackageServlet using an anchor Tag -->
                    <a onclick="window.location.href = 'DeleteTourPackageServlet?id=<%=t.getTourId() %>';" style="background-color: darkred;color: aliceblue;">Delete</a>  
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
                		/*
                			Addnew tour packages option 
                			is only visible for administrators
                		
                		*/
                
                %>
                
                <!-- addNew Tour packages-->
                   <div class="col-sm-4"  >
                  <div class="card text-center"  style="background: linear-gradient(-45deg,#383438,#797979);">
                    <div class="title" >
                      <i class="fa fa-plus-circle" aria-hidden="true"></i>
                      <h2>ADD NEW<br/> <br/> TOUR <br/><br/>PACKAGE<br/><br/></h2>
                    </div>
                    
                    <a href="addTourPackage.jsp">Click here </a>   
                  </div>
                </div>
                
                <%
                	}
                %>
                
                
                
                
                <%
                
                		
                		
                	}
                %>
             
                  
                 
                   
               
        <!-- END Col one -->
        
      </div>
    </div>
  </div>
</section>


		<!-- Footer -->
			<section id="footer" >
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