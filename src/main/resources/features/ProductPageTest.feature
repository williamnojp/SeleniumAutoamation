@ProductPageTestFeature

Feature: Product Page Test

  Scenario: Validate product page load successfully
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page

  @TestingRunner
  Scenario: Validate sort product by name
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page
    When User select sort products by name A-Z

