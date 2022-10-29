package qsp11.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class S1ChromeDriver {

	public static void main(String[] args) throws IOException {
		// java.lang.IllegalStateException: The driver executable must exist:.\driver\chromedriver.exe//
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cd.get("https://www.selenium.dev/");
		
		File src=cd.getScreenshotAs(OutputType.FILE);
		//java.io.FileNotFoundException: .\screenshot\chromedriver.exe (The system cannot find the path specified)//
		File dest=new File("./screenshots/sc1.png");
		Files.copy(src, dest);
		
		cd.quit();

	}

}
