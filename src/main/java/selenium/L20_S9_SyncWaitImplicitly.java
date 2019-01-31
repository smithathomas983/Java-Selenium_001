package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L20_S9_SyncWaitImplicitly {
	
	public static WebDriver driver;
public static void main(String[] args)  {
	//Jan 10th
	
	
	driver = new ChromeDriver();
	//dynamic wait for loading the browser
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//dynamic wait for webelements
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	String url="https://app.hubspot.com/login";
	By selector1=By.id("username");
	By selector2= By.id("password");
	By buttonS= By.id("loginBtn");
	By reports=By.id("nav-primary-reports-branch");
	By dashBoard=By.linkText("Dashboards");
	By salesName=By.className("private-page__title");
	String userN= "smithathomas983@gmail.com";
	String pwd="Test@123";
	
	//Thread.sleep(10000)...hard or static wait
	 new L19_S8_ElementAction(driver);
	
	L19_S8_ElementAction.launchUrl(url);

	L19_S8_ElementAction.sendKeysElement(selector1, userN);
	L19_S8_ElementAction.sendKeysElement(selector2, pwd);
	
	L19_S8_ElementAction.clickElement(buttonS);


	L19_S8_ElementAction.clickElement(reports);
	L19_S8_ElementAction.clickElement(dashBoard);
	
	
	WebElement element= L19_S8_ElementAction.getElement(salesName);
	if(element.getText().equals("Sales Dashboard")) {
		System.out.println("Tc Pass");
	}else {
		System.out.println("tc Fail");
	}
	driver.close();
	
}
}
