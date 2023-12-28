package com.jsp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testExe2 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja?user=root&password=root1234");
		Statement st=con.createStatement();
		String sql="Select * from car";
		ResultSet res=st.executeQuery(sql);
		System.out.println(res);
		con.close();

	}

}
