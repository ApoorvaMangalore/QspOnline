package testNgProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromRow {
	@Test
	public void login() throws IOException {
		WebDriver driver = new ChromeDriver();
		UtilityMethods u = new UtilityMethods();
		driver.get(u.readingDataFromPropertyFile("./testData/data.properties", "loginurl"));
		driver.manage().window().maximize();

		
		//String emailId = u.readingSingleDataFromExcelFile("./testData/testdata.xlsx", "loginData", 0, 1);
		String[] loginData = u.readingRowOfDataFromExcelFile("./testData/testdata.xlsx", "loginData1", 0);
		driver.findElement(By.id("Email")).sendKeys(loginData[0]);
		driver.findElement(By.id("Password")).sendKeys(loginData[1]);
		//driver.quit();
	}
}
