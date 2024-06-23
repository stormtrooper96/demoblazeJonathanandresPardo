Feature: Place Order

  Background:
    Given User is on principal page
#
#  Scenario: Place an order by selecting products from different categories
#    When he selects the "Phones" category
#    And  he adds a product "Samsung galaxy s6" to the cart
#    And the user selects the "Laptops" category
#    And the user adds a product "Sony vaio i5" to the cart
#    And the user selects the "Monitors" category
#    And the user adds a product "Apple monitor 24" to the cart
#    Then the user should see 3 products in the cart
#    Then he should see a message 'Sign up successful.'
#



  Scenario Outline: Place an order selecting one product
    When he selects the "<Category>" category
    And  he adds a product "<Product>"
    And he should see a message 'Product added'
    Then he should see the products in the cart
    Then he put the buyer information
    And he places the order
    Then he validate confirmation message

    Examples:
      |Category|Product|
      |Monitors|Apple monitor 24|
      |Monitors|ASUS Full HD|
      |Phones|Samsung galaxy s6|
      |Laptops|MacBook Pro|