package qsp02.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2_get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.instagram.com");
		
		String title=dr.getTitle();
		System.out.println(title);
		
		String url=dr.getCurrentUrl();
		System.out.println(url);
		
		String source=dr.getPageSource();
		System.out.println(source);


	}

}
