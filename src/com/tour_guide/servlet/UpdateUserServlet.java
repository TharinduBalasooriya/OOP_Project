package com.tour_guide.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String id = request.getParameter("id");
		String userType = request.getParameter("uType");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobileNo = request.getParameter("phone");
		String password = request.getParameter("pass");
		
		
		User user = new User();
		user.setUserID(id);
		user.setFullName(name);
		user.setEmail(email);
		user.setMobile(mobileNo);
		user.setPassword(password);
		/** 
		 * updating the current session
		 * **/
		HttpSession session = request.getSession();
		session.setAttribute("activeUser", user);
		session.setAttribute("userType", userType);
		
		
		
		UserService uService = new UserServiceImpl();
		boolean userUpdated = false;
		
		
		
		try {
			 userUpdated =  uService.UpdateUser(user);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userUpdated) {
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Updated  succesfully')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/profile.jsp");
			dispatcher.include(request, response);
			
			
		}else {
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Update failed')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/profile.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
	}

}
