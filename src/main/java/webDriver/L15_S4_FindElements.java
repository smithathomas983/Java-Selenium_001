package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L15_S4_FindElements {
	public static void main(String[] args) {
		//Jan 3rd

		// to find the total number of  links in the page
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://facebook.com");		
		List<WebElement> tagNames=driver.findElements(By.tagName("a"));		
		System.out.println("Total number of  links= "+ tagNames.size());
		
		for(int i=0; i<tagNames.size();i++) {			
			System.out.println(tagNames.get(i).getText());
		}
	}		

}
