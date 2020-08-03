Feature: User should get registered

  @smoke
  Scenario: Validate whether user could register on providing valid details

    Given I'm on Home Page
    When I enter firstName
    And  I enter surName 
    And I enter mobileNumber
    And I enter password
    And I select  birthDate
    And  I choose gender
    And I click signUp
    Then I should get registered


  Scenario: Validate whether user could register on providing invalid details

    Given I'm on Home Page
    When I enter firstName
    And  I enter surName
    And I enter mobileNumber
    And I enter password
    And I select  birthDate
    And  I choose gender
    And I click signUp
    Then I should get registered



