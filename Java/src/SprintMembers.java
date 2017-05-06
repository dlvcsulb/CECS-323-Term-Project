import java.sql.*;
import java.util.Scanner;

public class SprintMembers
{
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createSM(Connection conn1)
	{
		try
		{
			System.out.print("Enter the employee ID: ");
			String employeeID = console.nextLine();
			System.out.print("Enter the sprint ID: ");
			String sprintID = console.nextLine();
			
			String sql = "INSERT INTO SprintMembers(employeeID, sprintID) VALUES (?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, employeeID);
			statement.setString(2, sprintID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Members created successfully.");
			}
		} catch(SQLException ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public static void updateSM(Connection conn1)
	{
		try
		{
			System.out.print("Enter the first attribute: ");
			String attr1 = console.nextLine();
			System.out.print("Enter the second attribute: ");
			String attr2 = console.nextLine();
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "UPDATE SprintMembers SET ? = ? WHERE employeeID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, attr1);
			statement.setString(2, attr2);
			statement.setString(3, selectedID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("Sprint Member updated successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void deleteSM(Connection conn1)
	{
		try
		{
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "DELETE FROM SprintMembers WHERE employeeID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, selectedID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("Sprint Member successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectSM(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from SprintMembers");
			ResultSetMetaData rsmd = results.getMetaData();
			
			int numberCols = rsmd.getColumnCount();
			for(int i = 1; i <= numberCols; i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String employeeID = results.getString(1);//row data
				String sprintID = results.getString(2);
				System.out.println(employeeID+"\t\t\t"+sprintID);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
