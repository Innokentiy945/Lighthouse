package Steps;

import Cucumber.WebDriverSingleton;
import Pages.MainPage;
import io.cucumber.java.en.Given;

public class GivenSteps {

    private MainPage mainPage = new MainPage(WebDriverSingleton.INSTANCE.getDriver());


    @Given("I open main page")
    public void homePageIsOpen() {
        WebDriverSingleton.INSTANCE.getDriver().get("https://www.kmslh.com/automation-test/");
        mainPage = new MainPage(WebDriverSingleton.INSTANCE.getDriver());
    }


}
