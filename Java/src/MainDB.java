import java.sql.*;
import java.util.Scanner;

public class MainDB
{
	private static String dbURL1 = "jdbc:mysql://cecs-db01.coe.csulb.edu:3306?user=cecs323h29&password=eem3me&useSSL=false";
	private static boolean run;

	private static Connection conn1 = null;
	private static Statement stmnt = null;

	private static int userEntry = 0;
	private static Scanner console = new Scanner(System.in);

	private static Sprints sprint = new Sprints();
	private static UserStory userStory = new UserStory();
	private static Developer developer = new Developer();
	private static StakeHolder stakeHolder = new StakeHolder();
	private static SprintMembers sprintMembers = new SprintMembers();

	public static void main(String[] args)
	{
		CreateConnection(); //call the connection method to connect to db
		run = true;

		//Switch case menu to run the users requests
		while (run)
		{
			menu1();
			switch (userEntry)
			{
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
				sprint.createSprint(conn1);
				break;
			case 5:
				userStory.createUS(conn1);
				break;
			case 6:
				break;
			case 7:
				developer.selectDev(conn1);
				break;
			case 8:
				Shutdown();
				run = false;
				break;
			default:
				System.out.println("Please select a valid option.");
			}
		}
	}

	private static void CreateConnection()
	{
		//connects to given database @ url
		try
		{
			conn1 = DriverManager.getConnection(dbURL1);
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void menu1()
	{
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

	public static void menu2()
	{
		userEntry = 0;
		System.out.println("CRUD for stakeholders"
				+ ".........."
				+ ". Please select one of the following options: \n"
				+ " 1. Create Stakeholder"
				+ " \n 2. List All Stakeholders"
				+ " \n 3. Update a Stakeholder"
				+ "	\n 4. Delete a Stakeholder (by ID)"
				+ " \n 5. Quit.");
		userEntry = console.nextInt();

		switch (userEntry)
		{
		case 1:
			stakeHolder.createSH(conn1);
			break;
		case 2:
			stakeHolder.selectSH(conn1);
			break;
		case 3:
			stakeHolder.updateSH(conn1);
			break;
		case 4:				
			StakeHolder.deleteSH(conn1);
			break;
		case 5:
			Shutdown();
			run = false;
			break;
		default:
			System.out.println("Please select a valid option.");
		}
	}
	public static void menu3()
	{
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

		switch (userEntry)
		{
		case 1:
			sprintMembers.createSM(conn1);
			break;
		case 2:
			sprintMembers.selectSM(conn1);
			break;
		case 3:
			sprintMembers.updateSM(conn1);
			break;
		case 4:				
			sprintMembers.deleteSM(conn1);
			break;
		case 5:
			Shutdown();
			run = false;
			break;
		default:
			System.out.println("Please select a valid option.");
		}
	}

	public static void menu4()
	{
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

		switch (userEntry)
		{
		case 1:
			userStory.createUS(conn1);
			break;
		case 2:
			userStory.selectUS(conn1);
			break;
		case 3:
			userStory.updateUS(conn1);
			break;
		case 4:	
			UserStory.deleteUS(conn1);
			break;
		case 5:
			Shutdown();
			run = false;
			break;
		default:
			System.out.println("Please select a valid option.");
		}
	}

	// shuts down the server
	private static void Shutdown()
	{
		try
		{
			System.out.println("Goodbye");

			if (conn1 != null)
			{
				conn1 = DriverManager.getConnection(dbURL1 + "shutdown=true)");
				conn1.close();
			}
			System.exit(0);
		} catch (SQLException sqlEx)
		{
		}
	}
}
