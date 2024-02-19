package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkinWithDependensOnGroup {
	
	@Test(groups = "cabs")
	public void ola() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://partners.olacabs.com/public/login");
		driver.quit();
	}
	@Test(groups = "cabs")
	public void uber() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/global/en/sign-in/");
		driver.quit();
	}
	@Test(groups = "cabs")
	public void rapido() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapido.bike/");
		driver.quit();
	}

}
