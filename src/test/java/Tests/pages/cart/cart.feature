Feature: cart

  Scenario Outline: valid the product in cart page is correct and navigate to checkout
    Given site is opened
    When enter "<username>" and enter "<password>"
    And click on login button
    Then verify the login is successful
    When click on product name link in products page
    Then validate the product details page is opened
    When click on add to cart button in product details page
    Then verify the remove button appears
    And Verify the cart icon badge change to contain the number one
    When click on cart icon button in product details page
    Then validate the "<productname>" is correct
    When click on checkout button in cart page
    Then validate the checkout page is opened
    Examples:
      | username| password|productname      |
      |user     |pass     |singleProductName|