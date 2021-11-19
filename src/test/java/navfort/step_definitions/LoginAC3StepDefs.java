package navfort.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import org.junit.Assert;

public class LoginAC3StepDefs {


    @Then("the user can see his own name {string} {string}")
    public void the_user_can_see_his_own_name(String firstName, String lastName) {

            BrowserUtils.waitFor(3);
            LoginPage loginPage = new LoginPage();
            String actualUserName = loginPage.actualUserName.getText();
            String expectedUserName = firstName + " " + lastName;
            Assert.assertEquals(expectedUserName, actualUserName);
        }

}





