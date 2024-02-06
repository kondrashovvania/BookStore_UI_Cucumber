@login
Feature: Login
  Background: I`m in BookStore page
    Given I open Book Store

  @success_login
  Scenario: Success login with valid data
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    When I click the Login button
    Then I am on the Profile page

  @invalid_data
  Scenario Outline: Login with invalid data
    When I follow Login Link
    And I input "<username>" to userName field
    And I input "<password>" to password field
    When I click the Login button
    Then I see the message "<errorMessageText>" is displayed

    Examples:
      | username | password   | errorMessageText              |
      | Ronn     | 123Ron321& | Invalid username or password! |
      | Ronny    | 123Ron321  | Invalid username or password! |

  @empty_fields
  Scenario Outline: Login with empty fields
    When I follow Login Link
    And I input "<username>" to userName field
    And I input "<password>" to password field
    When I click the Login button
    Then I see the following message "<errorMessageText>" is displayed

    Examples:
      | username | password   | errorMessageText            |
      |          | 123Ron321& | Please fill out this field. |
      | Ronny    |            | Please fill out this field. |
      |          |            | Please fill out this field. |


