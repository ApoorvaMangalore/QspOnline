package simpleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Validate that user is able to loin for the  demowebshop:
public class Tc_login_001 {// testcase ID

	public static void main(String[] args) {

		String actualHomePageUrl = "https://demowebshop.tricentis.com/";
		String actualLoginUrl = "https://demowebshop.tricentis.com/login";
		String actualtitleofthePage = "Demo Web Shop";
		String tileforLoginLink = "";
		String actualEmail = "";
		String mobileNum="098776544433";
		boolean checkboxvalidation = true;

		// Step1:Open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("User is able to open the empty browser");
		driver.manage().window().maximize();
		System.out.println("User is able to maximize the screen");

		// Step2:Enter the url
		driver.get("https://demowebshop.tricentis.com/");
		String urloftheapp = driver.getCurrentUrl();
		System.out.println(urloftheapp);
		String tileOfthepage = driver.getTitle();
		System.out.println(tileOfthepage);

		if (actualHomePageUrl.equals(urloftheapp)) {
			System.out.println("User is able to open demowebshop");
		} else {
			System.out.println("User is not able to open demo webshop");
		}
		if (actualtitleofthePage.equals(tileOfthepage)) {
			System.out.println("Title of the page is correct");
		} else {
			System.out.println("Title of the page is not correct");
		}

		// Step 3:validate that user is able to click on login link
		driver.findElement(By.linkText("Log in")).click();
		String urlOfthelogin = driver.getCurrentUrl();
		System.out.println(urlOfthelogin);
		String title = driver.getTitle();
		if (actualLoginUrl.equals(urlOfthelogin)) {
			System.out.println("user is able to click on login link");

		} else {
			System.out.println("user is not able to click on login Link");
		}
		if (tileforLoginLink.equals(title)) {
			System.out.println("correct title");
		} else {
			System.out.print("title is not according to req");
		}

		// step:4 enter valid data for emailId
		WebElement emailTextbox = driver.findElement(By.id("Email"));
		emailTextbox.sendKeys("apoorva");
		String dataemailID = emailTextbox.getAttribute("id");
		System.out.println(dataemailID);
		if (actualEmail.equals(dataemailID)) {
			System.out.println("User is able to enter valid data for email text box");
		} else {
			System.out.println("User is not able to send valid data for email text box");
		}

		// Step 5:enter valid data for password

		// step 6:User should be able to click on checkbox
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean output = checkBox.isSelected();
		System.out.println(output);
		System.out.println("User is able to click on checkbox" + output);

		// step 7:User is able to click on login button

		// step 8
		driver.quit();
		System.out.print("user is able to close demowebshop");
	}

}
