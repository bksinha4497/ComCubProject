package com.comviva.product;

import static org.junit.Assert.*;

import org.junit.Test;

import com.comviva.product.Product;

public class ProductTest {

	Product pro=new Product();
	@Test
	public void test() {
		
		String x=pro.toString();
		assertNotNull(x);
	}

}
