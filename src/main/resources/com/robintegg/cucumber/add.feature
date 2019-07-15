Feature: Addition
  
  As a user
  In order to be better at arithmetic
  I want to add two numbers toether

  Scenario Outline: Two positive numbers
    Given I have the numbers <number1> and <number2>
    When I use the calculator to add the two numbers together
    Then I should get the <result>

    Examples: 
      | number1 | number2 | result |
      |       0 |       1 |      1 |
      |       1 |       0 |      1 |
      |       1 |       1 |      2 |
