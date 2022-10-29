package qsp02.webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4_manage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		//maximize the browser window
		dr.manage().window().maximize();
		
		//set the browser size		
		Dimension targetSize=new Dimension(450, 250);
		dr.manage().window().setSize(targetSize);
		
		//set the browser position
		Point targetPosition=new Point(50,250);
		dr.manage().window().setPosition(targetPosition);
		
	}

}
