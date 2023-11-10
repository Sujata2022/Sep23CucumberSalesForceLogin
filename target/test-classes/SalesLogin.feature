Feature: Login into salesforce application

  Scenario: Check login is sucessful with valid credentials
    Given browser is open
    When user is on login page
    And user enters username and password
    And user clicks on login
    Then user is navigated to homepage
