package com.tour_guide.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tour_guide.model.User;
import com.tour_guide.service.UserService;
import com.tour_guide.util.DBConnection;

public class UserServiceImpl implements UserService {

	
	public static Connection conn;
	public UserServiceImpl() {
		//create connection
		
		conn = DBConnection.getConnection();
	}
	
	/*
	 * Implementation of ArrayList<User> getAllUsers()
	 * throws SQLException
	 * */
	@Override
	public ArrayList<User> getAllUsers() throws SQLException {
		
		//SQL query to select all users from user table
		String sql = "select * from user_table";
		Statement stm = conn.createStatement();
		
		//execution of query
		ResultSet res = stm.executeQuery(sql);
		
		//creating a new ArrayList
		ArrayList<User> usList;
		usList = new ArrayList<User>();
		
			
		
		
		while(res.next())
				{
					
					User user = new User();
					
					user.setUserID(res.getString("userId"));//set user ID
					user.setFullName(res.getString("fullName"));//set Full Name
					user.setEmail(res.getString("email"));//set email
					user.setMobile(res.getString("mobileNo"));//set mobile No
					user.setPassword(res.getString("password"));//set password
					
					//adding items to the ArrayList
					usList.add(user);
					
				}
			
		
		
		return usList;
	}

	@Override
	public boolean addNewUser(User user) throws SQLException {
		
		
		String sql = "insert into user_table values(?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1, 0);
		stm.setObject(2, user.getFullName());
		stm.setObject(3, user.getMobile());
		stm.setObject(4, user.getEmail());
		stm.setObject(5, user.getPassword());
		
		int res = stm.executeUpdate();
		
		return res > 0;
	}

	@Override
	public boolean UpdateUser(User user) throws SQLException {
		
		
		String sql = "update user_table SET fullName =?, mobileNo = ? , email = ? ,  password = ? where  userId = ? ";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1, user.getFullName());
		stm.setObject(2, user.getMobile());
		stm.setObject(3, user.getEmail());
		stm.setObject(4, user.getPassword());
		stm.setObject(5, user.getUserID());
		
		int res = stm.executeUpdate();
		return res > 0;
	}

	@Override
	public boolean deleteUser(String id) throws SQLException {
		
		
		
		String sql =  "DELETE FROM user_table  WHERE  userId ='" +id+"'";
		Statement stm = conn.createStatement();
		int res = stm.executeUpdate(sql);
		
		return res>0;
	
	}


	

	

	

}
