package com.comviva.kafka;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProducerTest {

	Producer test = new Producer();

	@Test
	public void test1() {
		
		String message = "Message for kafka";
		
		boolean actualResult = test.sendMessage(message);
		
		boolean expeectedResult = true;	//true if Message successfully sent to kafka
	
		assertEquals(expeectedResult, actualResult);
	}

	@Test
	public void test2() {

		String x = test.toString();
		
		assertNotNull(x);
	}

}
