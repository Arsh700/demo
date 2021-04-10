package com.TestNg.org.TestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser implements IRetryAnalyzer {

	int count = 0;
	int limit = 3;
	
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (count < limit) {
			count++;
			return true;
		}
		
		
		
		
		return false;
	}

}
