package navfort.pages;


import navfort.utilities.BrowserUtils;
import navfort.utilities.ConfigurationReader;
import navfort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);

    }

    public void login() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(2);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void loginwithCredentials(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();

    }

    public void loginwithinvalidCredentials(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();


    }

    @FindBy(xpath = "//*[.='Invalid user name or password.']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//*[@id='user-menu']/a")
    public WebElement actualUserName;


    @FindBy(xpath = "//*[.='Invalid user name or password.']")
    public WebElement errorMessage;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordBtn;

    @FindBy(className = "custom-checkbox__text")
    public WebElement rememberMeBtn;

}


