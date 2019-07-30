package com.comviva.rapi;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.ws.rs.core.Response;
import org.junit.Test;
import com.comviva.api.*;

public class RestApiTest {

	RestApi restapi=new RestApi();
	@Test
	public void test() throws SQLException {
		Response res=restapi.createProduct("samsung,78000");
		assertNotNull(res);
	}

	

}
