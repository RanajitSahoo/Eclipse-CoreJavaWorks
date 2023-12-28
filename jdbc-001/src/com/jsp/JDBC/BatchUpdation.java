package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class BatchUpdation {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		Statement st=con.createStatement();
		
		String sql1="INSERT INTO student VALUES(11,'RANAJIT',26)";
		String sql2="INSERT INTO student VALUES(10,'BENGA',12)";
		String sql3="INSERT INTO student VALUES(9,'AKI',16)";
		
		st.addBatch(sql3);
		st.addBatch(sql2);
		st.addBatch(sql1);
		
		int[] a=st.executeBatch();
		System.out.println(Arrays.toString(a));
		con.close();
		System.out.println("batch inserted");
		
	}

}
