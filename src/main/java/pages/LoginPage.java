package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public SelenideElement userNameInputField = $(By.id("userName"));
    public SelenideElement passwordInputField = $(By.id("password"));
    public SelenideElement invalidUserNameFormControl = $x("//*[@class='mr-sm-2 is-invalid form-control' and @id='userName']");
    public SelenideElement invalidPasswordFormControl = $x("//*[@class='mr-sm-2 is-invalid form-control' and @id='password']");
    public SelenideElement loginButton = $(By.cssSelector("[class='btn btn-primary']"));
    public SelenideElement newUserButton = $(byText("New User"));
   public SelenideElement invalidUsernameAndPasswordMessage = $(byId("name"));

}
