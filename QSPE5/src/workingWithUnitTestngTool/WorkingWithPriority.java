package workingWithUnitTestngTool;

import org.testng.annotations.Test;

public class WorkingWithPriority {
//default value priority=0
//give positive value
//give negative value
	
	final int a=2;
	@Test(priority =a )
	public void register() {
		System.out.println("User is able to register");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("User is able to login");
	}

	@Test(priority = 2)
	public void search() {
		System.out.println("User is able to search product");
	}

	@Test(priority = 3)
	public void wishlist() {
		System.out.println("User is able to add product to wishlist");
	}

	@Test(priority =4 )
	public void cart() {
		System.out.println("User is able to add produt to cart");
	}

	@Test(priority = -6)
	public void logout() {
		System.out.println("User is able to logout");
	}
}
