package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L24_S13_HeadlessChrome {
//Jan18th
	
	public static void main(String[] args) {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://app.hubspot.com/login");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
