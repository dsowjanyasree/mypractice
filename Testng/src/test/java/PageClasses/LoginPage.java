package PageClasses;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By hamburgerMenu()
	{
		return  By.xpath("//*[@id='menu-toggle']");
	}
	public static By LoginButton()
	{
		return  By.xpath("//a[text()='Login']");
	}
	
	public static By userName()
	{
		return  By.xpath("//input[@id='txt-username']");
	}
	
	public static By passWord()
	{
		return  By.xpath("//input[@id='txt-password']");
	}
	
	public static By loginSubmit()
	{
		return  By.xpath("//button[@id='btn-login']");
	}
	
	
	

	
	
	
	
}
