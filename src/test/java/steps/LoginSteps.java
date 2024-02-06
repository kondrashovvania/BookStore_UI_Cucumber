package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;


public class LoginSteps extends BaseSteps {


    @Given("^I open Book Store$")
    public void iOpenBookStore() {
        open("https://demoqa.com/books");
    }

    @When("^I follow Login Link$")
    public void iFollowLoginLink() {
        sideBarPage.loginLink.scrollTo().shouldBe(Condition.visible).click();
    }

    @And("^I input \"([^\"]*)\" to userName field$")
    public void iInputToUserNameField(String userName) {
        loginPage.userNameInputField.shouldBe(Condition.visible).setValue(userName);
    }


    @And("^I input \"([^\"]*)\" to password field$")
    public void iInputToPasswordField(String password) {
        loginPage.passwordInputField.shouldBe(Condition.visible).setValue(password);
    }

    @When("^I click the Login button$")
    public void iClickTheLoginButton() {
        loginPage.loginButton.scrollIntoView(true).shouldBe(visible).click();
    }

    @Then("^I am on the Profile page$")
    public void iAmOnTheProfilePage() {
        profilePage.actionColumn.shouldBe(visible);
        for (SelenideElement book : profilePage.booksCollection) {
            book.shouldBe(visible);
        }

    }


    @Then("^I see the message \"([^\"]*)\" is displayed$")
    public void iSeeTheMessageThatIsDisplayed(String expectedMessageText) {
        loginPage.invalidUsernameAndPasswordMessage.shouldBe(visible).shouldHave(text(expectedMessageText));
    }


    @Then("^I see the following message \"([^\"]*)\" is displayed$")
    public void iSeeTheFollowingMessageIsDisplayed(String expectedMessage) {
        if (loginPage.passwordInputField.shouldBe(visible).is(empty)) {
            loginPage.passwordInputField.shouldBe(visible).shouldHave(attribute("validationMessage", expectedMessage));
        } else if (loginPage.userNameInputField.shouldBe(visible).is(empty)) {
            loginPage.userNameInputField.shouldBe(visible).shouldHave(attribute("validationMessage", expectedMessage));
        } else {
            loginPage.userNameInputField.shouldBe(visible).shouldHave(attribute("validationMessage", expectedMessage));
            loginPage.passwordInputField.shouldBe(visible).shouldHave(attribute("validationMessage", expectedMessage));
        }

    }

    @Then("^I am on the Login page$")
    public void iAmOnTheLoginPage() {
        loginPage.userNameInputField.shouldBe(visible);
    }

    @When("^I click New User button$")
    public void iClickNewUserButton() {
        loginPage.newUserButton.scrollTo().shouldBe(visible).click();
    }

    @Then("^I see on the Login page \"([^\"]*)\" message$")
    public void iSeeOnTheLoginPageMessage(String message) {
        registerPage.verifyRecaptchaMessage.scrollTo().shouldBe(visible).shouldHave(text(message));
    }

}
