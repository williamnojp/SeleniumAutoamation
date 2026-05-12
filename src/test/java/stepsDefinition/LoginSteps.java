package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage lp = new LoginPage();

    @When("User successfully enter the login detail")
    public void userSuccessfullyEnterTheLoginDetail() {

    }

    @When("User input valid login credential")
    public void userInputValidLoginCredential() {
        lp.inputUserName(true);
        lp.inputPassword(true);
        lp.clickLoginButton();
    }

    @Given("User navigate to login page")
    public void userNavigateToLoginPage() {
        lp.VerifyUsernameAndPasswordFieldVisibility();
    }

    @When("User input invalid login credential")
    public void userInputInvalidLoginCredential() {
        lp.inputUserName(false);
        lp.inputPassword(true);
        lp.clickLoginButton();
    }

    @Then("Verify user is able to see error message")
    public void verifyUserIsAbleToSeeErrorMessage() {
        lp.VerifyErrorMessageVisibility();
    }
}
