Feature: product

  Scenario Outline: valid name product
    Given site is opened
    When enter "<username>" and enter "<password>"
    And click on login button
    Then verify the login is successful
    Given products are visible
    Then  verify the product "<productname>" in products page is correct
    Examples:
      | username| password|productname      |
      |user     |pass     |singleProductName|