package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Pac1 {

	public static void main(String[] args) throws Exception {
		
		//-------JDBC-Steps--------//
		
		//Load and Register Driver to connect with java; 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//make a connection between java application and database
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		
		//createStatement() (or) prepareStatement() (or) callableStatement() use those method 
		//by connection ref to get Statement ref type
		
		Statement st=con.createStatement();
		
		//create a query
		
//		String sql="UPDATE person SET name='Ranajit' WHERE id=2";
		String sql="DELETE FROM person WHERE id=2";
		
		//execute() is method which is present in Statement which is helping us to execute our SQL query 
		
		st.execute(sql);
		
		//close costly resource i.e. close the database connection
		
		con.close();
		
		System.out.println("data inserted");
	}

}
