@LoginTest
Feature: Login Test

  Scenario: Validate user able to login with valid credential
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Home Page

  Scenario: Validate user unable to login with invalid credential
    Given User navigate to login page
    When User input invalid login credential
    Then Verify user is able to see error message

  Scenario: Validate user unable to login with locked credential
    Given User navigate to login page
    When User input locked login credential
    Then Verify user is able to see user locked error message

  Scenario: Validate user unable to login with empty credential
    Given User navigate to login page
    When User click login button at login page
    Then Verify user is able to see error message

