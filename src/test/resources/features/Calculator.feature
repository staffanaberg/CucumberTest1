Feature: Calculator

  Scenario: Add two numbers
    Given I have first number 10
    Given I have second number 20
    When I try to add them
    Then I get the result 30

  Scenario: Multiply two numbers
    Given I have first number 10
    Given I have second number 20
    When I try to multiply them
    Then I get the result 200