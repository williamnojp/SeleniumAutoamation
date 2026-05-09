package stepsDefinition;

import io.cucumber.java.en.Given;
import pages.HomePage;


public class HomeSteps {

    HomePage hp = new HomePage();

    @Given("User navigate to login page")
    public void userNavigateToLoginPage() throws InterruptedException {
        hp.click_toggle_menu();
        System.out.println("runner berhasil jalan");
        hp.click_signIn_link();
    }
}
