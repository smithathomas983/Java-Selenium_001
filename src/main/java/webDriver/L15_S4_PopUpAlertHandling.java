package webDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L15_S4_PopUpAlertHandling {
	
	//Jan 3rd
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).submit();
		
		Alert alert=driver.switchTo().alert();
		
		String alertText= alert.getText();
		String al="Please enter a valid user name";
		
		if(al.equalsIgnoreCase(alertText)) {
			System.out.println("Correct Alert message");
			alert.accept();
		}else {
			System.out.println("Incorrect Alert message");
		}
		
		driver.close();
	}

}
