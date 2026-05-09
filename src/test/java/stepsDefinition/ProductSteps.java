package stepsDefinition;

import io.cucumber.java.en.Then;
import pages.OnlineProductPage;

public class ProductSteps {

    OnlineProductPage opp = new OnlineProductPage();
    @Then("User should able to view the product category page")
    public void userShouldAbleToViewTheProductCategoryPage() {
        opp.verifyFormalShoeVisibility();
        opp.verifySneakersVisibility();
        opp.verifySportShoeVisibility();

    }
}
