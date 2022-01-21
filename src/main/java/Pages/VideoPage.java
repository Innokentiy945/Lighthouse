package Pages;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends AbstractPage {

    @FindBy(xpath = "//h1[@class='title style-scope ytd-video-primary-info-renderer']")
    protected WebElement videoTitle;


    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public void verifyThatVideoPageOpened() {
        Assert.assertTrue(videoTitle.isDisplayed());
        Assert.assertEquals(videoTitle.getText(), "GE Healthcare: A KMS Lighthouse Success Story");
    }
}
