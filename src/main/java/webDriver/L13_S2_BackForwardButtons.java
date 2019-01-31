package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L13_S2_BackForwardButtons {
	public static void main(String[] args) throws InterruptedException {
		
		//Jan 1st
		
	System.setProperty("WebDriver.Chrome.driver", "C://selenium/chromedriver_win32");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	
	//driver.manage().window().maximize();

	String url=driver.getCurrentUrl();
	System.out.println("Current url: "+url);
	
	

	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	
	
	driver.navigate().back();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	
	// to  maximize a window
	driver.manage().window().maximize();

}}
