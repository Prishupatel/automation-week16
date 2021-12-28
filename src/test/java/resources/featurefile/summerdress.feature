Feature: Summer dress test
  As a user i can navigate to summer dress collection


  Scenario: verify user can navigate to summer page
    Given i am on home page
    And I mouse hover on women tab
    And I click on summer dress sub menu
    Then I navigated to summer dress page


    Scenario: verify user can search products between specific price
      Given i am on home page
      And I mouse hover on women tab
      And I click on summer dress sub menu
      Then I navigated to summer dress page
      And I change the price slider to "20.00"
      Then I can see products price between applied price range
