@test1
Feature: Login to test Enviroment Website

  Scenario Outline: Login to test Enviroment with Enviroment with one User
    Given I am on test Enviroment Home Page
    When I click my account button
    And I click on login link
    And Ienter my <username> and <Password>
    Then I click on login button
    Then I am logged into my Test Enviroment account
