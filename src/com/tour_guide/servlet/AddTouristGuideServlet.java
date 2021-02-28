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

import com.tour_guide.model.TouristGuide;
import com.tour_guide.service.TouristguideService;
import com.tour_guide.serviceImpl.TouristguideServiceImpl;

/**
 * Servlet implementation class AddTourGuideServlet
 */
@WebServlet("/AddTouristGuideServlet")
public class AddTouristGuideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTouristGuideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =  request.getParameter("name");
		String licenNo =  request.getParameter("licenNo");
		String gender =  request.getParameter("gender");
		String age =  request.getParameter("age");
		String rate =  request.getParameter("rate");
		String languages = request.getParameter("lng");
		
		TouristGuide guide = new TouristGuide();
		guide.setName(name);
		guide.setLicenNo(licenNo);
		guide.setGender(gender);
		guide.setAge(age);
		guide.setRate(rate);
		guide.setLanguages(languages);
		
		
		TouristguideService service = new TouristguideServiceImpl();
		boolean added = false;
		
		try {
			added = service.addNewGuide(guide);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		if(added == true) {
			
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('added succesfully')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list-tourist-guides.jsp");
			dispatcher.include(request, response);
			
		}else {
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('process unsuccesfully')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list-tourist-guides.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
		
	}

}
