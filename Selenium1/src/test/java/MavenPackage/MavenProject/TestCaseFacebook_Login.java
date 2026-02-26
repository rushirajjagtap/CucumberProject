package MavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseFacebook_Login 
{
	WebDriver driver;
	@Test
	public void withValidCredentials()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.username_valid();
		loginpage.password_valid();
		loginpage.looginbutton();
	}

}
