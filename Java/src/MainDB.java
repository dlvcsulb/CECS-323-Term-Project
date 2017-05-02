
import java.sql.*;
import java.util.Scanner;

public class MainDB {
	
	private static String dbURL1 = "jdbc:mysql://10.39.52.172:3306/teamDB?"+
			"user=cecs323b&password=cecs323";
	private static Connection conn1 = null;
	private static Statement stmnt = null;
	
	private static void CreateConnection(){ //connects to given database @ url
		try{
			conn1 = DriverManager.getConnection(dbURL1);
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void run(){
		
	}
}
