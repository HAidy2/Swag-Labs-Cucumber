Feature: checkout overview

  Scenario Outline: fill the checkout form and navigate to checkout  overview page
    Given site is opened
    When enter "<username>" and enter "<password>"
    And click on login button
    Then verify the login is successful
    When click on product name link in products page
    Then validate the product details page is opened
#    When click on add to cart button in product details page
#    Then verify the remove button appears
#    And Verify the cart icon badge change to contain the number one
    When click on cart icon button in product details page
    Then validate the "<productname>" is correct
    When click on checkout button in cart page
    Then validate the checkout page is opened
    When fill the form checkout with data : "<firstname>","<lastname>","<zipcode>" in the checkout: your information page
    When click on continue button in checkout:your information page
    Then validate navigation to checkout:overview page
    Then validate the product name "<productname>" is the same product from cart
    When click on the finish button
    Then validate the checkout complete page is opened
    Examples:
      | username| password| productname     |firstname|lastname|zipcode|
      |user     |pass     |singleProductName|fristName|lastName|zipCode|