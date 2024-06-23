Feature: Place Order

  Background:
    Given User is on principal page


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
#      |Monitors|ASUS Full HD|
#      |Phones|Samsung galaxy s6|
#      |Laptops|MacBook Pro|