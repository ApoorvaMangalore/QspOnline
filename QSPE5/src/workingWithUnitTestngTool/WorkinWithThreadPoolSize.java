package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkinWithThreadPoolSize {

	
	@Test(invocationCount = 4,threadPoolSize = 4)
	public void toLunchDemoWebShop() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		driver.quit();
	}
}
