package qsp01.launchbrowser_runtimepolymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver dr=new ChromeDriver();
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.instagram.com");
		Thread.sleep(10000);
		dr.close();
	}

}
 