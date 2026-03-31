package TestClass;
	
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class facebooklogin{
		
		
		@DataProvider(name="login")
		public Object[][]data()
		{
			return new Object[][]
					{
				{"sowjanya.jan@gmail.com","sowji1990"},
				{"dsowjanyasree@gmail.com","Sowjanya@1990"}
					
				     };
					
		}
	
		
		
		@Test(dataProvider="login")
		
		public static void login(String Email,String password)
		{
			WebDriver driver;
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			
			
		}
		
	}
		
	
		





