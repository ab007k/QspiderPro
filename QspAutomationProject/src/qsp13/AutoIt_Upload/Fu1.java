package qsp13.AutoIt_Upload;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Fu1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("http://127.0.0.1/login.do");
		
		//LogIn
		dr.findElement(By.name("username")).sendKeys("admin");
		dr.findElement(By.name("pwd")).sendKeys("manager");
		dr.findElement(By.id("loginButton")).click();
		
		//Nevigate>>>Setting>Logo&ColorScheme>RadioButton
		dr.findElement(By.linkText("Settings")).click();
		dr.findElement(By.linkText("Logo & Color Scheme")).click();
		dr.findElement(By.id("uploadNewLogoOption")).click();
		
		//dr.findElement(By.name("formCustomInterfaceLogo.logo")).click();//InvalidArgumentException//
		//Upload
		WebElement ChooseFile=dr.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act=new Actions(dr);
		act.moveToElement(ChooseFile).click().build().perform();
		
		File abs=new File("./AutoIT/fu1.exe");
		String abspath=abs.getAbsolutePath();
		Runtime.getRuntime().exec(abspath+" "+"D:\\@Qspider\\WCSM7\\QspAutomationProject\\AutoIT\\Chhatrapati.jpg");	
		//dr.quit();
		
		
		
		
		

	}

}
