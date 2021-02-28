package com.tour_guide.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tour_guide.model.TouristGuide;
import com.tour_guide.service.TouristguideService;
import com.tour_guide.util.DBConnection;

public class TouristguideServiceImpl implements TouristguideService{

	
	public static Connection conn;
	public TouristguideServiceImpl() {
		
		conn = DBConnection.getConnection();
	}
	
	@Override
	public ArrayList<TouristGuide> getAllTourGuides() throws SQLException {
		
		String sql = "select * from guide_table";
		Statement statment =  conn.createStatement();
		
		ResultSet resSet = statment.executeQuery(sql);
		
		ArrayList<TouristGuide> gList = new ArrayList<TouristGuide>();
		
		while(resSet.next()) {
			
			TouristGuide tg = new TouristGuide();
			
			tg.setGuideID(resSet.getString(1));
			tg.setName(resSet.getString(2));
			tg.setLicenNo(resSet.getString(3));
			tg.setGender(resSet.getString(4));
			tg.setLanguages(resSet.getString(5));
			tg.setAge(resSet.getString(6));
			tg.setRate(resSet.getString(7));
			
			gList.add(tg);
			
			
			
		}
		
		
		return gList;
	}

	@Override
	public boolean addNewGuide(TouristGuide guide) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "insert into guide_table values(?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1, 0);
		stm.setObject(2, guide.getName());
		stm.setObject(3, guide.getLicenNo());
		stm.setObject(4, guide.getGender());
		stm.setObject(5, guide.getLanguages());
		stm.setObject(6, guide.getAge());
		stm.setObject(7, guide.getRate());
		
		int result = stm.executeUpdate();
		
		return result > 0;
		
		
		
		
	}

	@Override
	public boolean updateGuide(TouristGuide guide) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String sql = " UPDATE guide_table SET   name = ?,licenNo = ?,gender = ? , languages = ?,age = ?, rate = ? WHERE guideID = ?";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1, guide.getName());
		stm.setObject(2, guide.getLicenNo());
		stm.setObject(3, guide.getGender());
		stm.setObject(4, guide.getLanguages());
		stm.setObject(5, guide.getAge());
		stm.setObject(6, guide.getRate());
		stm.setObject(7, guide.getGuideID());
		
		int res = stm.executeUpdate();
		return res >0;
	}

	@Override
	public boolean deleteGuide(String guideID) throws SQLException {

		String sql =  "DELETE FROM guide_table  WHERE  guideID='" +guideID+"'";
		Statement stm = conn.createStatement();
		int res = stm.executeUpdate(sql);
		
		return res>0;
		
		
		
	
	}

	


	
	
	
	
	
	
}
