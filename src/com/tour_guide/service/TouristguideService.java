package com.tour_guide.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tour_guide.model.TouristGuide;

public interface TouristguideService {
	
	ArrayList<TouristGuide> getAllTourGuides() throws SQLException;


	boolean addNewGuide(TouristGuide guide) throws SQLException;
	boolean updateGuide(TouristGuide guide) throws SQLException;


	boolean deleteGuide(String guideID) throws SQLException;
	

}
