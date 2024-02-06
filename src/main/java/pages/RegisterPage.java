package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class RegisterPage {
    public SelenideElement backToLoginButton = $(By.id("gotologin"));
    public SelenideElement registerButton = $(By.id("register"));
    public SelenideElement verifyRecaptchaMessage = $(By.id("name"));
    public SelenideElement firstNameInputField = $(By.id("firstname"));
    public SelenideElement lastNameInputField = $(By.id("lastname"));
    public SelenideElement userNameInputField = $(By.id("userName"));
    public SelenideElement passwordInputField = $(By.id("password"));
}
