import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class HomeTest extends BaseTest {

    @Test(priority = 1)
    public void testHomePageTitle() {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        
        // Home page test
        driver.navigate().to("https://smartpad-customer-feedback.vercel.app/");
        String HomepageUrl = driver.getCurrentUrl();
        Assert.assertTrue(HomepageUrl.contains("vercel.app"),"URL not present");

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Customer Feedback"),"Title not present");
        //System.out.println(title);

        //WebElement Logo = utils.findElement(driver,By.xpath("//img[@alt='Logo']"));
        WebElement Logo = ElementUtils.FindElement(driver, By.xpath("//img[@alt='Logo']"));

        Assert.assertTrue(Logo.isDisplayed(), "Logo is not displayed on the home page");

        WebElement Button = ElementUtils.FindElement(driver, By.xpath("//div[@role='button']"));
        String btnText =  Button.getText();
        //System.out.println(btnText);
        Assert.assertTrue(btnText.contains("Get started"),"Get started button is not present on the home page");
        
        
        Button.click();


 }
}
