package navfort.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.DashboardPage;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import navfort.utilities.Driver;
import org.junit.Assert;

public class LoginAC2StepDefs {

    @When("the user enters invalid credentials {string} {string}")
    public void the_user_enters_invalid_credentials(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.loginwithCredentials(username, password);
    }


    @Then("the user should see the Login page {string}")
    public void theUserShouldSeeTheLoginPage(String expectedTitle) {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Messages do not match",expectedTitle,actualTitle);
    }
}