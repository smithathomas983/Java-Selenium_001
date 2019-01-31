package hubSpotTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class L23_S12_HubSpotLogin_ReadProp {
	// Jan16th
	static WebDriver driver;

	public static void main(String[] args) {

		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"C:/Users/Balu/Desktop/QA/Eclipse/Naveen/SeleniumBasics/src/main/java/hubSpotTests/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String browser = prop.getProperty("browser");
		System.out.println("Browser name: " + browser);

		String url = prop.getProperty("url");
		System.out.println("url is: " + url);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("driver not found");
		}
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageloadtimeout")),
				TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitlywait")),
				TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("loginBtn")).click();

		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("defaultexplicitwait")));
		wait.until(ExpectedConditions.titleContains(L23_S12_Constants.homePageTitle));

		String loginTitle = driver.getTitle();
		System.out.println("LoginTitle: " + loginTitle);
		Assert.assertEquals(L23_S12_Constants.homePageTitle, loginTitle);
		//driver.quit();

	}

}
