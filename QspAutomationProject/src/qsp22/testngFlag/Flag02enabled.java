package qsp22.testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag02enabled {
	@Test(enabled = true)
	public void login()
	{
		Reporter.log("login performed",true);
	}


	@Test(enabled =false)
	public void logout()
	{
		Reporter.log("logout performed",true);
	}
}
