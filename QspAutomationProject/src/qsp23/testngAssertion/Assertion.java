package qsp23.testngAssertion;
//import from pack ctr+shift+o
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	WebDriver dr;
	@BeforeTest
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://opensource-demo.orangehrmlive.com/");	
	}
	
	@Test
	public void tc1() {
		SoftAssert softAssert=new SoftAssert();
		
		String actLoginPageTitle=dr.getTitle();
		softAssert.assertEquals(actLoginPageTitle, "OrangeHRM");
		
		dr.findElement(By.name("txtUsername")).sendKeys("Admin");
		dr.findElement(By.name("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();
		
		WebElement dashboard=dr.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean status = dashboard.isDisplayed();
		Assert.assertEquals(status, true);
		
		String actHomePageTitle=dr.getTitle();
		softAssert.assertEquals(actHomePageTitle, "OrangeHRMHomePage");
		Reporter.log("createUser",true);
		Reporter.log("createContact",true);
		softAssert.assertAll();
			
	}

}
