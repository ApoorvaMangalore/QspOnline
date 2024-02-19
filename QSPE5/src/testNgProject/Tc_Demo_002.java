package testNgProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_Demo_002 extends BaseClass {

	@Test
	public void validateThatUserIsAbleToClickOnShoppingCart() throws IOException {

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("User is able to click on Shopping cart", true);

		UtilityMethods u = new UtilityMethods();
		String url = u.readingDataFromPropertyFile("./testData/data.properties", "url");
		driver.get(url);

	}
}
