package com.tour_guide.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.tour_guide.model.User;
import com.tour_guide.service.UserService;
import com.tour_guide.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//catching the values from customerLogin.jsp/adminLogin.jsp
		String uEmail = request.getParameter("email");
		String uPassword = request.getParameter("pass");
		String uType = request.getParameter("userType");
		
		boolean isAvailable = false;
		
		
		/*
		 * this 'activeUser' user object is created
		 * to save the details of currently active user
		 * */
		User activeUser = new User();
		
		UserService serv = new UserServiceImpl();
		ArrayList<User> userList;
		
		//checking availability of users
		try {
			userList = serv.getAllUsers();
			
			for(User u : userList) {
				
				if(uEmail.equals(u.getEmail()) && uPassword.equals(u.getPassword())) {
					
					//if user is available on user_table
					isAvailable = true;
					activeUser = u;
					//breaking the loop
					break;	
					}
				}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
			
			//If user Is available
			if(isAvailable) {
				
				/*
				 * Creating a session for users :  if user logged to the system using customerLogin.jsp
				 * 'userType' will set as 'customer'.
				 *  if user logged to the system using adminLogin.jsp
				 *  'userType' will set as 'admin'.
				 * */
				HttpSession session = request.getSession();
				session.setAttribute("activeUser", activeUser);
				session.setAttribute("userType", uType);
				
				
				//Redirecting customers to index.jsp
				if(uType.equals("customer")) {
					RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/index.jsp");
					dispatch.include(request, response);
					
				}
				
				//Redirecting administrators to  adminDashBoard.jsp
				if(uType.equals("admin")) {
					RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/adminDashBoard.jsp");
					dispatch.include(request, response);
					
				}
				
				
				
				
				
				
				
			}else {
				
				/*
				 * if entered login details are not available
				 * in user_table
				 * */
				PrintWriter msg = response.getWriter();
				
				//error message
				msg.println("<script>");
				msg.println("alert('Wrong UserName or Password')");
				msg.println("</script>");
				
				//back to the login form
				RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/customerLogin.jsp");
				dispatch.include(request, response);
				
			}
			
			
		
		}
							
}
		


