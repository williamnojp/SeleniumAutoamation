Feature: Logged In User View

  @TestingRunner
  Scenario: Validate user is able to view after login
    Given User navigate to login page
    When User successfully enter the login detail
    Then User should able to view the product category page