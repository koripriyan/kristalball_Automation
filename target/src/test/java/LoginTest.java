import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class LoginTest extends BaseTest {
   
    @Test
    public void testLogin() {
        driver.navigate().to("https://smartpad-customer-feedback.vercel.app/login");
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Type your email here...']"));
        email.sendKeys("Koripriyan@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Type your password here...']"));
        password.sendKeys("123");
    }
}   
