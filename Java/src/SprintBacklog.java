import java.sql.*;
import java.util.Scanner;

public class SprintBacklog
{
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createSB(Connection conn1)
	{
		try
		{
			System.out.print("Enter the story ID: ");
			String storyID = console.nextLine();
			System.out.print("Enter the project ID: ");
			String projectID = console.nextLine();
			System.out.print("Enter the assigned developer: ");
			String assignedDeveloper = console.nextLine();
			System.out.print("Enter the sprint ID: ");
			String sprintID = console.nextLine();
			
			String sql = "INSERT INTO SprintBacklog (storyID, projectID, assignedDeveloper, sprintID) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, storyID);
			statement.setString(2, projectID);
			statement.setString(3, assignedDeveloper);
			statement.setString(4, sprintID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("Sprint Backlog created successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectSB(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from SprintBacklog");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
		
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String storyID = results.getString(1);//row data
				String projectID = results.getString(2);
				String assignedDeveloper = results.getString(3);
				String sprintID = results.getString(4);
				System.out.println(storyID+"\t\t\t"+projectID+"\t\t\t"+assignedDeveloper+"\t\t\t"+sprintID);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}