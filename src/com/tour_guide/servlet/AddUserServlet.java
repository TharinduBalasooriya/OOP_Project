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

import com.tour_guide.model.User;
import com.tour_guide.service.UserService;
import com.tour_guide.serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobileNo = request.getParameter("phone");
		String password = request.getParameter("pass");
		
		User user = new User();
		user.setFullName(name);
		user.setEmail(email);
		user.setMobile(mobileNo);
		user.setPassword(password);
		
		UserService uService = new UserServiceImpl();
		boolean userCreated = false;
		
		try {
			 userCreated =  uService.addNewUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(userCreated) {
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('SignUp is succesful')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/customerLogin.jsp");
			dispatcher.include(request, response);
			
			
		}else {
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('SignUp failed')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/customerLogin.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
		
	}

}
