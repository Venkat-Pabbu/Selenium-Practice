Feature: Test login functionality

  Scenario Outline: Check login is successfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Venkat   | admin123 |