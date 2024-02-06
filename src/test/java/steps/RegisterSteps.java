package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class RegisterSteps extends BaseSteps{


    @Then("^I am on the Registration page$")
    public void iAmOnTheRegistrationPage() {
        registerPage.userNameInputField.shouldBe(visible);
    }


    @When("^I enter the \"([^\"]*)\" in the FirstName input field$")
    public void iEnterTheInTheFirstNameInputField(String name)  {
        registerPage.firstNameInputField.shouldBe(visible).setValue(name);
    }

    @And("^I enter \"([^\"]*)\" in the LastName input field$")
    public void iEnterInTheLastNameInputField(String name)  {
       registerPage.lastNameInputField.shouldBe(visible).setValue(name);
    }

    @And("^I enter \"([^\"]*)\" in the UserName input field$")
    public void iEnterInTheUserNameInputField(String userName) {
        registerPage.userNameInputField.scrollTo().shouldBe(visible).setValue(userName);
    }

    @And("^I enter \"([^\"]*)\" password in the Password input field$")
    public void iEnterPasswordInThePasswordInputField(String password) {
        registerPage.passwordInputField.scrollTo().shouldBe(visible).setValue(password);
    }

    @And("^I click the Register button$")
    public void iClickTheRegisterButton() {
        registerPage.registerButton.scrollTo().shouldBe(visible).click();
    }

    @Then("^I see \"([^\"]*)\" message$")
    public void iSeeMessage(String message)  {
       registerPage.verifyRecaptchaMessage.scrollTo().shouldBe(visible).shouldHave(text(message));
    }
}
