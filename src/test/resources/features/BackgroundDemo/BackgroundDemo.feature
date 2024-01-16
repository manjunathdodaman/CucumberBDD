Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And click on login  button
    Then user is navigated to the home page

  Scenario: check logout link
   
    When user is click on av link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
   
    When user clicks on dashboard link
    Then quick lauch toorbar is displayed
