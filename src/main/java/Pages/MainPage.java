package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//INPUT[@id='firstname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    protected WebElement firstNameField;

    @FindBy(xpath = "//INPUT[@id='lastname-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    protected WebElement lastNameField;

    @FindBy(xpath = "//INPUT[@id='email-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    protected WebElement professionalEmail;

    @FindBy(xpath = "//INPUT[@id='phone-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    protected WebElement phoneNumber;

    @FindBy(xpath = "//INPUT[@id='company-9de5ebd5-2ab3-48fe-bac8-bfc25cfc5814']")
    protected WebElement companyName;

    @FindBy(xpath = "//INPUT[@type='submit']")
    protected WebElement submitButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void fillFirstNameField(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField)).sendKeys(firstName);
    }

    public void fillLastNameField(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField)).sendKeys(lastName);
    }

    public void fillEmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(professionalEmail)).sendKeys(email);
    }

    public void fillPhoneNumberField(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber)).sendKeys(phone);
    }

    public void fillCompanyNameField(String company) {
        wait.until(ExpectedConditions.elementToBeClickable(companyName)).sendKeys(company);
    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String copyLinkFromPopUpWindow() {
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
        WebElement link = wait.until(ExpectedConditions.visibilityOf(
                (driver.findElement(By.xpath("//a[@href='https://www.youtube.com/watch?v=yGTsxAY5T0g']")))));
        return link.getAttribute("href");
    }

    public void openNewWindowWithCopiedLink() {
        driver.get(copyLinkFromPopUpWindow());
    }

}
