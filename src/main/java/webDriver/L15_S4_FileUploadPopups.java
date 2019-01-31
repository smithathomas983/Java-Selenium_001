package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L15_S4_FileUploadPopups {
	public static void main(String[] args) {
		// Jan 3rd

		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		driver.findElement(By.name("upfile")).sendKeys("C:/Users/Balu/Desktop/main F/kids study/5th grade/homeworks");;

	}

}
