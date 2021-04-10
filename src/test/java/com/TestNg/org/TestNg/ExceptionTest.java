package com.TestNg.org.TestNg;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(invocationCount = 5)
	private void add() {
	
	int a = 5;
	int b = 6;
	
	double c= a+b;
	System.out.println(c);
}
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	
	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	private void nullPointer() {
	int a[] = new int[5];
	a[6]=30;
	System.out.println(a);
	}
	@Test
	public void test() {
		
		String a = "for the people of the people by the people";
		String[] split = a.split(" ");
		Map<Object, Integer> n = new LinkedHashMap<>();
		for (String x : split) {
			if (n.containsKey(x)) {
				Integer in = n.get(x);
				n.put(x, in+1);
			}else  n.put(x, 1);
			
		}System.out.println(n);
	}
	
	}

