@bookStoreSort
Feature: Book Store Sort

  Background: I`m in BookStore page
    Given I open Book Store

  @titleSort_A_Z
  Scenario: Sort books by title A_Z
    When I click the Title Header
    Then I see the books sorted in A_Z order

  @titleSort_Z_A
  Scenario: Sort books by title Z_A
    When I double click the Title Header
    Then I see the books sorted in Z_A order

  @authorSort_A_Z
  Scenario: Sort books by author A_Z
    When I click the Author Header
    Then I see the books sorted by author in A_Z order

  @authorSort_Z_A
  Scenario: Sort books by author Z_A
    When I double click the Author Header
    Then I see the books sorted by author in Z_A order

  @publisherSort_A_Z
  Scenario: Sort books by publisher A_Z
    When I click the Publisher Header
    Then I see the books sorted by publisher in A_Z order

  @publisherSort_Z_A
  Scenario: Sort books by publisher Z_A
    When I double click the Publisher Header
    Then I see the books sorted by publisher in Z_A order