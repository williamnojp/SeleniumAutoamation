package pages;

import utility.BaseFunction;

public class HomePage {

    BaseFunction bs = new BaseFunction();

    String shoppingCartClass = "shopping_cart_link";

    public void verifyUserInHomePage(){
        bs.VerifyWebPageLink("inventory");
        bs.waitUntilElementVisiblebyClass(shoppingCartClass);

    }

}
