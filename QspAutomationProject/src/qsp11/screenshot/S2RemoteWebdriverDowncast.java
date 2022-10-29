package qsp11.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class S2RemoteWebdriverDowncast {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.selenium.dev/");
		
		RemoteWebDriver rw=(RemoteWebDriver)dr;
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/sc2.png");
		Files.copy(src, dest);	
		
		dr.quit();
	}

}
