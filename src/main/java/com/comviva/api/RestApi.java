package com.comviva.api;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.comviva.database.InsertData;
import com.comviva.product.Product;

@Path("/comviva/product")
public class RestApi {
	 static Logger log = Logger.getLogger(RestApi.class.getName());

	  @POST
	  @Path("/post")
	  @Consumes("application/xml")
	  public Response createProduct(String msg) throws SQLException {
		 Product product = new Product();
		 InsertData dbInstance = new InsertData(); 
		 
		 String[] pdetails = msg.split(",");
		 product.setName(pdetails[0]);
		 int cost= Integer.parseInt(pdetails[1]);
		 product.setCost(cost);
		 
		 dbInstance.insert(product.getName(),product.getCost());
		 
		 log.info("Name : "+product.getName()+" and "+" Cost : "+product.getCost() );
		
		
		 
		 	 	  
		 String result = "Product created : " + msg; 
		 return Response.status(201).entity(result).build();
	  
	  }
	 
	
}