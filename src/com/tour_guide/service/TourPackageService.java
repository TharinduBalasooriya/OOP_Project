package com.tour_guide.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tour_guide.model.TourPackage;

public interface TourPackageService {

	/**
	 * add new tour packages to tour_package_table
	 * @throws SQLException
	 * @param t1
	 * */
	boolean addNewTourPackage(TourPackage t1) throws SQLException;

	/**
	 * get all packages from tour_packages_table
	 * @throws SQLException
	 * 
	 * */
	
	ArrayList<TourPackage> getAllTourPackages() throws SQLException;
	
	/**
	 * update available tour packages in tour_packages_table
	 * @throws SQLException
	 * */

	boolean updateTourPackage(TourPackage t1) throws SQLException;
	
	/**
	 * delete tour packages by tourID
	 * @throws SQLException
	 * */

	boolean deleteTourPackage(String tourID) throws SQLException;
	

}
