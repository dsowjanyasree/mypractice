package TestClass;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class LoginTest extends BaseClass {

	@Test(priority=0,retryAnalyzer=utilities.RetryAnalyser.class,groups="sanity")
	public static void executeLogin() throws InterruptedException
	{
		
		driver.findElement(LoginPage.hamburgerMenu()).click();
		driver.findElement(LoginPage.LoginButton()).click();
		
		

		driver.findElement(LoginPage.userName()).sendKeys("John Doe");
		driver.findElement(LoginPage.passWord()).sendKeys("ThisIsNotAPassword");
		driver.findElement(LoginPage.loginSubmit()).click();
		Thread.sleep(5000);
		
		
		
		
		
		//closeWindow();
		
	}
	
	
	
}