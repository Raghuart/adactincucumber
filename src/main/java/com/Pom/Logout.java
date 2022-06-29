package com.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Logout {
	public static WebDriver driver;
	
	
	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getLogout() {
		return logout;
	}


	@FindBy(id="logout")
	private WebElement logout;

}
