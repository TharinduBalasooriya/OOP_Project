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

import com.tour_guide.model.TourPackage;
import com.tour_guide.service.TourPackageService;
import com.tour_guide.serviceImpl.TourPackageServiceImpl;

/**
 * Servlet implementation class GetTourPackageServlet
 */
@WebServlet("/GetTourPackageServlet")
public class GetTourPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTourPackageServlet() {
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
		 * this servlet is fetch tour packages from tour_packages_table ,
		 * by tour package id
		 * */
		//getting the tour ID
		String tourID = request.getParameter("id");
		
		/*
		 * next parameter indicates the next page client want to go
		 * if value of next is '1' client will navigate to 'tourDiscription.jsp'
		 * if value of next is '2' client will navigate to 'UpdateTourPackage.jsp'
		 * */
		String nextPositon = request.getParameter("next");
		
		TourPackageService tService = new TourPackageServiceImpl();
		
		//creating a new tour package 
		TourPackage tp = new TourPackage();
		
		
		try {
			
			ArrayList<TourPackage> tList = tService.getAllTourPackages();
			
			for(TourPackage t  : tList) {
				
				//checking whether is there a tour package with same ID
				if(tourID.equals(t.getTourId())) {
					
					/*
					 * if there is a tour package with same ID
					 * assigning that tour package to the 'tp' object
					 * */
					tp = t;
					
					
					break;
				}
				
				
			}
			
			if(nextPositon.equals("1")) {
				
				/*
				 *if nexPosition is equals to the '1' 
				 *clients next position will be tourDiscription.jsp
				 * */
				
				//set current tour package  as a attribute of HTTP request object
				//Attribute name 'TOUR'
				request.setAttribute("TOUR", tp);
				
				//navigate to the tourDiscription.jsp
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/tourDiscription.jsp");
				dispatcher.forward(request, response);
				
			}
			if(nextPositon.equals("2")) {
				
				/*
				 *if nexPosition is equals to the '2' 
				 *clients next position will be UpdateTourPackage.jsp
				 * */
				//set current tour package  as a attribute of HTTP request object
				request.setAttribute("TOUR", tp);
				
				//navigate to the tourDiscription.jsp
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateTourPackage.jsp");
				dispatcher.forward(request, response);
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
		

}
