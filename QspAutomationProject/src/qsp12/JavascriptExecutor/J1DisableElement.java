//ElementNotInteractableException//
package qsp12.JavascriptExecutor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class J1DisableElement {
			
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("D:\\@Qspider\\WCSM7\\QspAutomationProject\\WebElement\\disabledTextBox.html");
					
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i1').value='admin'");
			
		//driver.findElement(By.id("i2")).sendKeys("manager");		
	}

}
