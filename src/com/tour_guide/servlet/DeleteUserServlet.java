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
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserServlet() {
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

		HttpSession session = request.getSession(false);
		User user = (User)session.getAttribute("activeUser");
		
		String id = user.getUserID();
		boolean isDeleted = false;
		
		UserService service = new UserServiceImpl();
		try {
			isDeleted = service.deleteUser(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		if(isDeleted) {
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Succesfulty Deleted')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/customerLogin.jsp");
			dispatcher.include(request, response);
			
			
		}else {
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Delete failed')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/profile.jsp");
			dispatcher.include(request, response);
		
		
		}

	}
}
