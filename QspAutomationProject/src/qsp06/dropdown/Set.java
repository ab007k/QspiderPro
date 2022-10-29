package qsp06.dropdown;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Set {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver dr=new ChromeDriver();		
		dr.manage().window().maximize();
		dr.get("D:\\@Qspider\\WCSM7\\QspAutomationProject\\WebElement\\multiselectdropdown.html");
		
		WebElement dropdown = dr.findElement(By.id("menu"));
		
		Select sel=new Select(dropdown);
		
		List<WebElement> options = sel.getOptions();
		//eliminate duplicate//		
//		HashSet<String>s=new HashSet<String>();//order not maintained
//		LinkedHashSet<String>s=new LinkedHashSet<String>();//order maintained
		TreeSet<String>s=new TreeSet<String>();//order maintained "alphabatically"  sort:Ascending order 
		for(int i=0;i<options.size();i++) {
			WebElement ops=options.get(i);
			String text=ops.getText();
			System.out.println(text);
			s.add(text);
		}
		
		System.out.println("##############################");
//???????????????????????????????????????//				
//		for(WebElement option:options) {
//			
//			String text=option.getText();
//			s.add(text);		
//		}
//??????????????????????????????????????//		
		for(String se:s) {
		 System.out.println(se);	
		}
		
		dr.quit();		
	}
}
