package navfort.pages;

import navfort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    public DashboardPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement pageSubTitle;






}