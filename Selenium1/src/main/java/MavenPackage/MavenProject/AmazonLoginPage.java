package MavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage 
{
	WebDriver driver;
	   @FindBy(name="email")
	   private WebElement username;
	   
	   @FindBy(id="continue")
	   private WebElement continuebutton;
	   
	   @FindBy(xpath="//input[@name='password']")
	   private WebElement password;
	   
	   @FindBy(id="signInSubmit")
	   private WebElement signin;
	   
	   public void validUsername()
	   {
		   username.sendKeys("Rushiraj22jagtap@gmail.com");
		   
	   }
	   public void continueClick()
	   {
		   continuebutton.click();
	   }
	   public void validPassword()
	   {
		   password.sendKeys("Riush@5678");
		   
	   }
	   public void signClick()
	   {
		   signin.click();
	   }
	   public AmazonLoginPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   

}
