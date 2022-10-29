package qsp11.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class S3RemoteWebdriver {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver rw=new ChromeDriver();
		rw.manage().window().maximize();
		rw.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		rw.get("https://www.selenium.dev/");
		
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/sc3.png");
		Files.copy(src, dest);	
		
		rw.quit();
	}

}
