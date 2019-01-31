package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L16_S5_DropDownListSize {
	// Jan 4th
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));

		Select daySelect = new Select(day);
		List<WebElement> dayList = daySelect.getOptions();
		int totalDays = dayList.size() - 1;

		// to print total list size
		System.out.println("Days listed: " + totalDays);

		// to print all the values
		for (int i = 1; i < dayList.size(); i++) {

			String dayValue = dayList.get(i).getText();
			System.out.println(dayValue);
		}

		// to print a particular value from the list
		String value="15";
		for (int i = 1; i < dayList.size(); i++) {

			String dayValue = dayList.get(i).getText();
			if (dayValue.equals(value)) {
				dayList.get(i).click();
				break;
			}
		}

	}

}
