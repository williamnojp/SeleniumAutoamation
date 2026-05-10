package stepsDefinition;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeSteps {

    HomePage hp = new HomePage();

    @Then("Verify user is in Home Page")
    public void verifyUserInHomePage() {
        hp.verifyUserInHomePage();
    }
}
