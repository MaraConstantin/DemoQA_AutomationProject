package pages;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#login")
    protected WebElement logInButton;

    @FindBy(css = "#userName")
    protected WebElement usernameField;
    @FindBy(css = "#password")
    protected WebElement passwordField;
    public void clickLogInButton(){

        this.logInButton.click();
    }

    public void inputUsername(){
        this.usernameField.sendKeys(Constants.USERNAME);}
    public void inputPassword(){
        this.passwordField.sendKeys(Constants.PASSWORD);}
}
