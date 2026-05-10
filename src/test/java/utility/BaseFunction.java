package utility;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class BaseFunction extends BrowserDriver {

    public void clickButton(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clickBbuttonbyID(String id){
        driver.findElement(By.id(id)).click();

    }
    public void inputTextbyID(String id, String text){
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void  waitUntilElementVisiblebyXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        assertTrue(element.isDisplayed());
    }
    public void  waitUntilElementVisiblebyID(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
        assertTrue(element.isDisplayed());
    }
    public void  waitUntilElementVisiblebyClass(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
        assertTrue(element.isDisplayed());
    }

    public void VerifyWebPageLink(String url){
        String urlPage = driver.getCurrentUrl();
        assertTrue(urlPage.toLowerCase().contains(url));
    }


}
