package webDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L25_S14_WebTableHandle {
	// Jan22
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		String xpath_rowCount = "//table[@id='customers']//tr";
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_Customer = "]/td[1]";
		String afterXpath_Contact = "]/td[2]";
		String afterXpath_Country = "]/td[3]";

		L25_S14_WebTableHandle obj = new L25_S14_WebTableHandle();

		int rowCount = obj.tableCount(driver, xpath_rowCount);
		System.out.println("Total rows: " + rowCount);

		ArrayList<String> rowData1 = obj.getValuesFromRow(driver, beforeXpath, afterXpath_Customer, xpath_rowCount);
		ArrayList<String> rowData2 = obj.getValuesFromRow(driver, beforeXpath, afterXpath_Contact, xpath_rowCount);
		ArrayList<String> rowData3 = obj.getValuesFromRow(driver, beforeXpath, afterXpath_Country, xpath_rowCount);

		// *[@id="customers"]/tbody/tr[1]/th[1]
		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[6]/td[1]

		System.out.println("Customer list: " + rowData1);
		System.out.println("Contact list: " + rowData2);
		System.out.println("Country list: " + rowData3);
		driver.quit();

	}

	public int tableCount(WebDriver driver, String xpath) {
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		int count = list.size();
		return count;
	}

	public ArrayList<String> getValuesFromRow(WebDriver driver, String beforeXpath, String afterXpath,
			String row_Count) {
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 2; i < tableCount(driver, row_Count); i++) {
			String rowXpath = beforeXpath + i + afterXpath;

			String value = driver.findElement(By.xpath(rowXpath)).getText();
			ar.add(value);
		}
		return ar;

	}

}
