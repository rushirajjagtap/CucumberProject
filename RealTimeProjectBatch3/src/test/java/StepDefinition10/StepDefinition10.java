package StepDefinition10;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import PageFactory.CustomerPage;
import PageFactory.FundTransferPage;
import PageFactory.LogOutPage;
import PageFactory.LoginPage;
import PageFactory.NewaccountPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class StepDefinition10 extends BaseClass
{
WebDriver driver=BaseClass.initializeDriver();  //we should have only one driver so need to equate this driver with base class driver//
	
	LoginPage obj= new LoginPage(driver);//creating the object of login page//
	
	CustomerPage obj1=new CustomerPage(driver);
	
	NewaccountPage obj2=new NewaccountPage(driver);
	
	FundTransferPage obj3=new FundTransferPage(driver);
	 
	LogOutPage obj4=new LogOutPage(driver);
	
	
	@Given("user on login page")
	public void user_on_login_page() 
	{
        String loginTitle= getTitle();
		
		System.out.println(loginTitle);
		
		if(loginTitle.contains("Guru99 Bank"))
		{
			System.out.println("user is on the login page");
		}
		else
		{
			throw new NullPointerException("Incorrect page Opened");
		}
		  
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String userName) 
	{
		obj.enterUserName(userName);
		
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	    obj.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    obj.clickLogin();
	}

	@Then("validate user should be on homepage")
	public void validate_user_should_be_on_homepage() {
        String homePageTitle=getTitle();
		 
		
		System.out.println(homePageTitle);
	}
	
	
	
	
	@Given("user opens the  Loginpage of the application")
	public void user_opens_the_loginpage_of_the_application() {
	    
	}

	@Then("validate user will be navigated to homepage")
	public void validate_user_will_be_navigated_to_homepage() {
	    
	}

	@Then("user clicks on the new customer link")
	public void user_clicks_on_the_new_customer_link() {
	    obj1.clickonNewCustomer();
	}

	@Then("user enters the customername as {string}")
	public void user_enters_the_customername_as(String customerName) {
	   obj1.enterCustomerName(customerName);
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
	    obj1.selectGender();
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String doB) {
	    obj1.enterDob(doB);
	}

	@Then("user enters the address as {string}")
	public void user_enters_the_address_as(String address) {
	    obj1.enterAddress(address);
	}

	@Then("user enters the city as {string}")
	public void user_enters_the_city_as(String city) {
	    obj1.enterCityName(city);
	}

	@Then("user enters the state as {string}")
	public void user_enters_the_state_as(String state) {
	    obj1.enterStateName(state);
	}

	@Then("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pin) {
	    obj1.enterPin(pin);
	}

	@Then("user enters the mobileNumber as {string}")
	public void user_enters_the_mobile_number_as(String mobileNumber) {
	    obj1.enterMobile_num(mobileNumber);
	}

	@Then("user enters the email")
	public void user_enters_the_email() {
	    obj1.enterEmail();
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	    obj1.clickSubmit_Button();;
	}

	@Then("new customer is created")
	public void new_customer_is_created() {
	    obj1.validateCustIDGeneration();
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() 
	{
		String customerID=obj1.getCustomerID();
		System.out.println("The customer ID generated is "+customerID);
	}

	
	

	@Then("user clicks on the new account link")
	public void user_clicks_on_the_new_account_link() {
	    obj1.clickonNewCustomer();
	}

	@Then("user enters the customerid as {string}")
	public void user_enters_the_customerid_as(io.cucumber.datatable.DataTable userdata) {
		List<List<String>> data=userdata.asLists(String.class);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tam");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("06-08-1992");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Satara");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Karad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("560037");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("6302765485");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("xyz123859@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
	   
	}

	@Then("user enters the AccountType as {string}")
	public void user_enters_the_account_type_as(String AccountType) {
		obj2.enterAccountType(AccountType);
	}

	@Then("user enters the initial deposit as {string}")
	public void user_enters_the_initial_deposit_as(String customerid) {
		obj2.enterCustomerid(customerid);
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		obj2.clicksubmit();
	}

	@Then("validate user will be navigated to getting created account details")
	public void validate_user_will_be_navigated_to_getting_created_account_details() {
		obj2.validateAccountGeneration();
	}

	
	

	@Then("user clicks on Fund Transfer link")
	public void user_clicks_on_fund_transfer_link() {
		obj3.clickonFundTransfer();
	}

	@Then("user enters the Payers account no as {string}")
	public void user_enters_the_payers_account_no_as(String Payersaccountno) {
		obj3.EnterPayersId(Payersaccountno);
	}

	@Then("user enters the Payees account no as {string}")
	public void user_enters_the_payees_account_no_as(String Payeesaccountno) {
		obj3.EnterPayeesId(Payeesaccountno );
	}

	@Then("user enters the Amount as {string}")
	public void user_enters_the_amount_as(String Amount) {
		obj3.EnterAmount(Amount);
	}

	@Then("user enters the Description as {string}")
	public void user_enters_the_description_as(String Description) {
		obj3.EnterDescription(Description);
	}

	@When("user clicks on submit button1")
	public void user_clicks_on_submit_button1() {
		obj3.clickonsubmit();
	}

	@Then("validate user will be navigated to Fund Transfer Details page")
	public void validate_user_will_be_navigated_to_fund_transfer_details_page() {
		obj3.validateFundTransferDetailsPage();
	}

	@Then("user clicks on log out link")
	public void user_clicks_on_log_out_link() {
		obj4.clickonLogout();

	}


	@Then("user clicks on Log out button")
	public void user_clicks_on_log_out_button() {
	    obj4.clickonLogout();
	}
	
	


}
