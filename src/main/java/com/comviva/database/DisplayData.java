package com.comviva.database;

import java.sql.*;

public class DisplayData {

	public static void main(String[] args) {

		GetConnection gc = new GetConnection();
		Connection conn= gc.connect();
		Statement stmt = null;
		try{

			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String sql = "SELECT * FROM Product";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){

				int id  = rs.getInt("id");
				String message = rs.getString("Message");
				String time  = rs.getString("TimeStamp");


				System.out.print("ID: " + id);
				System.out.print(", Message: " + message);
				System.out.print(", TimeStamp: " + time);
				System.out.println("\n");

			}
			rs.close();
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