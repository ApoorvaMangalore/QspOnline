package testNgProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadPropFile {

	
	@Test
	public void lunchDemoweb() throws IOException {
		WebDriver driver=new ChromeDriver();
		UtilityMethods u=new UtilityMethods();
		driver.get(u.readingDataFromPropertyFile("./testData/data.properties", "url"));
		driver.manage().window().maximize();
		driver.quit();
		
	}
}
