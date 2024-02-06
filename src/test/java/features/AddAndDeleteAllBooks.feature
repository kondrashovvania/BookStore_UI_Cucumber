@addDeleteAllBooks
Feature: Add and delete all books

  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    When I click the Login button
    Then I am on the Profile page
    And I see the Profile Book Catalog empty

  @add_delete_allBooks
  Scenario: Add one book to the User`s Profile
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I click the "Git Pocket Guide" Title Link
    Then I am on the Profile Book Detailed Information Page
    And I see the detailed information about "Git Pocket Guide" book
    When I click the Add To Your Collection button
    And I confirm the alert message
    And I click Back To Book Store button
    Then I am on the Book Store Page
    When I click the "Designing Evolvable Web APIs with ASP.NET" Title Link
    Then I am on the Profile Book Detailed Information Page
    And I see the detailed information about "Designing Evolvable Web APIs with ASP.NET" book
    When I click the Add To Your Collection button
    And I confirm the alert message
    And I follow the Profile link on the Sidebar
    Then I see the "Git Pocket Guide" book in User`s collection
    And I see the "Designing Evolvable Web APIs with ASP.NET" book in User`s collection
    And I see that there are only two books in User`s collection
    When I click Delete All Books button
    And I confirm the alert delete message
    Then I see the Profile Book Catalog empty