package TestClass;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import PageClasses.LogoutPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class LogoutTest extends BaseClass{
	
	@Test(retryAnalyzer=utilities.RetryAnalyser.class, groups="sanity")
	public static void validateLogout() throws InterruptedException
	{
		LoginTest.executeLogin();
		driver.findElement(LogoutPage.hamburgerMenu()).click();
		driver.findElement(LogoutPage.LogOut()).click();
		driver.findElement(LogoutPage.hamburgerMenu()).click();
	boolean flag1=driver.findElement(LogoutPage.homeIcon()).isDisplayed();
	boolean flag2=driver.findElement(LogoutPage.loginIcon()).isDisplayed();
	
	if(flag1==true && flag2==true)
	{
		System.out.println("user is logged out");
	}
		
	else
	{
		throw new NoSuchElementException("user is not logged out");
	}
		
		
	}

}
