package testNgConcepts;

import org.testng.annotations.Test;



public class L21_S10_InvocationCount {

	//Jan14th
	//to run a particular test couple of times
	
	@Test(priority=1,invocationCount=5)
	public void homePageHeader_Test() {
		System.out.println("Test.....homePageHeaderTest");
	}

	@Test(priority=1 ,enabled=false)
	public void homePageUserInfo_Test() {
		System.out.println("Test...home Page user info");
	}

	@Test(priority=9)
	public void homePageTitle_Test() {
		System.out.println("Test...homepage title test");
	}

}
