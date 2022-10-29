package qsp01.launchbrowser_runtimepolymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.instagram.com");
		Thread.sleep(10000);
		dr.close();

	}

}
