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

import com.tour_guide.model.TourPackage;
import com.tour_guide.service.TourPackageService;
import com.tour_guide.serviceImpl.TourPackageServiceImpl;

/**
 * Servlet implementation class UpdateTourPackageServlet
 */
@WebServlet("/UpdateTourPackageServlet")
public class UpdateTourPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTourPackageServlet() {
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

		
		/*
		 * catching values from updateTourPackage.jsp
		 * */
		String tourID = request.getParameter("tourID");
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String startDate = request.getParameter("sDate");
		String endDate = request.getParameter("eDate");
		String availableSeats = request.getParameter("seats");
		String destinations = request.getParameter("dst");
		String discount = request.getParameter("discount");
		String imageURL = request.getParameter("image");
		String discription = request.getParameter("dsc");
		
		//creating a new tour package object
		TourPackage t1 = new TourPackage();
		
		//set values of object
		t1.setTourId(tourID);
		t1.setTitle(title);
		t1.setPrice(price);
		t1.setStartDate(startDate);
		t1.setEndDate(endDate);
		t1.setAvailableSeats(availableSeats);
		t1.setDestinations(destinations);
		t1.setDiscount(discount);
		t1.setImageURL(imageURL);
		t1.setDiscription(discription);
		
		TourPackageService service = new TourPackageServiceImpl();
		
		boolean isUpdated = false;
		try {
			/*
			 * if updated successfully 'isUpdated' will be true
			 * */
			//calling updateTourPackage() method
			isUpdated = service.updateTourPackage(t1);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(isUpdated == true) {
			
			//if update is successful
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Updated succesfully')</script>");
			
			//navigate to the tourPackages.jsp
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
			
		}else {
			//if update failed
			//display error message
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Update failed')</script>");
			
			//navigate to the tourPackages.jsp
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
			
		}
		
		
		
	}

}
