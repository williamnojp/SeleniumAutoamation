Feature: Login Test

  @LoginTest
  Scenario: Validate user able to login with valid credential
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Home Page

  @TestingRunner
  Scenario: Validate user unable to login with invalid credential
    Given User navigate to login page
    When User input invalid login credential
    Then Verify user is able to see error message


