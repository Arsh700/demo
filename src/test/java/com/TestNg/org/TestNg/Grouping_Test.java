package com.TestNg.org.TestNg;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups =" company details")
	private void empName() {
		System.out.println("Arsath");

	}

	@Test(groups = "company details")
	private void empId() {
		System.out.println("007");
	}
	
	@Test(groups = "personal details")
	private void empNumber() {
		System.out.println("xxxxxxxxxx");
	}
	
	@Test(groups = "bank details")
	private void empAccountDetails() {
		System.out.println("Indian Over seas");
	}
	
	
	@Test(groups = "salary details")
	private void empSalary() {
		System.out.println("20LPA");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
