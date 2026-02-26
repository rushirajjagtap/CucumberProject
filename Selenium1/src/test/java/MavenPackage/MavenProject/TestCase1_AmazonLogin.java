package MavenPackage.MavenProject;

import org.testng.annotations.Test;

public class TestCase1_AmazonLogin extends BaseClass
{
	@Test
	public void withValidCred() throws InterruptedException
	{
		AmazonHomePage homepage = new AmazonHomePage(driver);
		homepage.hoveroveronAccountAndList(driver);
		homepage.SignInFromHomePage();
		
		AmazonLoginPage loginpage = new AmazonLoginPage(driver);
		loginpage.validUsername();
		loginpage.continueClick();
		loginpage.validPassword();
		loginpage.signClick();
		
		
		
	}

}
