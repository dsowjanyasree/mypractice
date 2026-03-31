package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import ConstantsData.ConstantsData;
import org.apache.commons.io.FileUtils;

public class ListenerImplementation extends BaseClass implements ITestListener{

	
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		System.out.println("My Test Case started");
		Reporter.log("Test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("My Test Case is successfull");
		Reporter.log("Test case passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case failed");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File desfile=new File(ConstantsData.ScreenShotPath);
		try {
			FileUtils.copyFile(srcfile,desfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("Screenshot captured");
		
		
			}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
	
	
	
	

}
