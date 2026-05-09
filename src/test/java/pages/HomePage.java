package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    static String toggleMenuXPATH = "//*[@id=\"menuToggle\"]/input";
    static String signInPortalXPATH = "//*[@id=\"menu\"]/a[2]";
    static String signInPortalLinkText = "Sign In Portal";


    public void click_toggle_menu()  throws  InterruptedException{
       // WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(1000);
        driver.findElement (By.xpath(toggleMenuXPATH)).click();
    }

    public void click_signIn_link() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement (By.xpath(signInPortalXPATH)).click();

    }

}
