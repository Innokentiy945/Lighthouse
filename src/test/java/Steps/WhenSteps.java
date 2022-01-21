package Steps;

import Cucumber.WebDriverSingleton;
import Pages.MainPage;
import io.cucumber.java.en.When;

public class WhenSteps {

    private MainPage mainPage = new MainPage(WebDriverSingleton.INSTANCE.getDriver());

    @When("I click Submit button")
    public void clickSubmitButton() {
        mainPage.clickSubmitButton();
    }

    @When("I open the copied link")
    public void openingCopiedLink() {
        mainPage.openNewWindowWithCopiedLink();
    }
}
