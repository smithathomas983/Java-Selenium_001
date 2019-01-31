package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L14_S3_Locators {

	// Jan 2nd
	public static void main(String[] args) throws InterruptedException {
		
		
		// System.setProperty("WebDriver.Chrome.driver","C://selenium//chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login/");

		Thread.sleep(3000);

		//1. id 
		WebElement usern = driver.findElement(By.id("username"));
		usern.sendKeys("Smitha123");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crm123");

		driver.findElement(By.id("loginBtn")).click();

		
		//2. name
		
		//3.Xpath
		driver.findElement(By.xpath("//*[@id='username']")).clear();
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Smitha123");
		
		
		//4.CSS
		driver.findElement(By.cssSelector("#username")).sendKeys("123");
		
		//5.Link Text
		driver.findElement(By.linkText("Sign up")).click();
		
		//6.Partial link test
		driver.findElement(By.partialLinkText("Sign")).click();
		//driver.findElement(By.partialLinkText("Sign in")).click();
		
		//7.ClassName
		Thread.sleep(3000);
		
		driver.findElement(By.className("login-email")).sendKeys("Neha");
	}
}
