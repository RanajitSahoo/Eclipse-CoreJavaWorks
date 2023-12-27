import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransCheck {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_03?user=root&password=root1234");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		String sql="insert into trainers values(104,'Grishma','SQL','female')";
		st.execute(sql);
		con.commit();
		con.close();
		System.out.println("success");

	}

}
