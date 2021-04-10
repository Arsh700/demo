package com.TestNg.org.TestNg;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assert_validation {
	
	
	@Test
	public static void Test() {
	String a = "arsa";
	String b = "Arsh";
	
	//Assert.assertEquals(a, b);
	Assert.assertNotEquals(a, b);
	

	}
	
	@Test
	private void Test2() {
	int a = 10;
	int b = 30;
	
	//Assert.assertEquals(a, b);
	Assert.assertTrue(a == b);

	}

	@Test
	private void Test3() {
	
		
		long a = 12345;
		long b = 123456;
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, b);
		s.assertAll();
		
		
		
		
		
		

	}
	
}
