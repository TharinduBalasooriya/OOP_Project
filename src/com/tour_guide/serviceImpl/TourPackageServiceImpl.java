package com.tour_guide.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tour_guide.model.TourPackage;
import com.tour_guide.service.TourPackageService;
import com.tour_guide.util.DBConnection;

/*
 * this class contain implementations of TourPackageServices
 * */
public class TourPackageServiceImpl implements TourPackageService {

	//creating a database connection
	public static Connection conn;
	public TourPackageServiceImpl() {
		
		conn = DBConnection.getConnection();
	}
	
	
	
	
	/*
	 * Implementation of addNewTourPackage(TourPackage t1)
	 * throws SQLException
	 *
	 * */
	@Override
	public boolean addNewTourPackage(TourPackage t1) throws SQLException {
	
		//SQL query
		String sql = "insert into  tour_packages_table values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		//set values to the query
		stm.setObject(1, 0);
		stm.setObject(2, t1.getTitle());
		stm.setObject(3,t1.getPrice());
		stm.setObject(4,t1.getStartDate());
		stm.setObject(5,t1.getEndDate());
		stm.setObject(6, t1.getDestinations());
		stm.setObject(7,t1.getDiscount());
		stm.setObject(8,t1.getAvailableSeats());
		stm.setObject(9,t1.getDiscription());
		stm.setObject(10,t1.getImageURL());
		
		//execution of query
		int res = stm.executeUpdate();
		return res >0;
	}
	
	/*
	 * Implementation of ArrayList<TourPackage> getAllTourPackages()
	 * 
	 * throws SQLException
	 * */
	@Override
	public ArrayList<TourPackage> getAllTourPackages() throws SQLException {
		
		//this method return all the available tour_packages in the tour_packages_table
		
		//Query to select all tour packages
		String sql =  "select * from tour_packages_table";
		Statement stm = conn.createStatement();
		
		//execution of query
		ResultSet rst = stm.executeQuery(sql);
		
		//creating a list
		ArrayList<TourPackage> tourList = new ArrayList<TourPackage>();
		
		while(rst.next()) {
			
			TourPackage t1 = new TourPackage();
			t1.setTourId(rst.getString(1));
			t1.setTitle(rst.getString(2));
			t1.setPrice(rst.getString(3));
			t1.setStartDate(rst.getString(4));
			t1.setEndDate(rst.getString(5));
			t1.setDestinations(rst.getString(6));
			t1.setDiscount(rst.getString(7));
			t1.setAvailableSeats(rst.getString(8));
			t1.setDiscription(rst.getString(9));
			t1.setImageURL(rst.getString(10));
			
			//adding items to the tourList
			tourList.add(t1);
			
			
		}
		
		
		return tourList;
	}
	
	
	/*
	 * Implementation of updateTourPackage(TourPackage t1)
	 * 
	 * throws SQLException
	 * */
	@Override
	public boolean updateTourPackage(TourPackage t1) throws SQLException {
		
		
		//SQL Update query
		String sql = " UPDATE tour_packages_table SET title = ? , price = ?,startDate = ?,endDate = ? , destinations = ?,discount = ?, seats = ? ,descriprion = ?,imageURL = ? WHERE tourID = ?";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		//set values to the query
		stm.setObject(1, t1.getTitle());
		stm.setObject(2, t1.getPrice());
		stm.setObject(3, t1.getStartDate());
		stm.setObject(4, t1.getEndDate());
		stm.setObject(5, t1.getDestinations());
		stm.setObject(6, t1.getDiscount());
		stm.setObject(7, t1.getAvailableSeats());
		stm.setObject(8, t1.getDiscription());
		stm.setObject(9, t1.getImageURL());
		stm.setObject(10, t1.getTourId());
		
		//execution of query
		int res = stm.executeUpdate();
		return res >0;
	}
	
	/*
	 * Implementation of updateTourPackage(TourPackage t1)
	 * 
	 * throws SQLException
	 * */
	@Override
	public boolean deleteTourPackage(String tourID) throws SQLException {


		//SQL delete query
		String sql =  "DELETE FROM tour_packages_table  WHERE  tourID='" +tourID+"'";
		Statement stm = conn.createStatement();
		
		//execution of query
		int res = stm.executeUpdate(sql);
		
		return res>0;
		
		
	}
	
	
	
	
	
}
