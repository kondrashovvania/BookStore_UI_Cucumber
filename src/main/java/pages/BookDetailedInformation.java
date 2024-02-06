package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class BookDetailedInformation {
    public SelenideElement ISBN = $(By.id("ISBN-label"));
    public SelenideElement title = $(By.id("title-label"));
    public SelenideElement author = $x("//*[text()='Author : ']");
    public SelenideElement publisher = $x("//*[text()='Publisher : ']");
    public SelenideElement totalPages = $(By.id("pages-label"));
    public SelenideElement website = $x("//label[contains(text(),'http')]");
    public SelenideElement addToYourCollectionButton = $(byText("Add To Your Collection"));
    public SelenideElement backToBookStoreButton = $("[class=\"text-left fullButton\"]");


}

