# new feature
# Tags: optional

Feature: A description

  Background:
    Given I want to Open the website http://www.way2automation.com/angularjs-protractor/banking/#/manager/list

  Scenario Outline: Delete successfully
    When I click delete button
    Then I verify user is already deleted with first name as <firstname> and last name as <lastname> and post code as <postcode>
    Examples:
      | firstname | lastname | postcode |
      | Harry     | Potter   | E725JB   |

