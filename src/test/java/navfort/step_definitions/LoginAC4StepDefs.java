package navfort.step_definitions;

import io.cucumber.java.en.Then;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import org.junit.Assert;

public class LoginAC4StepDefs {

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {

        BrowserUtils.waitFor(4);
        LoginPage loginPage = new LoginPage();

        String actualErrorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals("Messages don't match",expectedErrorMessage, actualErrorMessage );

    }

}
