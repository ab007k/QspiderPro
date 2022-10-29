package qsp22.testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag03invocationCount {
	@Test(invocationCount = 1000)
	public void login() {
		Reporter.log("inconsistent bug",true);
	}
}
