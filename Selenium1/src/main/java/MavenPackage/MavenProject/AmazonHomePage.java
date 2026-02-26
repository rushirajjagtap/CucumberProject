package MavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	WebDriver driver;
   @FindBy(xpath="//span[@class='nav-line-2 ']")
   private WebElement accountandlist;
   
   @FindBy(xpath=("//span[@class='nav-action-inner']"))
   private WebElement signin;
   
   public void hoveroveronAccountAndList(WebDriver driver) throws InterruptedException
   {
	   Actions a1= new Actions( driver);
	   a1.moveToElement(accountandlist).perform();
	   Thread.sleep(3000);
	   
   }
   public void SignInFromHomePage()
   {
	   signin.click();
	   
   }
   public AmazonHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   

}
