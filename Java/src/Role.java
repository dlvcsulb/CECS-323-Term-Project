import java.sql.*;
import java.util.Scanner;

public class Role
{
	
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createRole(Connection conn1)
	{
		try
		{
			System.out.print("Enter the employee ID: ");
			String employeeID = console.nextLine();
			System.out.print("Enter the team name: ");
			String teamName = console.nextLine();
			System.out.print("Enter the role type: ");
			String roleType = console.nextLine();
			
			String sql = "INSERT INTO Role (employeeID, teamName, roleType) VALUES (?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, employeeID);
			statement.setString(2, teamName);
			statement.setString(3, roleType);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("Role added successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectRole(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from Role");
			ResultSetMetaData rsmd = results.getMetaData();
		
			int numberCols = rsmd.getColumnCount();
			for(int i = 1; i <= numberCols; i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String employeeID = results.getString(1);//row data
				String teamName = results.getString(2);
				String roleType = results.getString(3);
				System.out.println(employeeID+"\t\t\t"+teamName+"\t\t\t"+roleType);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}