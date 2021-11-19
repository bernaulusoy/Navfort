package navfort.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import org.junit.Assert;

public class LoginAC5StepDefs {

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.loginwithCredentials(username, password);

    }

    @Then("user should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {

        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitFor(4);
        String actualType = loginPage.passwordBox.getAttribute("type");

        new LoginPage().passwordBox.sendKeys("58790");
        System.out.println("Value of type attribute: "+ actualType);;

        Assert.assertEquals("password", actualType);

    }
    }


