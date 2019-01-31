package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L12_S1_WebDriverBasics {

	public static void main(String[] args) {

		// Dec 27th

		// launching chrome driver
		System.setProperty("WebDriver.Chrome.driver", "C://selenium/chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		//Enter url
		driver.get("https://www.google.com/");
		
		
		//get the title
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+ title);
		
		//Validation of the title
		if(title.equals("Google")) {
			System.out.println("TC Pass==Correct title");
		}else {
			System.out.println("TC Fail===Incorrect title");
		}

		
		//close the browser
		driver.close();
	}
}
