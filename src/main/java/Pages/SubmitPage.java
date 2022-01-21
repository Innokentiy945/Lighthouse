package Pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SubmitPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='elementor-element elementor-element-23fc45a elementor-widget elementor-widget-heading']")
    protected WebElement successfulConformation;

    public SubmitPage(WebDriver driver) {
        super(driver);
    }

    public void verifyingThatSubmitWasSuccessful() {
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
        Assert.assertTrue(successfulConformation.isDisplayed());
    }
}
