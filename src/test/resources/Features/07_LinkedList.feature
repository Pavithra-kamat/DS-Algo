Feature: Automate Linked List Module

  Background: The user successfully logs in
    Given The user logins to home page successfully

  Scenario: Checking the functionality of Linked list module
    Given The user clicks-Getstarted
    When The user tests Introduction link
    And The user tests the functionality of Creating Linked Lists
    And The user tests Types of Linked list
    And The user tests Implement Linked List in Python
    And The user tests the functionality of Traversal
    And The user tests the functionality of insertion
    And The user tests the functionality of Deletion
    Then The user navigates to Home Page
