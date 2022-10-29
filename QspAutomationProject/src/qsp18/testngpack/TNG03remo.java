package qsp18.testngpack;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TNG03remo {
	@Test
	public void methodD() {
		Assert.fail();
		Reporter.log("M4",true);
		
	}

}
