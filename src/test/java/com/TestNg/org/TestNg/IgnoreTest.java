package com.TestNg.org.TestNg;

import org.testng.annotations.Test;
/*Ignore test 
 * it is used to ignore a particular testcase
 * it is used (enabled = True|false)keyword
 * which is also used in .xml file by 
 * <class><methods>
 * <exclude name = "??????"></exclude>
 * </methods>
 * </class> */

public class IgnoreTest {

	
	@Test
	private void browserLaunch() {
System.out.println("BrowserLaunch");
	}
	
	@Test
	private void Url() {
		System.out.println("Url");
	}
	
	
	@Test
	private void login() {
		System.out.println("Login");
	}
	
	@Test(enabled=false)
	private void SearchMobile() {
		System.out.println("SerachMoblie");
	}
	
	@Test(enabled = false)
	private void Payment() {
		System.out.println("Payment");
	}
	
	@Test
	private void logOut() {
		System.out.println("Logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
