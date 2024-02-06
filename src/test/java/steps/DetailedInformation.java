package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DetailedInformation extends BaseSteps{
    @Then("^I am on the Profile Book Detailed Information Page$")
    public void iAmOnTheProfileBookDetailedInformationPage() {
        bookDetailedInformation.addToYourCollectionButton.scrollIntoView(true).shouldBe(visible);
    }

    @And("^I see the detailed information about \"([^\"]*)\" book$")
    public void iSeeTheDetailedInformationAboutBook(String title) {
     $x("//*[text()='"+ title + "']").shouldBe(visible);
    }

    @When("^I click the Add To Your Collection button$")
    public void iClickTheAddToYourCollectionButton() {
        bookDetailedInformation.addToYourCollectionButton.scrollIntoView(true).shouldBe(visible).click();
    }

    @And("^I confirm the alert message$")
    public void iConfirmTheAlertMessage() {
      switchTo().alert().accept();
    }

    @When("^I follow book website link$")
    public void iFollowBookWebsiteLink() {
        bookDetailedInformation.website.scrollTo().shouldBe(visible).click();
    }

    @Then("^I am on the \"([^\"]*)\" book page$")
    public void iAmOnTheBookPage(String bookTitle)  {
        switchTo().window(1);
        $x("//*[text()='" + bookTitle + "']").scrollIntoView(true).shouldBe(visible).click();
    }

    @Then("^I am on the Book Detailed Information page$")
    public void iAmOnTheBookDetailedInformationPage() {
        bookDetailedInformation.ISBN.shouldBe(visible);
    }
}
