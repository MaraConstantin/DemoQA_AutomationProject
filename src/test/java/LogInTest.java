import constants.Constants;
import constants.ErrorMessage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import utils.Utils;

public class LogInTest extends BaseTest{
    @Test
    public void logInTest() throws InterruptedException {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookStoreCard();
        Utils.waitInSeconds(1);
        driver.findElement(By.cssSelector("#login")).click();
        LogInPage logInPage = new LogInPage(driver);
        logInPage.inputUsername();
        logInPage.inputPassword();
        logInPage.clickLogInButton();
        Utils.waitInSeconds(1);
        String expectedMessage = Constants.USERNAME;
        String actualMessage = driver.findElement(By.cssSelector("#userName-value")).getText();
        Assert.assertEquals(actualMessage, expectedMessage, ErrorMessage.USERNAME_NOT_PRESENT);

        //driver.close();

    }
}
