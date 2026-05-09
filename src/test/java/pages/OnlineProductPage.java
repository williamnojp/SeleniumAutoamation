package pages;

import utility.BaseFunction;

public class OnlineProductPage  {

    BaseFunction bs = new BaseFunction();
    public String formalShoeXpath = "//*[@id=\"SmokeTests\"]";
    public String sportShoeXpath = "//*[@id=\"RegressionTests\"]";
    public String sneakersShoeXpath = "//*[@id=\"VanguardTests\"]";

    public String formalShoeSelector = "#SmokeTests";


    public void verifyFormalShoeVisibility(){
        bs.waitUntilElementVisible(formalShoeXpath);
    }
    public void verifySportShoeVisibility(){
        bs.waitUntilElementVisible(sportShoeXpath);
    }
    public void verifySneakersVisibility(){
        bs.waitUntilElementVisible(sneakersShoeXpath);
    }

}
