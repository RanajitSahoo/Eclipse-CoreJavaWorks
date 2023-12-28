package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		Statement st=con.createStatement();
		String sql="INSERT INTO emp VALUES(4,'sinu',23)";
		st.execute(sql);
		
		con.close();
		System.out.println("inserted");
	}

}
