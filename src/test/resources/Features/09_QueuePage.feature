Feature: Automate Queue Module

  Background: The user successfully logs in
    Given The user successfully logins to home page

  Scenario: Checking the functionality of Queue module
    Given The user clicks on Getstarted
    When The user tests the functionality of Implementation of Queue in Python module
    And The user tests the functionality of Implementation of collections.deque
    And The user tests the functionality of Implementation using Array
    And The user tests the functionality of Queue Operations
    Then The user navigates back-Home Page
    