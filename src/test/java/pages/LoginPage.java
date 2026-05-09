package pages;

import org.openqa.selenium.By;
import utility.BaseFunction;
import utility.BrowserDriver;


public class LoginPage{
   BaseFunction bs = new BaseFunction();

    public String usernameFieldID = "usr";
    public String passwordFieldID = "pwd";
    public String loginButton = "//*[@id=\"second_form\"]/input";

    public void inputUserName(){

        bs.inputTextbyID(usernameFieldID,"test");
    }
    public void inputPassword(){
        bs.inputTextbyID(passwordFieldID,"test");
    }

    public void clickLoginButton(){
       bs.clickButton(loginButton);

    }

}
