@deleteAccount
Feature: Delete account

  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Neil" to userName field
    And I input "123Neil321&" to password field
    And I click the Login button
    Then I am on the Profile page

  @delete_account
    Scenario: Delete Account
  When I click Delete Account button
    And I confirm the alert delete message
    Then I am on the Login page
    When I input "Neil" to userName field
    And I input "123Neil321&" to password field
    And I click the Login button
    Then I see "Invalid username or password!" message

