package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L23_S13_CustomXpath {
	static boolean s;

	public static void main(String[] args) {
		// Jan18th
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
				.sendKeys("smithathomas983@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@id='loginBtn' and @type='submit']")).click();
		
		
	
		
	}

}
