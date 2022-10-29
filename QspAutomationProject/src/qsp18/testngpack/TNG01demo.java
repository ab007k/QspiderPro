/*
 * Statement>Console>Report
 * Sysout("R")>Y>N
 * Reporter.log("R")>N>Y
 * Reporter.log("R",true)>Y>Y
 * Execute:alphabatically
 */

package qsp18.testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TNG01demo {
	
	@Test
	public void methodA() {
		//Reporter.log("M1",true);
		System.out.println("M1");
	}


	@Test
	public void methodB() {
		Reporter.log("M2",true);
		
	}
}
