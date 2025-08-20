import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ElementUtils;

public class SignupTest extends BaseTest {
    
    @Test
    public void testHomePageTitle() {
        driver.navigate().to("https://smartpad-customer-feedback.vercel.app/signup");
        WebElement yesButton = driver.findElement(By.xpath("//button[text()='Yes']"));
        yesButton.click();

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Type your name here...']"));
        username.sendKeys("Koripriyan");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("koripriyan@example.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Type your password here...']"));
        password.sendKeys("123");

        WebElement confirmpassword = driver.findElement(By.xpath("//input[@placeholder='Type your password here again...']"));
        confirmpassword.sendKeys("123");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement SignupBtn = driver.findElement(By.xpath("//button[text()='Sign up']"));
        SignupBtn.click();

        WebElement LoginBtn = driver.findElement(By.xpath("//p[text()='Login']"));
        LoginBtn.click();

    }
}
