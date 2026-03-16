package PageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FundTransferPage 
{
WebDriver driver;
	
	public FundTransferPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Fund Transfer']")
	WebElement FundTrasLink;
	
	@FindBy(xpath="//input[@name='payersaccount']")
	WebElement PayersAccount;
	
	@FindBy(xpath="//input[@name='payeeaccount']")
	WebElement PayeeAccount;
	
	@FindBy(xpath="//input[@name='ammount']")
	WebElement amount;
	
	@FindBy(xpath="//input[@name='desc']")
	WebElement description;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement Acc_Submit;
	
	@FindBy(xpath="//p[text()='Fund Transfer Details']")
	WebElement Fund_Trans_Page;
	
	
	 public void clickonFundTransfer()
	 {
		 
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  
			 WebElement element=wait.until(ExpectedConditions.elementToBeClickable(FundTrasLink));
			 JavascriptExecutor js= (JavascriptExecutor)driver;
			 
			 js.executeScript("arguments[0].scrollIntoView(true);",element);
			  
			  js.executeScript("arguments[0].click();",element);
			  
		 
		 }
	 public void EnterPayersId(String Payersaccountno)
	 {
		 PayersAccount.sendKeys(Payersaccountno);
		 }
	 
	 public void EnterPayeesId(String Payeesaccountno)
	 {
		 PayeeAccount.sendKeys(Payeesaccountno);
		 }
	 
	 public void EnterAmount(String Amount)
	 {
		 amount.sendKeys(Amount);
		 }
	 
	 public void EnterDescription(String Description)
	 {
		 description.sendKeys(Description);
		 }
	 public void clickonsubmit()
	 {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  
		 wait.until(ExpectedConditions.elementToBeClickable(Acc_Submit));
		 Acc_Submit.click();
		 
	 }
	 
	 public void validateFundTransferDetailsPage()
	 {
		boolean flag=Fund_Trans_Page.isDisplayed();
		
		if(flag==true)
	 {
			System.out.println("Fund Transfer Details is Dispalyed");
	 }
		else
		{
			throw new NullPointerException("Fund Transfer Details is not Dispalyed");
		}
	 
	
	 }

}
