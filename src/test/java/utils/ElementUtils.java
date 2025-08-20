package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

public class ElementUtils {

    public static void clickElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
    }

    public static void enterText(WebDriver driver, By locator,String text){
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    
    public static WebElement WaitForElementVisible(WebDriver driver, By locator, int timeOutInSeconds) {
        // Implement wait logic here, e.g., using WebDriverWait
        // This is a placeholder for the actual implementation
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }
    
    public static WebElement FindElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }

    public static List<WebElement> findElements(WebDriver driver, By locator,int timeOutInSeconds) {
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOutInSeconds));
         wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
         return driver.findElements(locator);
    }

    public static String getElementText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }
}
