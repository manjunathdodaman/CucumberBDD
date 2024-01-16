Feature: feature to test Googlesearch functionality

  Scenario: Validate the google search is working
    Given browser is open
    And user is on search page
    When user enters text in search box
    And hits enter
    Then user navigates to search results
