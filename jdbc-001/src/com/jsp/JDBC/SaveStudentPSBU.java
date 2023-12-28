package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveStudentPSBU {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		
		
		String sql1="INSERT INTO student VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql1);
		ps.setInt(1, 17);
		ps.setString(2, "yash");
		ps.setInt(3, 30);
		
//		ps.execute();
		
		ps.addBatch();
		
		
		ps.setInt(1, 16);
		ps.setString(2, "Kapil");
		ps.setInt(3, 35);

		ps.addBatch();
		
		
		
		ps.setInt(1, 15);
		ps.setString(2, "yash");
		ps.setInt(3, 30);
		

		ps.addBatch();
		
		
		
		ps.executeBatch();
		con.close();
		System.out.println("PS  and batch inserted");

	}

}
