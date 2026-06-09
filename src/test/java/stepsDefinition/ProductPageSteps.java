package stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductPageSteps {

    ProductPage pp = new ProductPage();

    @Then("Verify user is in Product Page")
    public void verifyUserIsInProductPage() {
        pp.verifyProductPageElement();
    }

    @When("User select sort products by name A-Z")
    public void userSelectSortProductsByNameAZ() throws InterruptedException {
        pp.selectProductSortingbyName(true);
    }

    @When("User select sort products by name Z-A")
    public void userSelectSortProductsByNameZA()throws InterruptedException {
        pp.selectProductSortingbyName(false);

    }

    @When("User select sort products by prize LoHi")
    public void userSelectSortProductsByPrizeLoHi()throws InterruptedException {
        pp.selectProductSortingbyPrice(true);

    }

    @When("User select sort products by price Hilo")
    public void userSelectSortProductsByPriceHilo() throws InterruptedException {
        pp.selectProductSortingbyPrice(false);

    }
}
