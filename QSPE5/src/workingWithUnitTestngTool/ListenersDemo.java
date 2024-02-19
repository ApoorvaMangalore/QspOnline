
package workingWithUnitTestngTool;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " Test Case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " Test excecution is completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " Test case is fail");
		TakesScreenshot ts = (TakesScreenshot) DemoLogin.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/webpage.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }

		}

	}
}
