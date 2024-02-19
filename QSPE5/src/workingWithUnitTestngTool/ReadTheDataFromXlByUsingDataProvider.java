package workingWithUnitTestngTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadTheDataFromXlByUsingDataProvider {
	@DataProvider
	public String[][] registerData() throws Exception, IOException {

		// Step1:Create obeject for file and give the path of file
		File file = new File("./testData/testdata.xlsx");
		// step2:Create object for fileInputstream
		FileInputStream fis = new FileInputStream(file);
		// step3:To pint xl file
		Workbook ref = WorkbookFactory.create(fis);
		// step4:To get num of rows
		int numOfRows = ref.getSheet("regdata").getPhysicalNumberOfRows();
		// step5:To get num of clm
		int numOfclm = ref.getSheet("regdata").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numOfRows);
		System.out.println(numOfclm);

		// put in to array format and loop it
		String[][] data = new String[numOfRows][numOfclm];
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfclm; j++) {
				data[i][j] = ref.getSheet("regdata").getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

	@Test(dataProvider = "registerData")
	public void registerUser(String[] dataToReg) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		if (dataToReg[0].equalsIgnoreCase("female")) {
			driver.findElement(By.id("gender-female")).click();
		} else {
			driver.findElement(By.id("gender-male")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(dataToReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataToReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataToReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataToReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataToReg[5]);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
