@bookStore_readBook
Feature: open book website

  Background: I`m in BookStore page
    Given I open Book Store


@readBook
Scenario: Open book website link
  When I follow "3" book link
  Then I am on the Book Detailed Information page
  When I follow book website link
  Then I am on the "Learning JavaScript Design Patterns" book page