
import java.sql.*;
import java.util.Scanner;

public class MainDB {
	//test
	private static String dbURL1 = "jdbc:mysql://10.39.52.172:3306/teamDB?"+
			"user=cecs323b&password=cecs323";
	private static Connection conn1 = null;
	private static Statement stmnt = null;
	private static int userEntry = 0;
	private static Scanner console = new Scanner(System.in);
	public static Sprints sprint = new Sprints();
	
	public static void main(String[] args) {
		CreateConnection(); //call the connection method to connect to db
		boolean run = true;
		//Switch case menu to run the users requests
		while (run) {
			menu1();
			switch (userEntry) {
			case 1:
				menu2();
				break;
			case 2:
				menu3();
				break;
			case 3:
				menu4();
				break;
			case 4:
				
				sprint.createSprint("sprintID", dbURL1, dbURL1, dbURL1, dbURL1, run, dbURL1, dbURL1, dbURL1, conn1);
				break;
			case 5:
				addNewMeeting();
				break;
			case 6:
				addNewConferenceRoom();
				break;
			case 7:
				listByPurpose();
				break;
			case 8:
				addNewTeam();
				break;
			case 9:
				Shutdown();
				run = false;
				break;
			default:
				System.out.println("Please select a valid option.");
			}

		}
	}
	
	private static void CreateConnection(){ //connects to given database @ url
		try{
			conn1 = DriverManager.getConnection(dbURL1);
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void run(){
		
	}
	public static void menu1(){
		userEntry = 0;
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
		userEntry = console.nextInt();
	}
	public static void menu2(){
		userEntry = 0;
		System.out.println("CRUD for stakeholders"
				+ ".........."
				+ ". Please select one of the following options: \n"
				+ " 1. create stakeholder"
				+ " \n 2. select stakeholder"
				+ " \n 3. update stakeholder"
				+ "	\n 4. delete stakeholder"
				+ " \n 5. Quit.");
		userEntry = console.nextInt();
	}
	public static void menu3(){
		userEntry = 0;
		System.out.println("CRUD for sprint team members"
				+ ".........."
				+ ". Please select one of the following options: \n"
				+ " 1. create team member"
				+ " \n 2. select team member"
				+ " \n 3. update team member"
				+ "	\n 4. delete team member"
				+ " \n 5. Quit.");
		userEntry = console.nextInt();
	}
	public static void menu4(){
		userEntry = 0;
		System.out.println("CRUD for user stories"
				+ ".........."
				+ ". Please select one of the following options: \n"
				+ " 1. create user story"
				+ " \n 2. select user story"
				+ " \n 3. update user story"
				+ "	\n 4. delete user story"
				+ " \n 5. Quit.");
		userEntry = console.nextInt();
	}
}
