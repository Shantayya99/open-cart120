package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.registerPage;

public class AccountRegisterTest {

	//Scripts
	WebDriver driver;
        @BeforeClass
         public void setup() {
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/");
        }
        
        @Test
        public void registered() {
		registerPage r=new registerPage(driver);
		r.Register();
        }
        
	    @AfterClass
	    public void teardown() {
	    	driver.quit();
	    }

}
