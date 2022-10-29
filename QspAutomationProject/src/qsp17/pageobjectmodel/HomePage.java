package qsp17.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement LogoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement CreateNewTaskLink;
	@FindBy(linkText="Settings") private WebElement Setting;

//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//utilization
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getCreateNewTaskLink() {
		return CreateNewTaskLink;
	}

	public WebElement getSetting() {
		return Setting;
	}
		
	
}