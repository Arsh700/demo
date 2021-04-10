package com.TestNg.org.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample_RetryAnalyser {

	
	@Test(retryAnalyzer = Retry_Analyser.class)
	private void sample() {
		
		
    Assert.assertEquals("Arsh","Arsha");
		

	}
	
	
	
	
	
}
