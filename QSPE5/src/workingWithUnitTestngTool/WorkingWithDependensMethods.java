package workingWithUnitTestngTool;

import org.testng.annotations.Test;

public class WorkingWithDependensMethods {

	@Test
	public void register() {
		System.out.println("User is able to register");
	}
	@Test(dependsOnMethods ="register")
	public void login() {
		System.out.println("User is able to login");
	}
	@Test(dependsOnMethods = "cart")
	public void logout() {
		System.out.println("User is able to logout");
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("User is able to search");
	}
	@Test(dependsOnMethods  = "search")
	public void cart() {
		System.out.println("User is able to add to cart");
	}
}
