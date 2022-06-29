Feature: Hotel booking in Adactin Application






#Scenario Outline: login Functionality
#
#    Given user launches the application
#    When user enter the "<username>" in usernameField
#    And user enter the "<password>" in passwordField
#    Then user clicks the login button and navigates to search hotel
#    
#    Examples:
#    |username|password|
#    |raghuartt|raghu56789|
#    
    

#Scenario: scenario description
#
#    Given user launches the application
#    When user enter the "raghuartt" in usernameField
#    And user enter the password in passwordField
#    Then user clicks the login button and navigates to search hotel

@smoketest
Scenario: search hotel functionality
    Given user launches the application
    When user enter the "raghuartt" in usernameField
    And user enter the password in passwordField
    Then user clicks the login button and navigates to search hotel
Scenario: search hotel Functionality
    When user selects the location from dropdown
    And user selects the hotel from dropdown
    And user selects the roomtype from dropdown
    And user selects the number rooms from dropdown
    And user enters the checkInDate
    And user enters the checkOutDate
    And user selects the adults per room from dropdown
    And user  selects the childrens per room from dropdown
    Then user clicks the search and navigates to select hotel
    
 Scenario: select hotel Functionality
     When user click the radioButton
     Then user clicks the continue and navigates to Book Hotel 
    
 Scenario: book a hotel Functionality
      When user enter the firstname in firstnameField
      And user enter the lastname in lastnameField
      And user enter the billingAddress in billingAddressField
      And user enter the creditCardNo in CreditCardNoField
      And user selects the  creditCardType from dropdown
      And user selects the expirydate for selectMonth and selectYear from dropdown
      And user enter the CVVnumber in CVVnumberField
      Then user clicks the booknow and navigates to booking confirmation
      
  Scenario: Booking confirmation Functionality
      Then user clicks the myItinerary and navigates to booked Itinerary
      
  Scenario: Booked Itinerary Functionality
      Then user clicks the logout and navigates to successfully logged out
  
  
  
    