package com.comviva.soap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmplotyeeTest {
	
	Employee test = new Employee();
	
	Employee employe1 = new Employee(1111,"Zakir");
	
	Employee employe2 = new Employee(2222,"$@@@$");



	@Test
	public void test1() {
	
		String actualResult = employe1.getName();
		
		String expeectedResult="Zakir";
		
		System.out.println(expeectedResult);
		
		assertEquals(expeectedResult,actualResult);	
		}

	
	@Test
	public void test2() {
	
		int actualResult = employe1.getId();
		
		int expeectedResult=1111;
		
		System.out.println(expeectedResult);
		
		assertEquals(expeectedResult,actualResult);	
		}
	
	
	@Test
	public void test3() {
	
		String  empName= employe1.getName();
		
		boolean actualResult=employe1.validateEmployeeName(empName);
		
		boolean expeectedResult=true;
		
		System.out.println(actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}
	
	
	@Test
	public void test4() {
	
		String  empName= employe2.getName();
		
		boolean actualResult=employe1.validateEmployeeName(empName);
		
		boolean expeectedResult=true;
		
		System.out.println(actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}

}
