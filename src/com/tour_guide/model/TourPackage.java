package com.tour_guide.model;

/**
 * this is tour package model class
 * */
public class TourPackage {
	
	//Attributes
	private String tourId;
	private String title;
	private String price;
	private String startDate;
	private String endDate;
	private String availableSeats;
	private String destinations;
	private String discount;
	private String imageURL;
	private String discription;
	
	public TourPackage() {
		//default constructor
	}

	/**
	 * @return tourId
	 * */
	public String getTourId() {
		return tourId;
	}

	/**
	 * @param tourId to set
	 * */
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	/**
	 * @return title
	 * */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title to set as title
	 * */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return price
	 * */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price to set as price
	 * */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return startDate
	 * */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 * */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return endDate
	 * */
	public String getEndDate() {
		return endDate;
	}

	
	/**
	 * @param endDate
	 * */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return destinations
	 * */
	public String getDestinations() {
		return destinations;
	}

	/**
	 * @param destinations to set as destinations
	 * */
	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}

	/**
	 * @return discount
	 * */
	public String getDiscount() {
		return discount;
	}
	
	/**
	 * @param discount
	 * */

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * @return imageURL
	 * */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL
	 * */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * @return availableSeats
	 * */
	public String getAvailableSeats() {
		return availableSeats;
	}

	/**
	 * @param availableSeats to set as availableSeats
	 * */
	
	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}

	/**
	 * @return description
	 * */
	public String getDiscription() {
		return discription;
	}

	/**
	 * @param discription to set as discription
	 * */
	
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
	

}
