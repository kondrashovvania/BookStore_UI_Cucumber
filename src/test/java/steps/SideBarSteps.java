package steps;

import cucumber.api.java.en.And;

import static com.codeborne.selenide.Condition.*;

public class SideBarSteps extends BaseSteps{
    @And("^I follow the Profile link on the Sidebar$")
    public void iFollowTheProfileLinkOnTheSidebar() {
        sideBarPage.profileLink.scrollIntoView(true).shouldBe(visible).click();
    }
}
