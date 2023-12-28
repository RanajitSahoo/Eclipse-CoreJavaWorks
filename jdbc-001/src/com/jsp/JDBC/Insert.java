package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		Statement st=con.createStatement();
		String sql="insert into person values(2,'raja',26,'male')";
		st.execute(sql);
		con.close();
		System.out.println("data inserted");
		

	}

}
