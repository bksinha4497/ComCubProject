package com.comviva.database;

import java.sql.*;
import com.comviva.database.GetConnection;
public class CreateTable {

	public static void main(String [] args)
	{
		GetConnection gc = new GetConnection();
		Connection conn= gc.connect();
		Statement stmt = null;

		try{

			System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE Product (" 
					+ "Id INT NOT NULL AUTO_INCREMENT,"  
					+ "ProductName VARCHAR(255),"
					+ "ProductCost INT,"
					+ "TimeStamp DATETIME," 
					+ "PRIMARY KEY(Id))";  

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");
		}catch(SQLException se){

			se.printStackTrace();
		}catch(Exception e){

			e.printStackTrace();
		}finally{

			try{
				if(stmt!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}