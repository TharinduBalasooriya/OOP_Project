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
 * Servlet implementation class UpdateGuide
 */
@WebServlet("/UpdateTouristGuideServlet")
public class UpdateTouristGuideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTouristGuideServlet() {
        super();
        
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
		
		String id = request.getParameter("id");
		String name =  request.getParameter("name");
		String licenNo =  request.getParameter("licen");
		String gender =  request.getParameter("gender");
		String age =  request.getParameter("age");
		String rate =  request.getParameter("rate");
		String languages = request.getParameter("lng");
		
		
		System.out.println(rate);
		

		TouristGuide guide = new TouristGuide();
		guide.setGuideID(id);
		guide.setName(name);
		guide.setLicenNo(licenNo);
		guide.setGender(gender);
		guide.setAge(age);
		guide.setRate(rate);
		guide.setLanguages(languages);
		
		
		TouristguideService service = new TouristguideServiceImpl();
		boolean updated = false;
		
		try {
			updated = service.updateGuide(guide);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(updated == true) {
			
			
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Updated succesfully')</script>");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list-tourist-guides.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
	}

}
