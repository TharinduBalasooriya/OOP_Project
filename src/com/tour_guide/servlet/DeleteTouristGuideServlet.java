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


import com.tour_guide.service.TouristguideService;
import com.tour_guide.serviceImpl.TouristguideServiceImpl;

/**
 * Servlet implementation class DeleteTouristGuide
 */
@WebServlet("/DeleteTouristGuideServlet")
public class DeleteTouristGuideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTouristGuideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String guideID = request.getParameter("id");
		
		TouristguideService service = new TouristguideServiceImpl();
		boolean deleted = false;
		
		try {
			deleted = service.deleteGuide(guideID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(deleted) {
			
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Deleted succesfully')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list-tourist-guides.jsp");
			dispatcher.include(request, response);
		}else {
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Delete failed')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list-tourist-guides.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
	}

}
