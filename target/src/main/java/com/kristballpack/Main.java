package com.kristballpack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Main {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        
        // Navigate to a website
        driver.get("https://smartpad-customer-feedback.vercel.app/");

        String title = driver.getTitle();
        System.out.println(title);
        
        // Close the browser
        //driver.quit();
    }
}