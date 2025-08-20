import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class AlcoholTypesTest extends BaseTest {
    
    @Test(priority = 2)
    public void AlcoholTypes() throws InterruptedException
    {
        try
        {
         System.out.println("AlcoholTypes Test"); 
         driver.navigate().to("https://smartpad-customer-feedback.vercel.app/auth/alcohol-types");
        
         //WebElement Button = driver.findElement(By.xpath("//div[@role='button']"));
        //WebElement Button = ElementUtils.FindElement(driver, By.xpath("//div[@role='button']"));
        //Button.click();
        
        //Thread.sleep(10000);
        //WebElement Logo = ElementUtils.FindElement(driver, By.xpath("//img[@alt='Logo']"));
         WebElement Logo = ElementUtils.WaitForElementVisible(driver,By.xpath("//img[@alt='Logo']"),10);
         Assert.assertTrue(Logo.isDisplayed(), "Logo is not displayed on the home page");
        
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='rounded-[15px]']/div/img/following-sibling::div")));
        */


        //List<WebElement> alcoholTypes = driver.findElements(By.xpath("//a[@class='rounded-[15px]']/div/img/following-sibling::div"));
    
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);

         
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//a[contains(@class,'rounded')]/div/img/following-sibling::div")
        ));

        List<WebElement> elements = driver.findElements(
        By.xpath("//a[contains(@class,'rounded')]/div/img/following-sibling::div"));
        System.out.println("alcoholTypes:"+elements.size());
        

        String[] ExpectedAlcoholList = {"Gin","Wine","Whisky","Beer","Rum","Vodka","Sake","Brandy","Tequila","Others"};
        
         
        for(int i=0 ; i < elements.size(); i++)
        {
            String alcoholType = elements.get(i).getText().trim();
            Assert.assertEquals(alcoholType, ExpectedAlcoholList[i]);
        }  
        
       WebElement WineElem =  ElementUtils.FindElement(driver, By.xpath("//a[contains(@class,'rounded')]/div/img/following-sibling::div[text()='Wine']")); 
       WineElem.click();
       Thread.sleep(5000);
       /* 
       WebElement ContinueElem = ElementUtils.FindElement(driver,By.xpath("//div[text()='Continue without an account']"));
       ContinueElem.click();
       */
       System.out.println("test");
    }

    catch(StaleElementReferenceException ex)
    {
      
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        // WebElement Logo = driver.findElement(By.xpath("//img[@alt='Logo']"));           
    }
}
}
