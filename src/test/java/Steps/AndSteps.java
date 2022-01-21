package Steps;

import Cucumber.WebDriverSingleton;
import Pages.MainPage;
import io.cucumber.java.en.And;

public class AndSteps {

    private MainPage mainPage = new MainPage(WebDriverSingleton.INSTANCE.getDriver());


    @And("I fill all the relevant information with random valid values")
    public void allFieldsAreFilled() {
        mainPage.fillFirstNameField("John");
        mainPage.fillLastNameField("Doe");
        mainPage.fillEmailField("Somemail@lighthouse.com");
        mainPage.fillPhoneNumberField("+71111111111");
        mainPage.fillCompanyNameField("KMS Light House");
    }

    @And("I wait for the popup and click copy link button")
    public void copyingTheLink() {
        mainPage.copyLinkFromPopUpWindow();
    }
}
