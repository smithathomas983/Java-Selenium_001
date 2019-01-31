package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L25_S14_ElementPresence {

	// Jan 21st
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");

		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
		
		boolean check=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("check box selection: "+check);
		driver.findElement(By.name("agreeTerms")).click();
		check=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("check box selection: "+check);
		
		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);
		
		driver.close();
		
	

	}

}
