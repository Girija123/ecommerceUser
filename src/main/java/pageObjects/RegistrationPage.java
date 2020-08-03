package pageObjects;

import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class RegistrationPage
{

    public static WebDriver driverPage;

    public RegistrationPage(WebDriver driver)
    {
      this.driverPage = driver;
      PageFactory.initElements(driverPage, this);
    }

    @FindBy(name="firstname")
    WebElement firstName;

    @FindBy(name="lastname")
    WebElement surname;

    @FindBy(name="reg_email__")
    WebElement email;

    @FindBy(name="reg_passwd__")
    WebElement password;

    @FindBy(id="day")
    WebElement birthDay;

    @FindBy(id="month")
    WebElement birthMonth;

    @FindBy(id="year")
    WebElement birthYear;

    @FindBy(xpath="//*[@id=\"u_0_11\"]/span[1]/label")
    WebElement gender;

    @FindBy(name="websubmit")
    WebElement signUpButton;

    @FindBy(xpath="")
    WebElement successMessage;

    public void enterFirstname() throws Exception
    {
        firstName.sendKeys(readPropertyFile("firstname"));
    }


    public void enterSurname() throws Exception
    {
        surname.sendKeys(readPropertyFile("lastname"));
    }


    public void enteremail()
    {
        email.sendKeys();
    }


    public void enterPassword()
    {
        password.sendKeys();
    }

    public void chooseBirthDate()
    {
        new Select(birthDay).selectByVisibleText("12");
        new Select(birthMonth).selectByValue("3");
        new Select(birthYear).selectByIndex(15);
    }

    public void chooseGender()
    {
        gender.click();
    }

    public void clickSignUp()
    {
        signUpButton.click();
    }

    public void validateRegistration()
    {
        String expectedMessage = "Registered Succesfully";
        String actualMessage = successMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    public String  readPropertyFile(String key) throws Exception
    {

     FileInputStream inputStream = new FileInputStream("C:\\Users\\rohin.ramadass\\OneDrive - Accenture\\Downloads\\ecommerceUser\\src\\main\\resources\\testData\\registrationData.properties");

     Properties properties = new Properties();
     properties.load(inputStream);

     return  properties.getProperty(key);

    }

}
