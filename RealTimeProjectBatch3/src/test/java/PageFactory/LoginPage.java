package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver driver;//instance variable//
	
	public LoginPage(WebDriver driver)//local variable//
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@name='uid']")
	WebElement UserId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement LoginButton;
	
	@FindBy(xpath="//input[@name='btnReset']")
	WebElement resetButton;
	
	public void enterUserName(String userName)
	{
		UserId.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickLogin()
	{
		LoginButton.click();
	}
	

	public void clickReset()
	{
		resetButton.click();
	}
	
	
	
	
	
}
