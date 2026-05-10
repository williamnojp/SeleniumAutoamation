package stepsDefinition;

import io.cucumber.java.en.Given;
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
}
