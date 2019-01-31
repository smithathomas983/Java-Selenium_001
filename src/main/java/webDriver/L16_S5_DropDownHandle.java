package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L16_S5_DropDownHandle {

	
	//Jan 4th
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String dob="2-Jun-1985";
		String dobArray[]=dob.split("-");
		
		

		WebElement month=driver.findElement(By.id("month"));
		WebElement day=driver.findElement(By.id("day"));
		WebElement year=driver.findElement(By.id("year"));
	
		
		selectValueFromDropDown(month,dobArray[1]);
		selectValueFromDropDown(day,dobArray[0]);
		 selectValueFromDropDown(year,dobArray[2]);
		
	}

	public static void selectValueFromDropDown(WebElement e,String s) {
	
	Select select= new Select(e);
	select.selectByVisibleText(s);
	}
	
	
}
