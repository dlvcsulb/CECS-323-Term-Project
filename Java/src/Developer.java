import java.sql.*;
import java.util.Scanner;

public class Developer
{
	
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createDev(Connection conn1)
	{
		try
		{
			System.out.print("Enter the employee ID: ");
			String employeeID = console.nextLine();
			System.out.print("Enter the employee's first name: ");
			String empFirst = console.nextLine();
			System.out.print("Enter the employee's last name: ");
			String empLast = console.nextLine();
			System.out.print("Enter the team ID: ");
			String teamID = console.nextLine();
			System.out.print("Enter the project ID: ");
			String projectID = console.nextLine();
			
			String sql = "INSERT INTO Developer (employeeID, empFirst, empLast, teamID, projectID) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, employeeID);
			statement.setString(2, empFirst);
			statement.setString(3, empLast);
			statement.setString(4, teamID);
			statement.setString(5, projectID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) 
			    System.out.println("Developer added successfully.");
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectDev(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from Developer");
			ResultSetMetaData rsmd = results.getMetaData();
			
			int numberCols = rsmd.getColumnCount();
			for(int i = 1; i <= numberCols; i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String employeeID = results.getString(1);//row data
				String empFirst = results.getString(2);
				String empLast = results.getString(3);
				String teamID = results.getString(4);
				String projectID = results.getString(5);
				System.out.println(employeeID+"\t\t\t"+empFirst+"\t\t\t"+empLast+
						"\t\t\t"+teamID+"\t\t\t"+projectID);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
