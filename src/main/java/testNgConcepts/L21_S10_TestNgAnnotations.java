package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L21_S10_TestNgAnnotations {
	// jan 14th
	@BeforeSuite
	public void lunchBrowser() {
		System.out.println("Before Suite...launch Obrowser");
	}

	@BeforeTest
	public void deleteAllCookies() {
		System.out.println("Before test... delate all cookies");
	}

	@BeforeClass
	public void launchUrl() {
		System.out.println("Before class a... launch url");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Before method ....login");
	}
	@BeforeMethod
	public void login_2() {
		System.out.println("Before method2 ....login");
	}

	@Test
	public void homePageHeader_Test() {
		System.out.println("Test.....homePageHeaderTest");
	}

	@Test
	public void homePageUserInfo_Test() {
		System.out.println("Test...home Page user info");
	}

	@Test
	public void homePageTitle_Test() {
		System.out.println("Test...homepage title test");
	}
	
	@ AfterMethod
	public void logout() {
		System.out.println(" AfterMethod...logout");
	}
	@AfterClass
	public void deleteUser() {
		System.out.println("After class...delete user");
	}
	@AfterTest
	public void closeBDConnection() {
		System.out.println("After test....close BD connection");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("After suite ...close browser");
	}
}

