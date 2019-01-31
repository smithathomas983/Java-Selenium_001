package webDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L17_S6_RightClick {

	public static void main(String[] args) {
		// Jan7th

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build()
				.perform();
		
		action.click(driver.findElement(By.className("context-menu-icon-copy"))).build().perform();
		String s="clicked: copy";
		
		Alert alert= driver.switchTo().alert();
		if(alert.getText().equals(s)) {
			System.out.println("Copy pass");
			alert.accept();
		}
		else {
			System.out.println("Copy Fail");
		}
		

	}

}
