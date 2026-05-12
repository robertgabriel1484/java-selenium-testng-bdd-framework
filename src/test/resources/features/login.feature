Feature: Login validation

  As a QA automation engineer
  I want to validate login behavior
  So that users can access secure pages only with valid credentials

  Background:
    Given I am on the login page

  @smoke @positive
  Scenario: Valid user can log in successfully
    When I log in with username "tomsmith" and password "SuperSecretPassword!"
    Then I should see the secure area message "You logged into a secure area!"

  @regression @negative
  Scenario: Invalid password shows an error
    When I log in with username "tomsmith" and password "WrongPassword123"
    Then I should see a login error message containing "Your password is invalid!"

  @regression @negative
  Scenario: Invalid username shows an error
    When I log in with username "baduser" and password "SuperSecretPassword!"
    Then I should see a login error message containing "Your username is invalid!"
