package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	public WebDriver driver;
	String emailId = "er.pallavi207@gmail.com";
	String password = "Password@123";

	@BeforeSuite
	public void dataBaseStart() {
		Reporter.log("Data base connection started", true);
		Reporter.log("Extent Report formation start", true);
	}

	@AfterSuite
	public void dataBaseStoped() {
		Reporter.log("DataBase connection is stoped", true);
		Reporter.log("Extent Report formation end", true);
	}

//BeforeClass
	@BeforeTest
	public void browserSetUp() throws InterruptedException {

		driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser");
		
        driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open DemoWebShop", true);
		Thread.sleep(3000);
	}

//@AfterClass
	@AfterTest()
	public void tearDownBrowser() {
		driver.quit();
		Reporter.log("User is able to quit the demowebshop", true);
	}

	@BeforeMethod()
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("User is able to login for demowebshop", true);
		Thread.sleep(3000);
	}

	@AfterMethod()
	public void louOut() throws InterruptedException {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User is able to logout from demowebshop", true);
		Thread.sleep(3000);
	}
}
