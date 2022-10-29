package qsp16.KDF;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogIn extends BaseTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		BaseTest br=new BaseTest();
		br.setUp();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");


		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 1);

			dr.findElement(By.name("username")).sendKeys(username);
			dr.findElement(By.name("pwd")).sendKeys(password);
			dr.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			dr.findElement(By.name("username")).clear();
		}
		
		br.tearDown();

	}
}
