package com.jsp.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

	public static void main(String[] args)throws ClassNotFoundException ,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root1234");
		Statement st=con.createStatement();
		String sql="update person set name='Ranajit' where id=2";
		st.execute(sql);
		con.close();
		System.out.println("data updated");

	}

}
