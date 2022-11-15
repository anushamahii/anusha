package kavya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class kavya {

	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://local host:3306/a","root","bhanupriya");
		Statement st=con.createStatement();
		String sql="create table b(id int,name varchar(40))";
		//String sql="insert into b values(1,'apple'),(2,'mango'),(3,'pineapple')";
		st.execute(sql);
		con.close();
		System.out.println("done");
		

	}

}
