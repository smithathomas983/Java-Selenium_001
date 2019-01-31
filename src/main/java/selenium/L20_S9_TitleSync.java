package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L20_S9_TitleSync {
	
		public static WebDriver driver;

		public static void main(String[] args) {
			// Jan 10th

			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			String url = "https://app.hubspot.com/login";
			By selector1=By.id("username");
			By selector2= By.id("password");
			By buttonS= By.id("loginBtn");
			By reports=By.id("nav-primary-reports-branch");
			By dashBoard=By.linkText("Dashboards");
			By salesName=By.className("private-page__title");
			String userN= "smithathomas983@gmail.com";
			String pwd="Test@123";
			
			new L19_S8_ElementAction(driver);
			L19_S8_ElementAction.launchUrl(url);
			
		System.out.println(	L19_S8_ElementAction.getPageTitle());

			L19_S8_ElementAction.sendKeysElement(selector1, userN);
			L19_S8_ElementAction.sendKeysElement(selector2, pwd);
			
			L19_S8_ElementAction.clickElement(buttonS);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(reports));
			L19_S8_ElementAction.clickElement(reports);
			wait.until(ExpectedConditions.elementToBeClickable(dashBoard));
			L19_S8_ElementAction.clickElement(dashBoard);
			
			
			wait.until(ExpectedConditions.titleIs("Reports dashboard"));
					System.out.println(	L19_S8_ElementAction.getPageTitle());
					wait.until(ExpectedConditions.textToBe(salesName, "Sales Dashboard"));
					WebElement element = L19_S8_ElementAction.getElement(salesName);
					
					if (element.getText().equals("Sales Dashboard")) {
						System.out.println("Tc Pass");
					} else {
						System.out.println("tc Fail");
					}
}}
