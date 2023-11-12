Feature: Login into salesforce application

  Scenario Outline: Check login is sucessful with valid credentials
    Given browser is open
    And  user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to homepage

    
    Examples:
    
    |username|password|
    |sujyot@eclerx.apm|testing123|
    |xyz@abc.com|test|

    