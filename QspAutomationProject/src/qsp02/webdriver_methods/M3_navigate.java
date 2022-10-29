package qsp02.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M3_navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		
		dr.navigate().back();
		
		Thread.sleep(3000);
		
		dr.navigate().forward();
		
		Thread.sleep(3000);
		
		dr.navigate().refresh();

	}

}
