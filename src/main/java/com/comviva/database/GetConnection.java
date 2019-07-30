package com.comviva.database;
import java.sql.*;
public class GetConnection {
	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/comviva";

	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public Connection connect () {
	   java.sql.Connection conn = null;
	   
	   
	   try{
	     
	      Class.forName("com.mysql.jdbc.Driver");

	     
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	   }catch(SQLException se){
	   
	      se.printStackTrace();
	   }catch(Exception e){
	   
	      e.printStackTrace();
	   }
	return conn;
	  
	}
	   }