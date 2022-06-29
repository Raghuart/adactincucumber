package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numofrooms;
	
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(id="adult_room")
	private WebElement adultsrooms;
	
	@FindBy(id="child_room")
	private WebElement childrenrooms;
	
	public WebElement getChildrenrooms() {
		return childrenrooms;
	}

	public void setChildrenrooms(WebElement childrenrooms) {
		this.childrenrooms = childrenrooms;
	}

	@FindBy(id="Submit")
	private WebElement search;

	public SearchHotel(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultsrooms() {
		return adultsrooms;
	}

	public WebElement getSearch() {
		return search;
	}
	

	

}
