package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L16_S5_DropDownWithOutSelect {
	static WebDriver driver;

	public static void main(String[] args) {

		// jan 4th
		driver = new ChromeDriver();
		String xpath = "//select[@id='month']//option";

		driver.get("https://www.facebook.com/");
		List<WebElement> year = driver.findElements(By.xpath(xpath));
		System.out.println("Total list: " + (year.size() - 1));
		System.out.println("==============");
		dropDownList(xpath, "Jun");

		driver.close();
	}

	public static void dropDownList(String xpath, String value) {
		List<WebElement> year = driver.findElements(By.xpath(xpath));
		System.out.println("Total list: " + (year.size() - 1));
		System.out.println("==============");
		for (int i = 1; i < year.size(); i++) {
			System.out.println(year.get(i).getText());
			if (year.get(i).getText().equals(value)) {
				year.get(i).click();
				break;
			}

		}

	}
}
