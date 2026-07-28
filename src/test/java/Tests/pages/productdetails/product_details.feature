Feature: singleProduct

  Scenario Outline: Verify the "remove" button appears & cart icon behavior after clicking the "add to cart" button
    Given site is opened
    When enter "<username>" and enter "<password>"
    And click on login button
    Then verify the login is successful
    When click on product name link in products page
    Then validate the product details page is opened
    When click on add to cart button in product details page
    Then verify the remove button appears
    And Verify the cart icon badge change to contain the number one
    Examples:
      | username| password|
      |user     |pass     |