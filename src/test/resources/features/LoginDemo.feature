Feature: Test login functionality

  Scenario Outline: Check login is Successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | manju    |    12345 |
      | manyogi  |    12345 |
