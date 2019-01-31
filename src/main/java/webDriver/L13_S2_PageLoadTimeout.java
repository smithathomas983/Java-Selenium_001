package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L13_S2_PageLoadTimeout {

	public static void main(String[] args) {
		
		//Jan 1st
		
		System.setProperty("WebDriver.Chrome.driver", "C://selenium/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
