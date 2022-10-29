package qsp14.getWindowHandle_s;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWH01_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		dr.get("https://www.flipkart.com/");
		dr.findElement(By.xpath("//button[.='✕']")).click();
				
		dr.findElement(By.name("q")).sendKeys("samsung f12");//Enter Mobile name
		dr.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//Click on search
		dr.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();//Click on first search result
		
		//Once we click on First result:there will be open new window>we need to switch the control to that window
		String parentHandle=dr.getWindowHandle();
		Set <String> allHandles=dr.getWindowHandles();
		
		for(String wh:allHandles) {
			if(!parentHandle.equals(wh))
				dr.switchTo().window(wh);
		}
		//After Switching to new Window
		                          //li[@id='swatch-0-color']/a
		dr.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();//Color
		dr.findElement(By.xpath("//a[.='128 GB']")).click();//Storage
		
		dr.findElement(By.id("pincodeInputId")).clear();//Delivery:Clear
		dr.findElement(By.id("pincodeInputId")).sendKeys("411033");//Delivery:EnterPincode
        dr.findElement(By.xpath("//span[@class='_2P_LDn']")).click();//Delivery:Check
//StaleElementReferenceException
        try {
        	dr.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();//Click on ORDER IT
        }
        catch(StaleElementReferenceException e){
        	 dr.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
        }
        Thread.sleep(5000);
        String actTitle=dr.getTitle();//SAMSUNG Galaxy F12 ( 128 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com
        System.out.println(actTitle);
        String expTitle="Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
        System.out.println(expTitle);
        if(actTitle.equalsIgnoreCase(expTitle)) {
        	System.out.println("TestPass");
        }
        else {
        	System.out.println("TestFail");
        }
	}

}
