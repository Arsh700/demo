package com.TestNg.org.TestNg;

import org.testng.annotations.Test;

public class InvocationCount_and_timeOut {

	
	@Test(invocationTimeOut =4000)
	private void browserLaunch() throws InterruptedException {
		Thread.sleep(3000);
System.out.println("BrowserLaunch");
	}
	
	@Test
	private void Url() {
		System.out.println("Url");
	}
	
	
	@Test(timeOut = 2000)
	private void login() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Login");
	}
	
	@Test(invocationCount = 5)
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
