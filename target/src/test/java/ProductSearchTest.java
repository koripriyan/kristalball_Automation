import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class ProductSearchTest extends BaseTest{
    
    @Test
    public void testProductSearch() {
        driver.navigate().to("https://smartpad-customer-feedback.vercel.app/products");

        
        WebElement productResult = ElementUtils.FindElement(driver, By.xpath("//input[@placeholder='Search by product name...']"));
        productResult.sendKeys("Wine");

        List<WebElement> ProductList = driver.findElements(By.xpath("//div[@class='grid grid-cols-1 gap-x-4 gap-y-8 sm:grid-cols-2 sm:gap-x-6 md:grid-cols-3 lg:grid-cols-5 xl:gap-x-8']/a"));
        
        for(int i=0; i < ProductList.size(); i++) {
        
          Assert.assertTrue(ProductList.get(i).getText().contains("Wine"), "Product 'Wine' not found in the search results");  
        }
    }
   
}
