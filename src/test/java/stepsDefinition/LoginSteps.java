package stepsDefinition;

import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage lp = new LoginPage();

    @When("User successfully enter the login detail")
    public void userSuccessfullyEnterTheLoginDetail() {
        lp.inputUserName();
        lp.inputPassword();
        lp.clickLoginButton();
    }
}
