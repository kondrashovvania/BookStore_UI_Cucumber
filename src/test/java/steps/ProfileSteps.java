package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.confirm;
import static java.time.Duration.*;

public class ProfileSteps extends BaseSteps {
    @And("^I see the Profile Book Catalog empty$")
    public void iSeeTheProfileBookCatalogEmpty() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(0));
    }


    @When("^I follow the Book Store Link$")
    public void iFollowTheBookStoreLink() {
        profilePage.bookStoreLink.scrollIntoView(true).shouldBe(visible).click();
    }


    @Then("^I see the \"([^\"]*)\" book in User`s collection$")
    public void iSeeTheBookInUserSCollection(String title) {
        for (SelenideElement book : profilePage.booksTitleCollection.filter(not(empty))) {
            book.shouldBe(visible, ofSeconds(8)).shouldHave(text(title));
        }
    }

    @And("^I see that the book is only one in User`s collection$")
    public void iSeeThatTheBookIsOnlyOneInUserSCollection() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(1));
    }

    @And("^I confirm the alert delete message$")
    public void iConfirmTheAlertDeleteMessage() {
        if (profilePage.confirmModalWindow.isDisplayed()) {
            profilePage.confirmModalWindow.click();
        } else {
            confirm();
        }
    }

    @When("^I click delete book icon$")
    public void iClickDeleteBookIcon() {
        profilePage.actionDelete.get(0).shouldBe(visible).click();
    }

    @And("^I see that there are only two books in User`s collection$")
    public void iSeeThatThereAreOnlyTwoBooksInUserSCollection() {
        profilePage.booksCollection.filter(not(empty)).shouldHave(size(2));
    }

    @And("^I click Back To Book Store button$")
    public void iClickBackToBookStoreButton() {
        bookDetailedInformation.backToBookStoreButton.scrollTo().shouldBe(visible).click();
    }

    @When("^I click Delete All Books button$")
    public void iClickDeleteAllBooksButton() {
        profilePage.deleteAllBooksButton.scrollIntoView(true).shouldBe(visible).click();
    }

    @When("^I click Log Out button$")
    public void iClickLogOutButton() {
        profilePage.logOutButton.shouldBe(visible).click();
    }

    @Then("^I see the the message \"([^\"]*)\"$")
    public void iSeeTheTheMessage(String message) {
        profilePage.notLogginLabel.shouldBe(visible).shouldHave(text(message));
    }

    @When("^I click Delete Account button$")
    public void iClickDeleteAccountButton() {
        profilePage.deleteAccountButton.scrollTo().shouldBe(visible).click();
    }

}
