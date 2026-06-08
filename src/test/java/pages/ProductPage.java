package pages;

import utility.BaseFunction;

public class ProductPage {

    BaseFunction bs = new BaseFunction();

    String shoppingCartClass = "shopping_cart_link";

    String headerContainerID = "header_container";
    String inventoryContainerID = "inventory_container";
    String sortingProductXPATH= "//*[@id=\"header_container\"]/div[2]/div/span/select";
    String sortingZA = "za";
    public void verifyUserInHomePage(){
        bs.VerifyWebPageLink("inventory");
        bs.waitUntilElementVisiblebyClass(shoppingCartClass);

    }

    public void verifyProductPageElement(){
        bs.waitUntilElementVisiblebyID(headerContainerID);
        bs.waitUntilElementVisiblebyID(inventoryContainerID);
    }


    public void selectProductSortingbyName(boolean Ascending) throws InterruptedException {
        bs.Waitfortime(5);
        bs.SelectSort(sortingProductXPATH,sortingZA);
        bs.Waitfortime(5);

    }
}
