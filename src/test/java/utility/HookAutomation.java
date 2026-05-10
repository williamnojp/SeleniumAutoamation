package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookAutomation extends BrowserDriver {
    @Before
    public void setupAutomation(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @After
    public void setdownAutomation(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
