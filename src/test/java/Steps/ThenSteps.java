package Steps;

import Cucumber.WebDriverSingleton;
import Pages.SubmitPage;
import Pages.VideoPage;
import io.cucumber.java.en.Then;

public class ThenSteps {

    private SubmitPage submitPage = new SubmitPage(WebDriverSingleton.INSTANCE.getDriver());
    private VideoPage videoPage = new VideoPage(WebDriverSingleton.INSTANCE.getDriver());

    @Then("I see that the submit was successful")
    public void verifyThatSubmittingIsSuccessful() {
        submitPage.verifyingThatSubmitWasSuccessful();
    }

    @Then("I verify that the GE Healthcare: A KMS Lighthouse Success Story video is opened")
    public void verifyThatVideoOpened() {
        videoPage.verifyThatVideoPageOpened();
    }
}
