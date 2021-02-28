package com.tour_guide.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tour_guide.model.User;

public interface UserService {

	/*
	 * ArrayList<User> getAllUsers() return all user of user_table
	 * throws SQLException
	 * */
	ArrayList<User> getAllUsers() throws SQLException;

	boolean addNewUser(User user) throws SQLException;

	boolean UpdateUser(User user) throws SQLException;

	boolean deleteUser(String id) throws SQLException;

	

	

}
