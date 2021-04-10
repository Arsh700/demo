package com.TestNg.org.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
/*priority 
 * it is a used to order the testcase which is what testcase should run in user wish*/

public class Priorrity {

	
	@Test(retryAnalyzer = Retry_Analyser.class)
	private void browserLaunch() {
Assert.assertEquals("arsa", "arsh");
	}
	
	@Test()
	private void Url() {
		System.out.println("Url");
	}
	
	
	@Test()
	private void login() {
		System.out.println("Login");
	}
	
	@Test()
	private void SearchMobile() {
		System.out.println("SerachMoblie");
	}
	
	@Test()
	private void Payment() {
		System.out.println("Payment");
	}
	
	@Test()
	private void logOut() {
		System.out.println("Logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
