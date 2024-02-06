package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SideBarPage {
    public SelenideElement loginLink = $(byText("Login"));
    public SelenideElement profileLink = $(byText("Profile"));
}
