package testExecution;


import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class TestSignUp {

     WebDriver driver;

     public  void executeTest()
     {
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("http://www.facebook.com");
         driver.findElement(By.id("email")).sendKeys("georgeLynn.com");
         driver.findElement(By.id("pass")).sendKeys("Test@123");
         driver.findElement(By.id("signIn")).click();

         String expectedMessage = "Logged in Succesfully";
         String actualMessage = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
         Assert.assertEquals(expectedMessage, actualMessage);
         driver.quit();
     }

    public static void main(String[] args) {
        TestSignUp testSignUp = new TestSignUp();
        testSignUp.executeTest();
    }




}
