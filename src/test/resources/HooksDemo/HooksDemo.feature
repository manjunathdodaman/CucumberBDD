Feature: Check login functionality
@smoke
  Scenario: 
    Given user is on login poage
    When user enters valid username and password
    And click on login button
    Then user navigated to the home page
@rgression
  Scenario: 
    Given user is on login poage
    When user enters valid username and password
    And click on login button
    Then user navigated to the home page
