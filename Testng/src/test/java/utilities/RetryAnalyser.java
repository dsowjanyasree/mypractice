package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{
	
	private int count=0;
	private static final int maxTry=3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess())
		{
			if(count<maxTry)
			{
				count++;
				return true;
			}
		}
		
		
		
		
		return false;
	}

}
