package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseFunction;
import utility.BrowserDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPage {

    BaseFunction bs = new BaseFunction();

    String shoppingCartClass = "shopping_cart_link";

    String headerContainerID = "header_container";
    String inventoryContainerID = "inventory_container";
    String sortingProductXPATH = "//*[@id=\"header_container\"]/div[2]/div/span/select";
    String sortingZA = "za";
    String sortingAZ = "az";

    String sortingHiLo = "hilo";
    String sortingLoHi = "lohi";
    String productNameClass = "inventory_item_name";
    String productPriceClass = "inventory-item-price";

    public void verifyUserInHomePage() {
        bs.VerifyWebPageLink("inventory");
        bs.waitUntilElementVisiblebyClass(shoppingCartClass);

    }

    public void verifyProductPageElement() {
        bs.waitUntilElementVisiblebyID(headerContainerID);
        bs.waitUntilElementVisiblebyID(inventoryContainerID);
    }


    public void selectProductSortingbyName(boolean Ascending) throws InterruptedException {
        bs.Waitfortime(3);
        if (Ascending){
            bs.SelectSort(sortingProductXPATH, sortingAZ);
        }else {
            bs.SelectSort(sortingProductXPATH, sortingZA);
        }
        verifyProductNameSorting(Ascending);
        bs.Waitfortime(2);
    }

    public void selectProductSortingbyPrice(boolean Ascending) throws InterruptedException {
        bs.Waitfortime(3);
        if (Ascending){
            bs.SelectSort(sortingProductXPATH, sortingLoHi);
        }else {
            bs.SelectSort(sortingProductXPATH, sortingHiLo);
        }
        bs.Waitfortime(2);
    }

    public void verifyProductNameSortedAscending(){
        List<String> actualProductNames = getProductNames();
        List<String> expectedProductNames = new ArrayList<>(actualProductNames);
        Collections.sort(expectedProductNames);

        assertEquals(expectedProductNames, actualProductNames, "Product names are not sorted A-Z");
    }

    public void verifyProductNameSortedDescending(){
        List<String> actualProductNames = getProductNames();
        List<String> expectedProductNames = new ArrayList<>(actualProductNames);
        expectedProductNames.sort(Collections.reverseOrder());

        assertEquals(expectedProductNames, actualProductNames, "Product names are not sorted Z-A");
    }

    public void verifyProductPriceSortedAscending(){
        List<Double> actualProductPrices = getProductPrices();
        List<Double> expectedProductPrices = new ArrayList<>(actualProductPrices);
        Collections.sort(expectedProductPrices);

        assertEquals(expectedProductPrices, actualProductPrices, "Product prices are not sorted low to high");
    }

    public void verifyProductPriceSortedDescending(){
        List<Double> actualProductPrices = getProductPrices();
        List<Double> expectedProductPrices = new ArrayList<>(actualProductPrices);
        expectedProductPrices.sort(Collections.reverseOrder());

        assertEquals(expectedProductPrices, actualProductPrices, "Product prices are not sorted high to low");
    }

    public void verifyProductNameSorting(boolean Ascending){
        if (Ascending){
            verifyProductNameSortedAscending();
        }else {
            verifyProductNameSortedDescending();
        }
    }

    public void verifyProductPriceSorting(boolean Ascending){
        if (Ascending){
            verifyProductPriceSortedAscending();
        }else {
            verifyProductPriceSortedDescending();
        }
    }

    private List<String> getProductNames(){
        List<WebElement> productNameElements = BrowserDriver.driver.findElements(By.className(productNameClass));
        List<String> productNames = new ArrayList<>();

        for (WebElement productNameElement : productNameElements){
            productNames.add(productNameElement.getText());
        }

        return productNames;
    }

    private List<Double> getProductPrices(){
        List<WebElement> productPriceElements = BrowserDriver.driver.findElements(By.className(productPriceClass));
        List<Double> productPrices = new ArrayList<>();

        for (WebElement productPriceElement : productPriceElements){
            String priceText = productPriceElement.getText().replace("$", "");
            productPrices.add(Double.parseDouble(priceText));
        }

        return productPrices;
    }
}
