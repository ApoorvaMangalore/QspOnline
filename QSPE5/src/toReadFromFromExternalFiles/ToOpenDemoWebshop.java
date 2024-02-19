package toReadFromFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemoWebshop {

	public static void main(String[] args) throws IOException {
		// Step1:create obj for File
		File file = new File("./testData/data.properties");

		// step2:create obj for fis
		FileInputStream fis = new FileInputStream(file);

		// step3:Create obj for which file your working
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));

	}

}
