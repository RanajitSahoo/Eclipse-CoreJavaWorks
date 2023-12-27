import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class saveTrainer {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_03?user=root&password=root1234");
		CallableStatement cs=con.prepareCall("{call save(102,'Raveesh','JAVA','Male')}");
		int res=cs.executeUpdate();
		System.out.println(res);
		con.close();
	}

}
