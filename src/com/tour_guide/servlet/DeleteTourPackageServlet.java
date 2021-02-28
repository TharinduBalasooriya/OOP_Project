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

import com.tour_guide.service.TourPackageService;
import com.tour_guide.serviceImpl.TourPackageServiceImpl;

/**
 * Servlet implementation class DeleteTourPackageServlet
 */
@WebServlet("/DeleteTourPackageServlet")
public class DeleteTourPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTourPackageServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//passing object to the post method
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get tourID 
		String tourID = request.getParameter("id");
		
		TourPackageService tourService = new TourPackageServiceImpl();
		boolean isDeleted = false;
		
		try {
			/*
			 * if tour deleting finished successfully
			 * 'isDeleted' will be true
			 * */
			
			//deleting tour package byID
			isDeleted = tourService.deleteTourPackage(tourID);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(isDeleted) {
			
			//delete success message
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Deleted succesfully')</script>");
			
			//navigate to tourPackages.jsp
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
		}else {
			//if delete failed : error message
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('Delete failed')</script>");
			
			//navigate to tourPackages.jsp
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourPackages.jsp");
			dispatcher.include(request, response);
			
		}
		
		
	}

}
