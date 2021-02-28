package com.tour_guide.model;

public class User {
	
	private String userID;
	private String fullName;
	private String email;
	private String mobile;
	private String password;
	
	
	public User() {
		
	}//default constructor


	//getters and setters
	/**
	 * @return userTD
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userTD to set
	 * */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return fullName
	 * */

	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName to set
	 * */

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	/**
	 * @return email
	 * */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email to set
	 * */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return mobile
	 * */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile to set
	 * */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return password
	 * */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password to set
	 * */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
