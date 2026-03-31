package utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
      @BeforeMethod(alwaysRun=true)
	public void launchBrowser() throws IOException
	{

  		ChromeOptions options=new ChromeOptions();
  		options.addArguments("--disable-notifications");
  		options.addArguments("--disable-save-password-bubble");
  		options.addArguments("--disable-password-generation");
  		options.addArguments("--disable-features=PasswordLeakDetection");
  		options.addArguments("--incognito");
    	  
		String broswerName=Fetchdatafromproperty.getDataFromProperty().getProperty("browser");
		String URL=Fetchdatafromproperty.getDataFromProperty().getProperty("url");
		
		if(broswerName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver(options);
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
		
		if(broswerName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
		
		
		if(broswerName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			
		}
		
		}
      
      public static void scrollDown()
      {
    	  JavascriptExecutor js= (JavascriptExecutor)driver;
    	  
    	  js.executeScript("window.scrollBy(0,200)","");
      }
      
      public static void keyBoardActionTab()
      {
    	  Actions act=new Actions(driver);
    	  act.keyDown(Keys.TAB);
      }
      
      
      
      @AfterMethod(alwaysRun=true)
      public void closeWindow()
      {
    	  driver.quit();
      }
	
          
	
}
