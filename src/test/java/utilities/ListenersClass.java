package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Test.BaseTest;

public class ListenersClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String name=result.getName();
		try {
			ScreenShot.captureScreenShot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
