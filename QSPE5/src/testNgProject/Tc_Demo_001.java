package testNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Tc_Demo_001 extends BaseClass {

	@Test
	public void validateThatUserIsAbleToClickOnWishlist() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(3000);
		Reporter.log("User is able to click on wishList link", true);
		
	}

}
