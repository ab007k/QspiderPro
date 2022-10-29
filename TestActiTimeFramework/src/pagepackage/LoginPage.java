//PageObjectRepository//
//utilization:RightClick>Source>Generate Getters and Setters Method>"Check only getMethod checkboxes"
//initialization:RightClick>Source>Generate Constructor using Fields>"Uncheck the checkboxes"

package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(name="username")  private WebElement usn;
	@FindBy(name="pwd")  private WebElement pass;
	@FindBy(id="loginButton")  private WebElement lobinbtn;
	@FindBy(xpath="//img[cointains(@src,'timer')]")  private WebElement keepMeLoggedInCheckBox;
	@FindBy(id="keepLoggedInCheckBox")  private WebElement Logo;
	@FindBy(id="licenseLink")  private WebElement LicenseLink;
	
	
//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//utilization
	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLobinbtn() {
		return lobinbtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLogo() {
		return Logo;
	}
	public WebElement getLicenseLink() {
		return LicenseLink;
	}
	
	//generic reusable method
}
