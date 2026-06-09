@ProductPageTestFeature

Feature: Product Page Test

  Scenario: Validate product page load successfully
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page

  @TestingRunner
  Scenario: Validate sort product by name Descending
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page
    When User select sort products by name A-Z


  Scenario: Validate sort product by name Ascending
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page
    When User select sort products by name Z-A

  Scenario: Validate sort product by price Ascending
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page
    When User select sort products by prize LoHi

  Scenario: Validate sort product by price Descending
    Given User navigate to login page
    When User input valid login credential
    Then Verify user is in Product Page
    When User select sort products by price Hilo
