package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement logOutButton = $x("//*[text()='Log out']");
    public SelenideElement notLogginLabel = $(By.id("notLoggin-label"));
    public ElementsCollection booksCollection = $$(By.cssSelector("[class ='rt-tr-group']"));
    public ElementsCollection booksTitleCollection = $$(By.className("action-buttons"));
    public SelenideElement bookStoreLink = $x("//*[text()='Book Store']");
    public SelenideElement actionColumn = $x("//div[text() ='Action']");
    public ElementsCollection actionDelete = $$(By.id("delete-record-undefined"));
    public SelenideElement deleteAllBooksButton = $("[class='text-right button di']");
    public SelenideElement confirmModalWindow = $(By.id("closeSmallModal-ok"));
    public SelenideElement deleteAccountButton = $x("//*[text()='Delete Account']");
}
