package qsp15.DDF;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeValidLogIn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("http://127.0.0.1/login.do");
		
		//accessing the generic reusable  non static method by creating the object
		Flib flib=new Flib();
		
		//read the username
		String username=flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		//read the password
		String password=flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		
		//login operation
		dr.findElement(By.name("username")).sendKeys(username);
	    dr.findElement(By.name("pwd")).sendKeys(password);
		dr.findElement(By.id("loginButton")).click();
	}

}
