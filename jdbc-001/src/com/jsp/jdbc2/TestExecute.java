package com.jsp.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestExecute {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja?user=root&password=root1234");
		Statement st=con.createStatement();
		String sql="update car set price=price+30000 where price>300000";
		int res=st.executeUpdate(sql);
		System.out.println(res);
		con.close();

	}

}
