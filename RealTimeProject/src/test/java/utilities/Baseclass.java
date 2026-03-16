package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	static String browserName;
	public static WebDriver driver; 
	
	public static WebDriver initializeDriver() 
	{
		try {
			browserName=Fetchdatafromproperty.getDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get( Fetchdatafromexcelfile.getDataFromExcel(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get( Fetchdatafromexcelfile.getDataFromExcel(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get( Fetchdatafromexcelfile.getDataFromExcel(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
		
		 return driver;
	}
	
	public static void scrollDown()
	{
		
	}
	
	public static void addExplicitWait()
	{
	
	}
	public static String getTitle()
	{
		String Title=driver.getTitle();
		return Title;
		
	}
	public static void switchWindow()
	{
		
	}
	
	
	
}
