package com.TestNg.org.TestNg;

import org.testng.annotations.*;


public class SimpleAnnotation {
@BeforeSuite
private void setup() {
System.out.println("chorme");
}


@BeforeTest
private void browserLaunch() {
	System.out.println("browserlaunch");

}

@BeforeClass
private void URL() {
	System.out.println("url");

}


@BeforeMethod
private void login() {
System.out.println("login");
}

@Test
private void searchmobile() {
System.out.println("searchmobile");
}

@AfterMethod
private void searchbook() {
System.out.println("searchbook");
}

@AfterClass
private void logout() {
System.out.println("logout");
}

@AfterTest
private void Verify() {
System.out.println("verfiy");
}

@AfterSuite
private void cookiesdeleted() {
System.out.println("cookiesdeleted");
}

@Test
private void searchdress() {
System.out.println("searchdress");
}








}
