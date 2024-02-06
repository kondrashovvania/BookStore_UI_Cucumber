@addAndDeleteOneBooks
Feature: Add and delete one book

  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    When I click the Login button
    Then I am on the Profile page
    And I see the Profile Book Catalog empty

  @add_oneBook
  Scenario: Add one book to the User`s Profile
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I click the "Learning JavaScript Design Patterns" Title Link
    Then I am on the Profile Book Detailed Information Page
    And I see the detailed information about "Learning JavaScript Design Patterns" book
    When I click the Add To Your Collection button
    And I confirm the alert message
    And I follow the Profile link on the Sidebar
    Then I see the "Learning JavaScript Design Patterns" book in User`s collection
    And I see that the book is only one in User`s collection
    When I click delete book icon
    And I confirm the alert delete message
    Then I see the Profile Book Catalog empty