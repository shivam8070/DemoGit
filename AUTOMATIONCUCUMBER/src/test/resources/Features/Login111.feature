#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.



Feature: Login page Automation of saucedemo App

Scenario: Check login is successful with valid creds 

Given User is on login page
When user enters valid username and password 
And Clicks on Login Button 
Then User is navigation to Home page 
And close the browser
