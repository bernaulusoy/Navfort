package navfort.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navfort.pages.LoginPage;
import navfort.utilities.BrowserUtils;
import navfort.utilities.Driver;
import org.junit.Assert;

public class LoginAC6StepDefs {

    @When("the user clicks password link")
    public void the_user_clicks_password_link() {

        BrowserUtils.waitFor(3);
        LoginPage loginPage = new LoginPage();
        loginPage.forgotPasswordBtn.click();


    }

    @Then("the user should land on the ‘Forgot Password’ page")
    public void the_user_should_land_on_the_Forgot_Password_page(String expectedTitle) {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println(expectedTitle);
        System.out.println(actualTitle);

    }


}
