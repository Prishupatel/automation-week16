Feature: Our Stores
  User should successfully navigate to our store page successfully

  @smoke1
  Scenario: verify user should drag map and take screenshot of location
    Given i am on home page
    When I click on our store page
    And I accept pop up
    And I scroll the map untill West Palm Beach
    And I take screenshot


