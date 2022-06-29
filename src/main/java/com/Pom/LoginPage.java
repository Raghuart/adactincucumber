package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy(id = "password")
	private WebElement password;
	
	
	@FindBy(id="login")
	private WebElement login;
	
	
	


	public LoginPage(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
