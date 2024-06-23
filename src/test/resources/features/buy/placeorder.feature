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
      | Category | Product |
      | Laptops | Sony vaio i5 |
      | Laptops | Sony vaio i7 |
      | Laptops | MacBook air |
      | Laptops | Dell i7 8gb |
      | Laptops | 2017 Dell 15.6 Inch |
      | Laptops | MacBook Pro |
      | Phones | Samsung galaxy s6 |
      | Phones | Nokia lumia 1520 |
      | Phones | Nexus 6 |
      | Phones | Samsung galaxy s7 |
      | Phones | Iphone 6 32gb |
      | Phones | Sony xperia z5 |
      | Phones | HTC One M9 |

  Scenario: Place an order selecting multiples products
    And  he adds multiples products with category
      | Laptops | Sony vaio i5 |
      | Laptops | Sony vaio i7 |
      | Laptops | MacBook air |
      | Phones | Samsung galaxy s7 |
      | Phones | Iphone 6 32gb |
      | Phones | Sony xperia z5 |
      | Phones | HTC One M9 |
    Then he should see the products in the cart
    Then he put the buyer information
    And he places the order
    Then he validate confirmation message

