package MavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
    //Step1-Locating each componnet using @FindBy Annotation
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//span[.='Log in']")
	private WebElement loginbutton;
	
	//Step2-Sepearte methods for each componnet to perform its action
	public void username_valid()
	{
		username.sendKeys("Rushi@gmail");
	}
	public void password_valid()
	{
		password.sendKeys("1234");
	}
	public void looginbutton()
	{
		loginbutton.click();
	}
	
	//Step3-Initilizing each componnets using PageFactory class inside the constructor""   
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
