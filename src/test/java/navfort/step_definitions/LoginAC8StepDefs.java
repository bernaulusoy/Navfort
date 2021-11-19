package navfort.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.DashboardPage;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginAC8StepDefs {

    @When("user logins with valid username and hits {string} button")
    public void user_logins_with_valid_username_and_hits_button(String username) {

        BrowserUtils.waitFor(3);
        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(username);
        loginPage.loginBtn.sendKeys(Keys.ENTER);


    }



    @Then("user logins with valid password and hits {string} button")
    public void user_logins_with_valid_password_and_hits_button(String password) {

        BrowserUtils.waitFor(3);
        LoginPage loginPage = new LoginPage();
        loginPage.passwordBox.sendKeys(password);
        loginPage.loginBtn.sendKeys(Keys.ENTER);

    }

    @Then("user should see {string} page")
    public void user_should_see_page(String expectedSubTitle) {

        DashboardPage dashboardPage = new DashboardPage();
        BrowserUtils.waitFor(3);
        String actualSubTitle = dashboardPage.pageSubTitle.getText();
        Assert.assertEquals(expectedSubTitle, actualSubTitle);

    }

}
