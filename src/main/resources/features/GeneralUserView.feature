Feature: General User View

  Scenario: Validate user able to view products without logging in
    Given User navigate to Online products page
    When User click on Formal Shoes drop down
    Then User should be able to view the Products