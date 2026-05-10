package pages;

import org.openqa.selenium.By;
import utility.BaseFunction;
import utility.BrowserDriver;


public class LoginPage{
   BaseFunction bs = new BaseFunction();

    public String usernameFieldID = "user-name";
    public String passwordFieldID = "password";
    public String loginButtonID = "login-button";

    public String validUsernameText = "standard_user";
    public String validPasswordText = "secret_sauce";
    public String invalidPasswordText = "secretsauce";

    public String lockedUserNameText = "locked_out_user";


    public void inputUserName(boolean valid){
        String inputText = "";
        if (valid){
            inputText = validUsernameText;
        }
        else{
            inputText = lockedUserNameText;
        }
        bs.inputTextbyID(usernameFieldID,inputText);
    }

    public void inputPassword(boolean valid){

        String inputText = "";
        if (valid){
            inputText = validPasswordText;
        }
        else{
            inputText = invalidPasswordText;
        }
        bs.inputTextbyID(passwordFieldID,inputText);
    }

    public void clickLoginButton(){
       bs.clickBbuttonbyID(loginButtonID);

    }

    public void VerifyUsernameAndPasswordFieldVisibility(){
        bs.waitUntilElementVisiblebyID(usernameFieldID);
        bs.waitUntilElementVisiblebyID(passwordFieldID);
    }

}
