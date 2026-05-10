Feature: Login Test

  @TestingRunner
  Scenario: Validate user able to login with valid credential
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Home Page


