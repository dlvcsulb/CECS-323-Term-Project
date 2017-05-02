
import java.sql.*;
import java.util.Scanner;

public class MainDB {
	//test
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
	public static void menu(){
		System.out.println("Welcome to the Scrum Team Database"
				+ ".........."
				+ ". Please select one of the following options: \n"
				+ " 1. CRUD for Stakeholders."
				+ " \n 2. CRUD for Sprint Team Members."
				+ " \n 3. CRUD for User Stories."
				+ "	\n 4. Create Sprints"
				+ " \n 5. Add User Stories to Backlog."
				+ " \n 6. List a developer and his sprints."
				+ " \n 7. List Developers on a Sprint."
				+ " \n 8. Quit.");
	}
}
