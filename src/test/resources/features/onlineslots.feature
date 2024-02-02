@Regression
Feature: Online Slots Page Feature
  As a user I want to verify user should navigate to online slot page

  Scenario: Verify User Should Navigate To Online Slots Page Successfully
    Given I am on homepage
    And I verify I am on homepage
    And  I accept Necessary cookies only
    When I Click on "Online Slots" Tab
    Then I Verify text "Play Online Slots at Virgin Games"