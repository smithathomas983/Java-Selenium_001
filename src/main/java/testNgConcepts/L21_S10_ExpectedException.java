package testNgConcepts;

import org.testng.annotations.Test;

public class L21_S10_ExpectedException {
	
	//Jan 14th
	// to pass a test even if an exception is generated during runtime
	@Test
	public void homePageHeader_Test() {
		System.out.println("Test.....homePageHeaderTest");
	}

	@Test
	public void homePageUserInfo_Test() {
		System.out.println("Test...home Page user info");
	}

	@Test(expectedExceptions= ArithmeticException.class)
	public void homePageTitle_Test() {
		int j=10/0;
		System.out.println(j);
		System.out.println("Test...homepage title test");
	}
	

}
