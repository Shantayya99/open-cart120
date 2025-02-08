package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends basePage {
   public registerPage(WebDriver driver) {
   super(driver);
   }
   
   @FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
   private WebElement Reg_button;
   
   public void Register() {
	   Reg_button.click();
   }
   
}
