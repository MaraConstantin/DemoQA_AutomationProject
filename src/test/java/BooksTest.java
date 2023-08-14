import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import utils.Utils;

public class BooksTest extends BaseTest{

    @Test
    public void verifyBooksListTest() {
        Utils.waitInSeconds(1);
        HomePage homePage = new HomePage(driver);
        homePage.scrollToBookstoreCard();
        homePage.clickOnBookStoreCard();
        Utils.waitInSeconds(1);
        super.driver.findElement(By.cssSelector("#login")).click();
        LogInPage logInPage = new LogInPage(driver);
        logInPage.inputUsername();
        logInPage.inputPassword();
        logInPage.clickLogInButton();
        Utils.waitInSeconds(1);
        homePage.printAllBooks();
    }
}
