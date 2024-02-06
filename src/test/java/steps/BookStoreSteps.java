package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import static org.junit.Assert.assertEquals;

public class BookStoreSteps extends BaseSteps {


    @When("^I input the title \"([^\"]*)\" in the search input field$")
    public void iInputTheTitleInTheInputField(String bookTitle) {
        bookStorePage.searchInputField.scrollTo().shouldBe(visible).setValue(bookTitle);
    }

    @Then("^I see the book \"([^\"]*)\" in Book Store Catalog$")
    public void iSeeOnlyTheBookInBookStoreCatalog(String bookTitle) {
        for (SelenideElement title : bookStorePage.booksTitleCollection.filter(not(empty))) {
            title.shouldBe(visible).shouldHave(text(bookTitle));
        }
    }

    @Then("^I see that the Book Store Catalog has only one book\\.$")
    public void iSeeThatTheBookStoreCatalogHasOnlyOneBook() {
        int collectionSize = bookStorePage.booksCollection.filter(not(empty)).size();
        assertEquals("The expected size of the book catalog does NOT correspond to actual", 1, collectionSize);
    }

    @When("^I input the author \"([^\"]*)\" in the search input field$")
    public void iInputTheAuthorInTheSearchInputField(String author) {
        bookStorePage.searchInputField.shouldBe(visible).setValue(author);
    }

    @Then("^I see only the books by author \"([^\"]*)\" in Book Store Catalog$")
    public void iSeeOnlyTheBooksByAuthorInBookStoreCatalog(String authorName) {
        for (SelenideElement author : bookStorePage.booksAuthorCollection.filter(not(empty))) {
            author.shouldBe(visible).shouldHave(text(authorName));
        }
    }

    @When("^I input the publisher \"([^\"]*)\" in the search input field$")
    public void iInputThePublisherInTheSearchInputField(String publisher) {
        bookStorePage.searchInputField.shouldBe(visible).setValue(publisher);
    }

    @Then("^I see only the books by publisher \"([^\"]*)\" in Book Store Catalog$")
    public void iSeeOnlyTheBooksByPublisherInBookStoreCatalog(String publisher) {
        for (SelenideElement pubName : bookStorePage.booksPublisherCollection.filter(not(empty))) {
            pubName.shouldBe(visible).shouldHave(text(publisher));
        }
    }

    @Then("^I am on the Book Store Page$")
    public void iAmOnTheBookStorePage() {
        bookStorePage.bookStoreHeader.shouldBe(visible).shouldHave(text("Book Store"));
    }

    @When("^I click the \"([^\"]*)\" Title Link$")
    public void iClickTheTitleLink(String title) {
        $x("//*[text()='"+ title +"']").scrollTo().shouldBe(visible).click();
    }


    @When("^I click the Title Header$")
    public void iClickTheTitleHeader() {
        bookStorePage.titleHeaderButton.shouldBe(visible).click();
    }

    @Then("^I see the books sorted in A_Z order$")
    public void iSeeTheBooksSortedInA_ZOrder() {
        List<String> actualTitleSorting = bookStorePage.booksTitleCollection.filter(not(empty)).texts();
        List<String> expectedTitleSorting = new ArrayList<>(actualTitleSorting);
        sort(expectedTitleSorting);
        assertEquals(expectedTitleSorting, actualTitleSorting);
    }

    @When("^I double click the Title Header$")
    public void iDoubleClickTheTitleHeader() {
        bookStorePage.titleHeaderButton.shouldBe(visible).doubleClick();
    }

    @Then("^I see the books sorted in Z_A order$")
    public void iSeeTheBooksSortedInZ_AOrder() {
        List<String> actualTitleSorting = bookStorePage.booksTitleCollection.filter(not(empty)).texts();
        List<String> expectedTitleSorting = new ArrayList<>(actualTitleSorting);
        expectedTitleSorting.sort(reverseOrder());
        assertEquals(expectedTitleSorting, actualTitleSorting);
    }

    @When("^I click the Author Header$")
    public void iClickTheAuthorHeader() {
        bookStorePage.authorHeaderButton.shouldBe(visible).click();
    }

    @Then("^I see the books sorted by author in A_Z order$")
    public void iSeeTheBooksSortedByAuthorInA_ZOrder() {
        List<String> actualAuthorSorting = bookStorePage.booksAuthorCollection.filter(not(empty)).texts();
        List<String> expectedTitleSorting = new ArrayList<>(actualAuthorSorting);
        sort(expectedTitleSorting);
        assertEquals(expectedTitleSorting, actualAuthorSorting);
    }

    @When("^I double click the Author Header$")
    public void iDoubleClickTheAuthorHeader() {
        bookStorePage.authorHeaderButton.shouldBe(visible).doubleClick();
    }

    @Then("^I see the books sorted by author in Z_A order$")
    public void iSeeTheBooksSortedByAuthorInZ_AOrder() {
        List<String> actualAuthorSorting = bookStorePage.booksAuthorCollection.filter(not(empty)).texts();
        List<String> expectedAuthorSorting = new ArrayList<>(actualAuthorSorting);
        expectedAuthorSorting.sort(reverseOrder());
        assertEquals(expectedAuthorSorting, actualAuthorSorting);
    }

    @When("^I click the Publisher Header$")
    public void iClickThePublisherHeader() {
        bookStorePage.publisherHeaderButton.shouldBe(visible).click();
    }

    @Then("^I see the books sorted by publisher in A_Z order$")
    public void iSeeTheBooksSortedByPublisherInA_ZOrder() {
        List<String> actualPublisherSorting = bookStorePage.booksPublisherCollection.filter(not(empty)).texts();
        List<String> expectedPublisherSorting = new ArrayList<>(actualPublisherSorting);
        sort(expectedPublisherSorting);
        assertEquals(expectedPublisherSorting, actualPublisherSorting);
    }

    @When("^I double click the Publisher Header$")
    public void iDoubleClickThePublisherHeader() {
        bookStorePage.publisherHeaderButton.shouldBe(visible).doubleClick();
    }

    @Then("^I see the books sorted by publisher in Z_A order$")
    public void iSeeTheBooksSortedByPublisherInZ_AOrder() {
        List<String> actualAuthorSorting = bookStorePage.booksPublisherCollection.filter(not(empty)).texts();
        List<String> expectedAuthorSorting = new ArrayList<>(actualAuthorSorting);
        expectedAuthorSorting.sort(reverseOrder());
        assertEquals(expectedAuthorSorting, actualAuthorSorting);
    }

    @When("^I click the Login button on the Book Store page$")
    public void iClickTheLoginButtonOnTheBookStorePage() {
        bookStorePage.loginButton.shouldBe(visible).click();
    }

    @When("^I follow \"([^\"]*)\" book link$")
    public void iFollowBookLink(int index) {
        bookStorePage.booksTitleCollection.filter(not(empty)).get(index-1).scrollTo().click();
    }
}
