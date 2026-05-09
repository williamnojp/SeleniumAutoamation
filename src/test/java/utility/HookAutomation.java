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
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }
    @After
    public void setdownAutomation(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
