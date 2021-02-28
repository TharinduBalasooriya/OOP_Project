package com.tour_guide.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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
 * Servlet implementation class UpdateTouristGuideServlet
 */
@WebServlet("/GetTouristGuideServlet")
public class GetTouristGuideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTouristGuideServlet() {
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
		// TODO Auto-generated method stub


		String guideID = request.getParameter("id");
		TouristguideService service = new TouristguideServiceImpl();
		
		TouristGuide guide = new TouristGuide();
		
		ArrayList<TouristGuide> guideList;
		try {
			guideList = service.getAllTourGuides();
			
			for(TouristGuide tg : guideList ){
				
				if(guideID.equals(tg.getGuideID())) {
					
					guide = tg;
					break;	
				}	
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("GUIDE", guide);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateTouristGuide.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
