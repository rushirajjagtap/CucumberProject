package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static String browserName;
	public static WebDriver driver;

	public static WebDriver initializeDriver() 
	{
		try 
		{
			browserName = FetchDataFromProperty.getDataFromProperty().getProperty("browser");

		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
						e.printStackTrace();

		}
		
		
		if (browserName.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		try
		{
			driver.get(FetchDataFromExcel.getDatafromExcel(1, 0));
			
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		if (browserName.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		try
		{
			driver.get(FetchDataFromExcel.getDatafromExcel(1, 0));
			
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		if (browserName.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		try
		{
			driver.get(FetchDataFromExcel.getDatafromExcel(1, 0));
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

		



public static void scrollDown(WebElement element)
{
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
  

}
public static void scrollclick(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].click();", element);
}


public static void addExplicitWait() {

}
public static String getTitle() {
String title=driver.getTitle();
return title;
}
public static void switchWindow() {


}
public static void closebrowse() {
driver.quit();
}
public static String  gettextalert() {
String gettex=driver.switchTo().alert().getText();
System.out.println(gettex);
return gettex;


}
public static void getccept() {
driver.switchTo().alert().accept();

}
public void implicitewait() {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

public static void waitForElementClickable(WebElement element) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(element));
   
}

	}

