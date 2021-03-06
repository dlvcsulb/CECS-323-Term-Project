import java.sql.*;
import java.util.Scanner;

public class ScrumTeam
{
	
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createST(Connection conn1)
	{
		try
		{
			System.out.print("Enter the team ID: ");
			String teamID = console.nextLine();
			System.out.print("Enter the team name: ");
			String teamName = console.nextLine();
			System.out.print("Enter the project ID: ");
			String projectID = console.nextLine();
			
			String sql = "INSERT INTO teams (teamID, teamName, projectID) VALUES (?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, teamID);
			statement.setString(2, teamName);
			statement.setString(3, projectID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Team created successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	public static void selectST(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from ScrumTeam");
			ResultSetMetaData rsmd = results.getMetaData();
			
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String teamID = results.getString(1);//row data
				String teamName = results.getString(2);
				String projectID = results.getString(3);
				System.out.println(teamID+"\t\t\t"+teamName+"\t\t\t"+projectID);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}