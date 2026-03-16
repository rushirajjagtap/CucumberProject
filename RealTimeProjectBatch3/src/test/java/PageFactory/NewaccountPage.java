package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewaccountPage 
{
	WebDriver driver;
	public NewaccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement Newacc_link;
	
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement Customerid;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement Account_Type;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement Init_Deposit;
	
	@FindBy(xpath="//input[@name='button2']")
	WebElement submit_button2;
	
	@FindBy(xpath="//p[text()='Account Generated Successfully!!!']")
	WebElement Acc_gen_Page;
	
	
	public void clickNewAcclink()
	{
		 Newacc_link.click();
	}
	
	
	public void enterCustomerid(String customerid)
	{

		 Customerid.sendKeys(customerid);
	}
	
	public void enterAccountType(String AccountType)
	{

		Account_Type.sendKeys(AccountType);
	}
	
	public void enterInitialDeposit(String intialdeposit)
	{

		Init_Deposit.sendKeys(intialdeposit);
	}
	public void clicksubmit()
	{
		submit_button2.click();
		
	}
	
	public void validateAccountGeneration()
	 {
		boolean flag=Acc_gen_Page .isDisplayed();
		
		if(flag==true)
	 {
			System.out.println("Account page is generated");
	 }
		else
		{
			throw new NullPointerException("no Account page is generated");
		}
	 }

}
