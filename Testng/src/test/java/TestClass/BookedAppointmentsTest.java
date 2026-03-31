package TestClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.BookedappointmentsPage;
import junit.framework.Assert;
import utilities.BaseClass;
import utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)

public class BookedAppointmentsTest extends BaseClass{
	
	
	@Test(priority=0,retryAnalyzer=utilities.RetryAnalyser.class)
	public void validateAppointments() throws InterruptedException
	{
		
		NewAppointmentTest.createAppointment("06/04/2026","This booking is for physician");
		driver.findElement(BookedappointmentsPage.hamburgerMenu()).click();
		driver.findElement(BookedappointmentsPage.history()).click();
	     List<WebElement>li=driver.findElements(BookedappointmentsPage.panelCounts());
	
	      int x=li.size();
	      
	      Assert.assertEquals(1,x);
	      
	      System.out.println("Appointments confirmed and displaying in the application");
		
		
	}
	

}
