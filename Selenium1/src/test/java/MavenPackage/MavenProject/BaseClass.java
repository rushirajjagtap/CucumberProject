package MavenPackage.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
