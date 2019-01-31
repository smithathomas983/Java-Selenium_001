package testNgConcepts;

import org.testng.annotations.Test;

public class L21_S10_DependsOnMethods {

	// Jan 14th
	// dependsOn Methods is used if one test depends on another test
	@Test
	public void login_Test() {
		int j = 10 / 0;
		System.out.println(j);
		System.out.println("Test.....login");
	}

	@Test(dependsOnMethods = "login_Test")
	public void homePage_Test() {
		System.out.println("Test...home Page ");
	}

	@Test
	public void homePageTitle_Test() {
		System.out.println("Test...homepage title test");
	}

}
