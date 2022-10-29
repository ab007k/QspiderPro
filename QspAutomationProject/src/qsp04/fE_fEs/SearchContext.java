//Print All the Suggestions from google Search:DynamicDropdown//
package qsp04.fE_fEs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchContext {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();	
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		
		dr.switchTo().activeElement().sendKeys("bike");
		
		Thread.sleep(4000);
		
		List <WebElement> sugs=dr.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
//		for(WebElement sug:sugs) {
//			String textOfWebElement=sug.getText();
//			System.out.println(textOfWebElement);
//		}		
		

		for(int i=0;i<sugs.size();i++) {
			WebElement sg=sugs.get(i);
			String textOfWebElement=sg.getText();
		    System.out.println(textOfWebElement);
		}
		
	

	}

}
