package Utils;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Utils {
    private Utils(){

    }

    public static void click(By by, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.click();
    }

    public static void sendKeys(By by, String value, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
    }

    private static WebElement waitUntilElementPresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
