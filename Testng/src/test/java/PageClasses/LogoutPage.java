package PageClasses;

import org.openqa.selenium.By;

public class LogoutPage
 {
	
	public static By hamburgerMenu()
	{
		return  By.xpath("//*[@id='menu-toggle']");
	}
	
	public static By LogOut()
	{
		return  By.xpath("//a[text()='Logout']");
	}
	public static By homeIcon()
	{
		return  By.xpath("//a[text()='Home']");
	}
	
	public static By loginIcon()
	{
		return  By.xpath("//a[text()='Login']");
	}
	
	
	
	

}
