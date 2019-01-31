package testNgConcepts;

import org.testng.annotations.Test;

public class L21_S10_Enable {

	//Jan14th
	// this is to make a test case disable without deleting or commenting the code
	//by default enable =true
	
	
	@Test(priority=1)
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
