package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L17_S6_MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Jan 7th
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES"));
	
		
		
		
	}

}
