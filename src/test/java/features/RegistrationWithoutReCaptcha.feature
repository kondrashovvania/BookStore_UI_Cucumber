@registration
  Feature: Register user
    Background: I`m in BookStore page
      Given I open Book Store

      @register_withoutReCaptcha
    Scenario: Register user without ReCaptcha
        When I click the Login button on the Book Store page
        Then I am on the Login page
        When I click New User button
        Then I am on the Registration page
        When I enter the "Neil" in the FirstName input field
        And I enter "Armstrong" in the LastName input field
        And I enter "Neil" in the UserName input field
        And I enter "123Neil321&" password in the Password input field
        And I click the Register button
        Then I see on the Login page "Please verify reCaptcha to register!" message
