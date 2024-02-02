@Regression
Feature: Join Now Feature Functionality
  As a User I can navigate to register page

  Scenario: User should navigate to register page
    Given I am on homepage
    And I verify I am on homepage
    When I accept Necessary cookies only
    Then I click on Join Now tab

