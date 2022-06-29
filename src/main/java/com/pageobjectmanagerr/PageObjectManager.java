package com.pageobjectmanagerr;



import org.openqa.selenium.WebDriver;


import com.Pom.BookHotel;
import com.Pom.CreateFinal;
import com.Pom.LoginPage;
import com.Pom.Logout;
import com.Pom.SearchHotel;

public class PageObjectManager {
	public static WebDriver driver;
	
	
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	
	
	
	
	
	
	
	
	public LoginPage getLoginPage() {
		LoginPage l = new LoginPage(driver);
		return l;
		
	}
	
	public SearchHotel getSearchHotel() {
		SearchHotel l = new SearchHotel(driver);
		return l;
	}
	
	public CreateFinal getCreateFinal() {
		CreateFinal l = new CreateFinal(driver);
		return l;
		
	}
	
	public BookHotel getBookHotel() {
		BookHotel l = new BookHotel(driver);
		return l;
		
	}
	
	public Logout getlogout() {
		Logout l = new Logout(driver);
		return l;
		
	}
	
	
	

}
