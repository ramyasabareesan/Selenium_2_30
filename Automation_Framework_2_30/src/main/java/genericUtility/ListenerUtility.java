package genericUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerUtility extends Baseclass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			wUtil.getPhoto(driver);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	

	
		
	}


