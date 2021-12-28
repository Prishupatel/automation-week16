Feature: cart must be empty
  as a user i can delete item in the cart

  @sanity
  Scenario: verify shopping cart is empty after deleting item in the cart
    Given i am on home page
    And  I click on printed dress
    And I click on Add to cart button
    Then I can see product added to cart
    And I click on checkout button
    Then I can see delete icon
    And I click on delete button
    Then I can see your cart is empty



