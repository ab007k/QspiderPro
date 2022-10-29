package qsp22.testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag07Groups {
	
	@Test(groups="FunctionalTC")
	public void ft1() {
		Reporter.log("ft1",true);
	}
	
	@Test(groups="FunctionalTC")
	public void ft2() {
		Reporter.log("ft2",true);
	}
//-----------------------------------------------------------	
	@Test(groups="IntegrationTC")
	public void it1() {
		Reporter.log("it1",true);
	}
	
	@Test(groups="IntegrationTC")
	public void it2() {
		Reporter.log("it2",true);
	}
//-----------------------------------------------------------
	@Test(groups="SystemTC")
	public void st1() {
		Reporter.log("st1",true);
	}
	
	@Test(groups="SystemTC")
	public void st2() {
		Reporter.log("st2",true);
	}
}
