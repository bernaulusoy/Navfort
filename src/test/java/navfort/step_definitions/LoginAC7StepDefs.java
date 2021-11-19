package navfort.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import org.junit.Assert;

public class LoginAC7StepDefs {

    @When("user can see {string} link on the login page")
    public void user_can_see_link_on_the_login_page(String expectedLink) {

        BrowserUtils.waitFor(4);
        LoginPage loginPage = new LoginPage();
        String actualLink = loginPage.rememberMeBtn.getText();
        Assert.assertEquals(actualLink,expectedLink);

    }

    @Then("it should be clickable")
    public void it_should_be_clickable() {

        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.rememberMeBtn.isEnabled());
    }


}
