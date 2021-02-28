<!DOCTYPE HTML>

<html>
	<head>
		<title>Admin dash board</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
        <link rel="stylesheet" href="assets/css/sub1.css">
        
        <% 
        	/*
        		checking the login of user
        	*/
			if(session.getAttribute("activeUser") == null){
				//if has not logged in to the system
				response.sendRedirect("adminLogin.jsp");	
			
			}
		
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
            <h1 style="margin-top: 20px;color:black;font-size: 60px">Admin-dash-board</h1> 
        
            </div>
        
		          <div class="row"  style="align-content: center;margin:120px;">
                   
                      
                      <div class="col-sm-4">
                    <div class="card" style="margin-bottom: 40px;" >
                      <div class="card-body">
                        <h5 class="card-title" style="text-align: center;color: black;"><i class="fa fa-user" aria-hidden="true" style="font-size: 120px;"></i></h5>
                        <p class="card-text" style="text-align: center">Manage - contact users</p>
                          <a href="#" style = "background-color: midnightblue;color: aliceblue;">Click here</a>
                      </div>
                    </div>
                  </div>
                      
                  <div class="col-sm-4">
                    <div class="card" style="margin-bottom: 40px;" >
                      <div class="card-body">
                        <h5 class="card-title" style="text-align: center;color: black;"><i class="fa fa-plane" aria-hidden="true" style="font-size: 120px;"></i></h5>
                        <p class="card-text" style="text-align: center">Manage-Tours</p>
                          <a href="tourPackages.jsp" style = "background-color: midnightblue;color: aliceblue;">Click here</a>
                      </div>
                    </div>
                  </div>
                      
                     <div class="col-sm-4">
                    <div class="card" style="margin-bottom: 40px;" >
                      <div class="card-body">
                        <h5 class="card-title" style="text-align: center;color: black;"><i class="fa fa-book" aria-hidden="true" style="font-size: 120px;"></i></h5>
                        <p class="card-text" style="text-align: center">User Requests</p>
                          <a href="#" style = "background-color: midnightblue;color: aliceblue;">Click here</a>
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