package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L18_S7_AuthenticationPopUps {

	public static void main(String[] args) {
		//Jan 8th
		 WebDriver driver= new ChromeDriver();
		 
		 String userN= "admin";
		 String pwd="admin";
		 
		 driver.get("https://"+userN+":"+pwd+"@the-internet.herokuapp.com/basic_auth");

		 
	}

}
