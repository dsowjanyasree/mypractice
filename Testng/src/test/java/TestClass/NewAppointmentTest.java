package TestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.NewAppointmentPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class NewAppointmentTest extends BaseClass {
	
	@DataProvider(name="bookAppointment")
	public Object [ ][] method()
	{
		return new Object [][]
				
				{
				{"06/04/2026","This booking is for physician"},
				
				{"09/04/2026", "This booking is for Nephrologist"}
			
				};
	}
	
	
	@Test(dataProvider="bookAppointment",retryAnalyzer=utilities.RetryAnalyser.class)
	public static void createAppointment(String date,String comment) throws InterruptedException
	{
		LoginTest.executeLogin();
		//scrollDown();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(NewAppointmentPage.facility());
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		driver.findElement(NewAppointmentPage.visitDate()).sendKeys(date);
		 keyBoardActionTab();
		//driver.findElement(NewAppointmentPage.formGroup()).click();
		driver.findElement(NewAppointmentPage.comment()).sendKeys(comment);
		driver.findElement(NewAppointmentPage.submitBtn()).click();
		Thread.sleep(2000);
		scrollDown();
		boolean flag1=driver.findElement(NewAppointmentPage.validatemesg()).isDisplayed();
		boolean flag2=driver.findElement(NewAppointmentPage.validatebookedmesg()).isDisplayed();
		
		if(flag1 && flag2==true)
		{
			System.out.println("Appointment created and confirmed");
		}

		
		
		
		
	}
	
	

}
