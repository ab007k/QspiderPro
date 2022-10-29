/* Open url:https://www.flipkart.com/
 * Search:Laptop
 * Apply filter
 * Core i5
 * Brand:HP
 * OS:Windows 10
 * get the price of First result*/
package qsp03.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase6DependentIndependent2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//check core i5
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		
		//click on Brand
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();//div[.='Brand']/ancestor::div[@class='_213eRC _2ssEMF']"
		//check HP
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		
		//click on OPERATING SYSTEM
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();//div[.='Operating System']/ancestor::div[@class='_213eRC _2ssEMF']
		//check Windows 10
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		
		//get the price
		String price=driver.findElement(By.xpath("//div[.='HP Core i5 11th Gen - (8 GB + 32 GB Optane/512 GB SSD/Windows 10 Home) 15s-FQ2071TU Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);
		
	}
}