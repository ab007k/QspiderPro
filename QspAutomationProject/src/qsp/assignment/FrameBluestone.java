package qsp.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameBluestone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		dr.get("https://www.bluestone.com");
		
		WebElement frame1=dr.findElement(By.id("chat-widget"));
		dr.switchTo().frame(frame1);
		
		WebElement chat=dr.findElement(By.xpath("//p[.='Leave a message' or .='CHAT with our experts !']"));
		chat.click();
		
		dr.findElement(By.id("name")).sendKeys("ab");
		
		dr.findElement(By.id("email")).sendKeys("ab@gmail.com");
		
		dr.findElement(By.id("aj8ow16ohuu_146917605549304831")).sendKeys("7539514560");
	}

}
