import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class getTrainers {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_03?user=root&password=root1234");
		CallableStatement cs=con.prepareCall("{call get1()}");
		ResultSet res=cs.executeQuery();
//		System.out.println(res);
		while(res.next()) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));
		}
		con.close();

	}

}
