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
 * Servlet implementation class AddTourPackage
 */
@WebServlet("/AddTourPackageServlet")
public class AddTourPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTourPackageServlet() {
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
		
		
		/*
		 * catching the values from AddTourPackage.jsp
		 * 
		 * */
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String startDate = request.getParameter("sDate");
		String endDate = request.getParameter("eDate");
		String availableSeats = request.getParameter("seats");
		String destinations = request.getParameter("dst");
		String discount = request.getParameter("discount");
		String imageURL = request.getParameter("image");
		String discription = request.getParameter("dsc");
		
		//creating a tour pacakge object
		TourPackage t1 = new TourPackage();
		
		//set values to the 't1'
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
		
		boolean isAdded = false;
		try {
			/*
			 * add the tour package to the tour_packages_ table
			 * by using addNewTourPackage() method
			 * 
			 * if tour package added successfully 'isAdded' will be 'true'
			 * */
			isAdded = service.addNewTourPackage(t1);
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		if(isAdded == true) {
			
			//if 'isAdded' true
			
			//displaying successful message
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('added succesfully')</script>");
			
			//navigate to tourPackage page
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
			
		}else {
			
			/*
			 * if adding process get failed
			 * showing error message
			 * */
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('process unsuccesfully')</script>");
			
			//navigate to tourPackage page
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
			
		}
		
		
	}

}
