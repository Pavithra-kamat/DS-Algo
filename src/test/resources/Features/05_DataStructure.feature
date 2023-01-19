Feature: Automate Data Structures Page

  Background: The user is successfully logged in
    Given The user successfully logins in to home page
    
  Scenario: Checking the functionality of DataStructure module
    Given The user clicks on Get Started
    And The user clicks on Time Complexity
    And The user clicks on Try Here 
    And The user prints simple python code
    When The user clicks on Run button
    Then The user checks the output
    Then The user navigates back to the Home Page