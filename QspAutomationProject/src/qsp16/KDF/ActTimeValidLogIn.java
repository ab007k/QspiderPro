//ActiTImeLogInTest<extends>BaseTest
//BaseTest<implements>IAutoConstant
//hence no need to take again here <implements>IAutoConstant
package qsp16.KDF;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeValidLogIn extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		BaseTest br=new BaseTest();
		br.setUp();
		
		//accessing the generic reusable  non static method by creating the object
		Flib flib=new Flib();
		
		//read the username
		String username=flib.readExcelData(EXCEL_PATH, "validcreds", 1, 0);
		//read the password
		String password=flib.readExcelData(EXCEL_PATH, "validcreds", 1, 1);
		
		//login operation
		dr.findElement(By.name("username")).sendKeys(username);
	    dr.findElement(By.name("pwd")).sendKeys(password);
		dr.findElement(By.id("loginButton")).click();
		
		br.tearDown();
	}

}
