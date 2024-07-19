Feature: Application Login

Background: 
 Given Setup the entries in database
  And launch the browser from config variable
  And hit the homepage url of banking site
	
	@RegressionTest
  Scenario: Admin Page default login
  Given User is on netbanking landing page
  When User login into application with "admin" and password "1234"
  Then Home Page is displayed
  And Cards are displayed
  
  #Reusable
  
  @MobileTest
  Scenario: User Page default login
  
  Given User is on NetBanking landing Page
  When User login into application with user and password 5865  
  Then Home Page is displayed
  And Cards are displayed
  
  
  @SmokeTest @RegressionTest
  Scenario Outline: Mortguage User Page default login
  
  Given User is on NetBanking landing Page
  When User login into application with <Username> and password "<Password>" 
  Then Home Page is displayed
  And Cards are displayed
  
  Examples:
  
  | Username   | Password |
  | debituser  | hello12  |
  | credituser | lpo213   |
  
  
  @SmokeTest 
  Scenario: User Page default signUp
  
  Given User is on practice landing Page
  When User signup into application 
  
 	| rahul  |
 	| shetty |
 	| contact@gmail.com |
 	| 599565656565|  
  Then Home Page is displayed
  And Cards are displayed
  
  
  
   