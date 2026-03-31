package PageClasses;

import org.openqa.selenium.By;

public class BookedappointmentsPage {
	
	public static By hamburgerMenu()
	{
		return  By.xpath("//*[@id='menu-toggle']");
	}
	
	public static By history()
	{
		return By.xpath("//*[text()='History']");
	}
	
	public static By panelCounts()
	{
		return By.xpath("//*[@class='panel-heading']");
	}
	
	
	
	
	

}
