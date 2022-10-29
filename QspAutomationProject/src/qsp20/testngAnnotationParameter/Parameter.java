package qsp20.testngAnnotationParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	@Test
	@Parameters({"browserValue", "url1", "url2", "username","password",})
	public void login(String browserValue, String url1, String url2, String username, String password ) {
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url1);
		}
		
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url2);	
		}
		//login operation
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();


	}
		

}
