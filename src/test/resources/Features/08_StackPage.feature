Feature: Automate Stack Module

  Background: The user successfully logs in
    Given The user successfully logins into home page

  Scenario: Checking the functionality of Stack module
    Given The user clicks on GetStarted
    When The user tests the functionality of the Operations in Stack
    And The user tests the functionality of Implementation
    And The user tests the functionality of Applications
    Then The user navigates back to Home Page
