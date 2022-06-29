package com.stepDefenition;


import org.openqa.selenium.WebDriver;

import com.Baseclas.BaseClass;
import com.config.helper.FileReaderManager;
import com.pageobjectmanagerr.PageObjectManager;
import com.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBookingStepDef extends BaseClass {
//	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	
@Given("^user launches the application$")
public void user_launches_the_application() throws Throwable {
	getUrl(FileReaderManager.getInstancerFRM().getInstanceCR().geturl());
	
    implicityWait(20);
   
}

//@When("^user enter the username in usernameField$")
//public void user_enter_the_username_in_usernameField() throws Throwable {
//	
//    String username = FileReaderManager.getInstancerFRM().getInstanceCR().getusername();
//	sendKeys(pom.getLoginPage().getUsername(),username);
//
//
//	}

@When("user enter the {string} in usernameField")
public void user_enter_the_in_username_field(String string) {
    
    sendKeys(pom.getLoginPage().getUsername(), string);  
      
}
//
//
//
//@When("user enter the {string} in passwordField")
//public void user_enter_the_in_password_field(String string) {
//   sendKeys(pom.getLoginPage().getUsername(), string);
//}
//





@When("^user enter the password in passwordField$")
public void user_enter_the_password_in_passwordField() throws Throwable {
	
	sendKeys(pom.getLoginPage().getPassword(),FileReaderManager.getInstancerFRM().getInstanceCR().getpassword());
   
}

@Then("^user clicks the login button and navigates to search hotel$")
public void user_clicks_the_login_button_and_navigates_to_search_hotel() throws Throwable {
	
	click(pom.getLoginPage().getLogin());
   
}

@When("^user selects the location from dropdown$")
public void user_selects_the_location_from_dropdown() throws Throwable {
  
	singleDropdown(pom.getSearchHotel().getLocation(), "value", "Los Angeles");
}

@When("^user selects the hotel from dropdown$")
public void user_selects_the_hotel_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getSearchHotel().getHotel(), "value", "Hotel Hervey");
}

@When("^user selects the roomtype from dropdown$")
public void user_selects_the_roomtype_from_dropdown() throws Throwable {
	singleDropdown(pom.getSearchHotel().getRoomtype(), "value", "Super Deluxe");
 
}

@When("^user selects the number rooms from dropdown$")
public void user_selects_the_number_rooms_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getSearchHotel().getNumofrooms(), "value", "2");
    
}

@When("^user enters the checkInDate$")
public void user_enters_the_checkInDate() throws Throwable {
	sendKeys(pom.getSearchHotel().getCheckin(), "05/06/2022");
    
   
}

@When("^user enters the checkOutDate$")
public void user_enters_the_checkOutDate() throws Throwable {
	sendKeys(pom.getSearchHotel().getCheckout(), "07/06/2022");
	   
   
}

@When("^user selects the adults per room from dropdown$")
public void user_selects_the_adults_per_room_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getSearchHotel().getAdultsrooms(), "value", "2");

}

@When("^user  selects the childrens per room from dropdown$")
public void user_selects_the_childrens_per_room_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getSearchHotel().getChildrenrooms(), "value", "0");
	
  
}

@Then("^user clicks the search and navigates to select hotel$")
public void user_clicks_the_search_and_navigates_to_select_hotel() throws Throwable {
	
	click(pom.getSearchHotel().getSearch());
 
}

@When("^user click the radioButton$")
public void user_click_the_radioButton() throws Throwable {
	click(pom.getCreateFinal().getSelect());
  
}

@Then("^user clicks the continue and navigates to Book Hotel$")
public void user_clicks_the_continue_and_navigates_to_Book_Hotel() throws Throwable {
	
	click(pom.getCreateFinal().getCreate());
   
}

@When("^user enter the firstname in firstnameField$")
public void user_enter_the_firstname_in_firstnameField() throws Throwable {
	
	sendKeys(pom.getBookHotel().getName(), "Raghu");
   
}

@When("^user enter the lastname in lastnameField$")
public void user_enter_the_lastname_in_lastnameField() throws Throwable {
	
	sendKeys(pom.getBookHotel().getLastname(), "A");
   
}

@When("^user enter the billingAddress in billingAddressField$")
public void user_enter_the_billingAddress_in_billingAddressField() throws Throwable {
	
	sendKeys(pom.getBookHotel().getAddress(), "TVS colony chennai");

}

@When("^user enter the creditCardNo in CreditCardNoField$")
public void user_enter_the_creditCardNo_in_CreditCardNoField() throws Throwable {
	
	sendKeys(pom.getBookHotel().getCardnum(),FileReaderManager.getInstancerFRM().getInstanceCR().getcardnum());
  
}

@When("^user selects the  creditCardType from dropdown$")
public void user_selects_the_creditCardType_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getBookHotel().getCardtype(), "value", "VISA");
  
}

@When("^user selects the expirydate for selectMonth and selectYear from dropdown$")
public void user_selects_the_expirydate_for_selectMonth_and_selectYear_from_dropdown() throws Throwable {
	
	singleDropdown(pom.getBookHotel().getExpmonth(), "value", "6");
    
}

@When("^user enter the CVVnumber in CVVnumberField$")
public void user_enter_the_CVVnumber_in_CVVnumberField() throws Throwable {
	
	singleDropdown(pom.getBookHotel().getExpyear(), "value", "2018");
    
}

@Then("^user clicks the booknow and navigates to booking confirmation$")
public void user_clicks_the_booknow_and_navigates_to_booking_confirmation() throws Throwable {
	
	sendKeys(pom.getBookHotel().getCvvnum(),FileReaderManager.getInstancerFRM().getInstanceCR().getcvvnum());

}

@Then("^user clicks the myItinerary and navigates to booked Itinerary$")
public void user_clicks_the_myItinerary_and_navigates_to_booked_Itinerary() throws Throwable {
	
	click(pom.getBookHotel().getBooknow());
   
}

@Then("^user clicks the logout and navigates to successfully logged out$")
public void user_clicks_the_logout_and_navigates_to_successfully_logged_out() throws Throwable {
	click(pom.getlogout().getLogout());
    
}



}
