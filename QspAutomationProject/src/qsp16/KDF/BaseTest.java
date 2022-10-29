package qsp16.KDF;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver dr;
	public void setUp() throws IOException {
		Flib flib=new Flib();
		String browser=flib.readProperyFile(PROP_PATH, "browser");
		String url=flib.readProperyFile(PROP_PATH, "url");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			dr.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			dr.get(url);
		}
		else {
			System.out.println("Plz define correct value in config.properties");
		}
	}
	
	public void tearDown() {
		dr.quit();
	}

}
