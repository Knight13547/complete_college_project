package Connector;
import java.sql.*;
public class Connector {
	public static Connection conn() throws Exception{
		Connection con=null;
String url="jdbc:mysql://localhost:3306/farmzon";
try {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection(url,"root","");
}
catch(Exception e) {
	
}
return con;
	}
}
