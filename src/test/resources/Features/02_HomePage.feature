Feature: Home Page

  Scenario: Redirect to home page from Portal
    Given The user is in the home page "https://dsportalapp.herokuapp.com/home"
    When The user clicks the Data Structures dropdown
    And The user should see 7 panes with different data structures
    And The user clicks any Get Started below data structures
    And User gets Alert "You are not Logged in
    And The user selects any data structures item from the drop down without Sign in.
    And It should alert the user with a message "You are not logged in"
    And The user clicks Register
    And The user should be redirected to Register form
    And The user navigates back to the previous page and clicks Sign in
    Then The user should be redirected to Sign in page