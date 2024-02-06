@logout
Feature: Logout
  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    When I click the Login button
    Then I am on the Profile page


  @success_logout
  Scenario: Successful logout
    When I click Log Out button
    Then I am on the Login page
    When I follow the Profile link on the Sidebar
    Then I see the the message "Currently you are not logged into the Book Store application,"