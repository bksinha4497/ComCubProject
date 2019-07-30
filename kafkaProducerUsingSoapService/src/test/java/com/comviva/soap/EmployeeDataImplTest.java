package com.comviva.soap;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;


public class EmployeeDataImplTest {

	EmployeeDataImpl test = new EmployeeDataImpl();
	
	Employee employe1 = new Employee(1111,"Zakir");
	
	Employee employe2 = new Employee(2222,"");
	
	Employee employe3 = new Employee(3333,"$@@@$");
	
	Employee employe4 = new Employee(4444,"Zakir Hussain N");


	@Test
	public void test1() throws IOException {
	
		String actualResult = test.insertEmployee(employe1);
		
		String expeectedResult="Successfully Inserted Employee Details to Kafka";
		
		System.out.println("actualResult = "+actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}

	
	@Test
	public void test2() throws IOException {
	
		String actualResult = test.insertEmployee(employe2);
		
		String expeectedResult="Successfully Inserted Employee Details to Kafka";
		
		System.out.println(actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}
	
	
	@Test
	public void test3() throws IOException {
	
		String actualResult = test.insertEmployee(employe3);
		
		String expeectedResult="Successfully Inserted Employee Details to Kafka";
		
		System.out.println(actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}
	
	
	@Test
	public void test4() throws IOException {
	
		String actualResult = test.insertEmployee(employe4);
		
		String expeectedResult="Successfully Inserted Employee Details to Kafka";
		
		System.out.println(actualResult);
		
		assertEquals(expeectedResult,actualResult);	
		}
}
