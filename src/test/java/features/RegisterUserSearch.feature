@register_bookStoreSearch
Feature: Search after login
  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    And I click the Login button
    Then I am on the Profile page

  @by_Title
  Scenario: Search book by title
    When I follow the Book Store Link
    And I input the title "Speaking JavaScript" in the search input field
    Then I see the book "Speaking JavaScript" in Book Store Catalog
    And I see that the Book Store Catalog has only one book.

  @by_Author
  Scenario: Search book by author
    When I follow the Book Store Link
    And I input the author "Kyle Simpson" in the search input field
    Then I see only the books by author "Kyle Simpson" in Book Store Catalog

  @by_Publisher
  Scenario: Search book by publisher
    When I follow the Book Store Link
    And I input the publisher "No Starch Press" in the search input field
    Then I see only the books by publisher "No Starch Press" in Book Store Catalog


