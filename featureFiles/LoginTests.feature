#Author: Nikhil Wadalkar
#Gherkin language
#BDD - Behavioral Driven Development
#KDD - Keyword driven dev
#TDD - Test driven dev
#DDD - Data driven dev
#Hybrid  

#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

 @regression @US1545 @login 
Feature: Login functionality features

Background: opening url
	
	Given open url

 # @regression
  Scenario: Verify that user is able to login successfully with valid username password
    #Given open url
   # When user enters valid username
   # And user enters valid password
    And click on login button
    Then user is logged in successfully
  
  #@login  
   Scenario: Verify that user is able to login successfully with valid username password
    #Given open url
    When user enters valid username "Admin"
    And user enters valid password "admin123"
    And click on login button
    Then user is logged in successfully
    
   @login  
   Scenario: Verify that user is able to login successfully with valid username password
    #Given open url
    When user enters valid username
    |username|
    |Admin|
    And user enters valid password
    |password|
    |admin123|
    And click on login button
    Then user is logged in successfully
