package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateFinal {
	public static WebDriver driver;
	
	
	
	@FindBy(id="radiobutton_0")
	
	private WebElement select;
	
	@FindBy(className ="reg_button")
	private WebElement create;

	public CreateFinal(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCreate() {
		return create;
	}
	
	
	

}
