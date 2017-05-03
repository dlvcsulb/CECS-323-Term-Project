import java.sql.*;
import java.util.Scanner;

public class Project
{
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);

	public static void createProject(Connection conn1)
	{
		try
		{
			System.out.print("Enter the project ID: ");
			String projectID = console.nextLine();
			System.out.print("Enter the project name: ");
			String projectName = console.nextLine();
			
			String sql = "INSERT INTO Project(projectID, projectName) VALUES (?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, projectID);
			statement.setString(2, projectName);
			int rowCreated = statement.executeUpdate();
			
			if (rowCreated > 0)
				System.out.println("Project created successfully.");
		} catch(SQLException ex) 
		{
			ex.printStackTrace();
		}
	}

	public static void selectProject(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from Project");
			ResultSetMetaData rsmd = results.getMetaData();

			int numberCols = rsmd.getColumnCount();
			for(int i = 1; i <= numberCols; i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String projectID = results.getString(1);//row data
				String projectName = results.getString(2);
				System.out.println(projectID + "\t\t\t" + projectName);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex) 
		{
			ex.printStackTrace();
		}
	}

}
