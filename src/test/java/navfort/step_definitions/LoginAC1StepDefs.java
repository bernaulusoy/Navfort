package navfort.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.DashboardPage;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import navfort.utilities.ConfigurationReader;
import navfort.utilities.Driver;
import org.junit.Assert;

public class LoginAC1StepDefs {

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @When("the user enters valid credentials {string} {string}")
    public void the_user_enters_valid_credentials(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.loginwithCredentials(username, password);

    }
    @Then("the user should land on the {string} page")
    public void the_user_should_land_on_the_page(String expectedSubTitle) {

        DashboardPage dashboardPage = new DashboardPage();
        BrowserUtils.waitFor(3);
        String actualSubTitle = dashboardPage.pageSubTitle.getText();
        Assert.assertEquals(expectedSubTitle, actualSubTitle);

        System.out.println(expectedSubTitle);
        System.out.println(actualSubTitle);


    }




}
