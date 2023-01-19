Feature: To Get Started

  Scenario: Launching the DS Portal Page
    Given The user is in the "https://dsportalapp.herokuapp.com/" page
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage "https://dsportalapp.herokuapp.com/home"
