package testNgProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleData {

	@Test(dataProvider = "appu")
	public void login(String un,String password) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		UtilityMethods u = new UtilityMethods();
		driver.get(u.readingDataFromPropertyFile("./testData/data.properties", "loginurl"));
		driver.manage().window().maximize();

//		String[][] sheet = u.readingDataFromMultipleRowColumn("./testData/testdata.xlsx", "Sheet1");
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(password);
	    driver.quit();
	}
	
	@DataProvider(name="appu")
	public String[][] dataSupply() throws EncryptedDocumentException, IOException
	{
		return UtilityMethods.readingDataFromMultipleRowColumn("./testData/testdata.xlsx", "Sheet1");
	}
}
