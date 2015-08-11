@RUNNABLE
Feature: Checkout
  Scenario: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    Then the total price should be 40c

  Scenario: Checkout a cherry
    Given the price of a "cherries" is 30c
    And I manually perform 'look through the store for cherries' on Tuesday around 8p.m. and it passes
    When I checkout 2kg of "cherries"
    Then the total price should be 60c

  Scenario: Checkout a mellon
    Given the price of a "mellon" is 1.00$
    And I manually perform 'look through the store for mellons' on Tuesday around 9p.m. and it fails
    When I checkout 1 of "mellon"
    Then the total price should be 1.00$

  Scenario: Checkout a apples
    Given the price of an "apple" is 15c
    And I manually perform 'look through the store for apples' on Tuesday around 9p.m. and it is still pending
    When I checkout 1 of "apple"
    Then the total price should be 15c



