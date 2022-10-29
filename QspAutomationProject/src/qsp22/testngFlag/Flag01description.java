package qsp22.testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag01description {
	@Test(description = "This method performs login operation")
	public void login()
	{
		Reporter.log("Login is performed",true);

	}
}
