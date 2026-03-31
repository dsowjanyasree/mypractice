package PageClasses;

import org.openqa.selenium.By;

public class NewAppointmentPage {
	
	
	public static By facility()
	{
		return By.xpath("//*[@id='combo_facility']");
	}
	public static By visitDate()
	{
		return By.xpath("//*[@id='txt_visit_date']");
	}
	
	
	public static By formGroup()
	{
		return By.xpath("//*[@class='form-group'][2]");
	}
	
public static By comment()
{
	return By.xpath("//*[@id='txt_comment']");
	
}
public static By submitBtn()
{
	return By.xpath("//*[@id='btn-book-appointment']");
	
}

public static By validatemesg()
{
	return By.xpath("//*[text()='Appointment Confirmation']");
}
	
public static By validatebookedmesg()
{
	return By.xpath("//*[text()='Please be informed that your appointment has been booked as following:']");
}
	
}
