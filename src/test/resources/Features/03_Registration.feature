Feature: Launch Registration Page

  Scenario Outline: Create new user and check for valid data
    Given The user is in the Registration page
    When Title of registration pagae is "Registration"
    Then The user enters "<username>" and "<password>" and "<confirmpass>"
    Then Clicks on registr butoon
   # Then Check for message "password_mismatch:The two password fields didn’t match" is displayed" for invalid data
    Then The user is on home page 
    Then The message "New Account Created."
    Then Check for the "<username>" in right corner of the page
    And Click on Sign Out page
    Then The "Logged out successfully" is displayed
       
   Examples:
   |username|password|confirmpass|
   |pavithra14|test1@|tes|
   |pavithra15|Test1|test1@|
   |pavithra22|test1@11|test1@11|