package testNgConcepts;

import org.testng.annotations.Test;

public class L21_S10_PriorityConcept {
	//Jan14th
	//priority given to the lowest  number
	
	@Test(priority=1)
	public void homePageHeader_Test() {
		System.out.println("Test.....homePageHeaderTest");
	}

	@Test(priority=1 )
	public void homePageUserInfo_Test() {
		System.out.println("Test...home Page user info");
	}

	@Test(priority=9)
	public void homePageTitle_Test() {
		System.out.println("Test...homepage title test");
	}

}
