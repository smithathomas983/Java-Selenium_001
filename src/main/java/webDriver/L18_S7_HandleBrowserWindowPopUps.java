package webDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L18_S7_HandleBrowserWindowPopUps {

	public static void main(String[] args) {
		//jan 8th
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String>windowSet=driver.getWindowHandles();
		Iterator<String> it=windowSet.iterator();
		
		System.out.println(driver.getTitle());
		
		String parentWindowID=it.next();
		System.out.println("Parent Window Id is "+parentWindowID);
		System.out.println(driver.getTitle());
		
		String childWindowID=it.next();
		driver.switchTo().window(childWindowID);
		System.out.println("Child window id is:"+ childWindowID);
		System.out.println(driver.getTitle());
		driver.close();//Session Id is not null
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Window Id is "+parentWindowID);
		System.out.println(driver.getTitle());
		
		driver.quit();//Session Id is null
		

	}

}
