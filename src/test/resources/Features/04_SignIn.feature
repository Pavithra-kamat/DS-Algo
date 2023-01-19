Feature: Sign in User

  Scenario Outline: Launching Sign In page and login
    Given The user is in the Sign In page
    When User enters userid and password from the given sheetname "<SheetName>" and <RowNumber>
    And The user clicks login button
    Then The user should be redirected to the Home Page.

    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
