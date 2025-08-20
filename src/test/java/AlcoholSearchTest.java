import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class AlcoholSearchTest extends BaseTest {
    
    @Test
    public void productSearch() throws AWTException
    {
        try
        {        
         
        Robot robot = new Robot();    
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://smartpad-customer-feedback.vercel.app/auth/alcohol-types");
         
        
        List<WebElement> alcoholTypes = driver.findElements(By.xpath("//a[@class='rounded-[15px]']/div/img/following-sibling::div"));    
        System.out.println("alcoholTypes");
        for (WebElement webElement : alcoholTypes) {
              
            if(webElement.getText().trim().contains("Wine")) {
                System.out.println("Wine found");
                webElement.click();
                break;
            }
        }

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //WebElement ContinueElem = ElementUtils.FindElement(driver,By.xpath("//div[text()='Continue without an account']"));
        //ContinueElem.click();

        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ContinueLink = wait.until(ExpectedConditions
        .elementToBeClickable(By.xpath("//div[text()='Continue without an account']")));
        
        System.out.println(ContinueLink.getText());
        ContinueElem.click();
        */
        }

        catch(StaleElementReferenceException ex)
        {   
            /* 
            WebDriver driver = new ChromeDriver();
            List<WebElement> alcoholTypes = driver.findElements(By.xpath("//a[@class='rounded-[15px]']/div/img/following-sibling::div"));    
            */
        }

        
    }
}
