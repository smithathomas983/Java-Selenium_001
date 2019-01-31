package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L17_S6_DragAndDrop {

	// Jan 7th

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		Actions action = new Actions(driver);

		List<WebElement> listFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(listFrame.size());
		for (int i = 0; i < listFrame.size(); i++) {
			driver.switchTo().frame(i);
		}

		WebElement target = driver.findElement(By.id("draggable"));
		WebElement source = driver.findElement(By.id("droppable"));

		// action.clickAndHold(target).moveToElement(source).release().build().perform();

		action.dragAndDrop(source, target).build().perform();
		
		driver.close();
	

	}
}