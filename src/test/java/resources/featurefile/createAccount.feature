Feature: Create account verification
  As a user i should create an account with valid credentials

@smoke,@sanity
  Scenario Outline: verify user can create account successfully
    Given i am on home page
    And I click on sign in link
    And I enter an email for new account creation
    And I click on create new account button
    And I enter first name "<name>"
    And I enter last name "<surname>"
    And I enter register password "<password>"
    And I enter address "<add>"
    And I enter city "<city>"
    And I select state "<state>"
    And I enter postal code "<postal>"
    And I select country "<country>"
    And I enter phone number "<phone>"
    And I click on register button
    Then I can see my name as registered user
    Examples:
      | name  | surname | password | add          | city       | state | postal | country | phone      |
      | Prime | tester  | 123456   | 35 wholefood | Shrewsbury | 21    | 01545  | 21      | 3501236565 |

@regression
  Scenario: verify user is able to create account successfully
    Given i am on home page
    And  I click on sign in link
    And I enter an email for new account creation
    And I click on create new account button
    And I enter following details to create an account
      | name  | surname | password | add         | city       | state | postal | country | phone      |
      | Prime | tester  | 123456   | 35 Everette | Shrewsbury | 21    | 01545  | 21      | 3501236565 |
    And I click on register button
    Then I can see my name as registered user "Prime tester"


  Scenario: verify user should not able to create account by leaving empty field
    Given i am on home page
    And  I click on sign in link
    And I enter an email for new account creation
    And I click on create new account button
    And I enter following details to create an account
      | name | surname | password | add | city       | state | postal | country | phone      |
      |      |         | 123456   |     | Shrewsbury | 21    |        | 21      | 3501236565 |
    And I click on register button
    Then I can see errors and could not able to create account "errors message"






