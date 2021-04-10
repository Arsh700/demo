package com.TestNg.org.TestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"Username","Password"})
	private void Credential(@Optional("Arsh")String Username,String Password) {
System.out.println("name = "+Username+" "+"Password ="+Password);

	}
	
	
	@Test
	@Parameters({"Username","password"})
	private void credential_2(@Optional("hai")String Username,String password) {
    System.out.println("username="+Username+" "+"password = "+password);
	}
	
}
