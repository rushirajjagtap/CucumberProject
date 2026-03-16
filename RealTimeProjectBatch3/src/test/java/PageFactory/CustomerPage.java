package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.CommonFunctions;

import java.time.Duration;
import java.util.*;

public class CustomerPage 
{
	WebDriver driver;
	
	 public	CustomerPage(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver, this); 
	 }
	 
	 @FindBy(xpath="//a[text()='New Customer']")
	 WebElement newCustLink;
	 
	 
	 @FindBy(xpath="//input[@name='name']")
	 WebElement CustomerName;
	 
	 
	 @FindBy(xpath="//input[@value='f']")
	 WebElement Gender;
	 
	 @FindBy(xpath="//input[@name='dob']")
	 WebElement Dob;
	 
	 @FindBy(xpath="//textarea[@name='addr']")
	 WebElement Address;
	 
	 
	 
	 @FindBy(xpath="//input[@name='city']")
	 WebElement City;
	 
	 
	 @FindBy(xpath="//input[@name='state']")
	 WebElement State;
	 
	 @FindBy(xpath="//input[@name='pinno']")
	 WebElement Pin;
	 
	 @FindBy(xpath="//input[@name='telephoneno']")
	 WebElement Mobile_num;
	 
	 @FindBy(xpath="//input[@name='emailid']")
	 WebElement Email;
	 
	 @FindBy(xpath="//input[@name='password']")
	 WebElement Pawd;
	 
	 @FindBy(xpath="//input[@name='sub']")
	 WebElement Submit_Button;
	 
	 @FindBy(xpath="//input[@name='res']")
	 WebElement Reset_Button;
	 
	 @FindBy(xpath="//*[text()='Customer ID']")
	 WebElement CustID;

	 @FindBy(xpath="//*[text()='Customer ID']//following-sibling::td")
	 WebElement CusIDval;
	 
	 
	 public void clickonNewCustomer()
	 {
		 
		 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 mywait.until(ExpectedConditions.elementToBeClickable(newCustLink));
		 newCustLink.click();
		 }
	 
	 public void enterCustomerName(String cname)
	 {
		 CustomerName.sendKeys(cname);
		 }
	 
	 
	 public void selectGender()
	 {
		 Gender.click();
		 }
	 
	 
	 public void enterDob(String doB)
	 {
		 Dob.sendKeys(doB);
		 }
	 
	 
	 public void enterAddress(String address)
	 {
		 Address.sendKeys(address);
		 }
	 
	 
	 public void enterCityName(String city)
	 {
		 City.sendKeys(city);
		 }
	 
	 
	 public void enterStateName(String state)
	 {
		 State.sendKeys(state);
		 }
	 
	 
	 public void enterPin(String pin)
	 {
		 Pin.sendKeys(pin);
		 }
	 
	 
	 public void enterMobile_num(String mobile)
	 {
		 Mobile_num.sendKeys(mobile);
		 }
	 
	 
	 public void enterEmail()
	 {
		Email.sendKeys(CommonFunctions.generateRandomEmailId());
		 }
	 
	 
	 public void enterPawd(String password)
	 {
		 Pawd.sendKeys(password);
		 }
	 
	 
	 public void clickSubmit_Button()
	 {
		 Submit_Button.click();
		 }
	 
	 
	 public void Reset_Button()
	 {
		 Reset_Button.click();
		 }
	 
	 public void validateCustIDGeneration()
	 {
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 mywait.until(ExpectedConditions.elementToBeClickable(CustID));
		boolean flag= CustID.isDisplayed();
		
		if(flag==true)
	 {
			System.out.println("CustID is generated");
	 }
		else
		{
			throw new NullPointerException("no customer ID generated");
		}
	 
	 
	 }
	 
	 
	 public String getCustomerID()
	 {
		String CustIDval=CusIDval.getText();
		return CustIDval;
	 }
	 

	}


