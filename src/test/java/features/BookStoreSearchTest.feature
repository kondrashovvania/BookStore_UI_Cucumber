@bookStoreSearch
Feature: Book Store Search

  Background: I`m in BookStore page
    Given I open Book Store

  @by_Title
  Scenario: Search book by title
    When I input the title "Speaking JavaScript" in the search input field
    Then I see the book "Speaking JavaScript" in Book Store Catalog
    And I see that the Book Store Catalog has only one book.

  @by_Author
  Scenario: Search book by author
    When I input the author "Kyle Simpson" in the search input field
    Then I see only the books by author "Kyle Simpson" in Book Store Catalog

  @by_Publisher
  Scenario: Search book by publisher
    When I input the publisher "No Starch Press" in the search input field
    Then I see only the books by publisher "No Starch Press" in Book Store Catalog