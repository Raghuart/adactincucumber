package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookHotel {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement name;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardnum;
	
	@FindBy(name = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary;




	public static WebDriver getDriver() {
		return driver;
	}

	public BookHotel(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	public WebElement getMyitinerary() {
		return myitinerary;
	}
	

}
