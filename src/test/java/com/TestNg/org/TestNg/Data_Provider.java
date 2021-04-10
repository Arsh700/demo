package com.TestNg.org.TestNg;

import org.testng.annotations.*;

public class Data_Provider {
    @Test(dataProvider = "test")
	private void Credetials(String Username,String Password) {
	System.out.println("Username ="+ Username+" "+"password ="+Password);

	}
	
	
	@DataProvider
	private Object[][] test() {
     return new Object[] [] { {"arsath","12345"},
                              {"zarthis","45678"}
     };
		
		
	}
	
	
	
}
