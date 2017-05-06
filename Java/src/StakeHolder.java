import java.sql.*;
import java.util.Scanner;

public class StakeHolder
{
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createSH(Connection conn1)
	{
		try
		{
			System.out.print("Enter the stakeholder ID: ");
			String stakeHolderID = console.nextLine();
			System.out.print("Enter the stakeholder's first name: ");
			String shFirst = console.nextLine();
			System.out.print("Enter the stakeholder's last name: ");
			String shLast = console.nextLine();
			System.out.print("Enter the stakeholder type: ");
			String shType = console.nextLine();
			System.out.print("Enter the project ID: ");
			String projectID = console.nextLine();
			
			String sql = "INSERT INTO StakeHolder (stakeHolderID, shFirst, shLast, shType, projectID) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, stakeHolderID);
			statement.setString(2, shFirst);
			statement.setString(3, shLast);
			statement.setString(4, shType);
			statement.setString(5, projectID);
		
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("StakeHolder added successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void updateSH(Connection conn1)
	{
		try
		{
			System.out.print("Enter the first attribute: ");
			String attr1 = console.nextLine();
			System.out.print("Enter the second attribute: ");
			String attr2 = console.nextLine();
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "UPDATE StakeHolder SET ? = ? WHERE stakeHolderID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, attr1);
			statement.setString(2, attr2);
			statement.setString(3, selectedID);
		
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("StakeHolder updated successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void deleteSH(Connection conn1)
	{
		try
		{
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "DELETE FROM StakeHolder WHERE stakeHolderID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, selectedID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("StakeHolder updated successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectSH(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from StakeHolder");
			ResultSetMetaData rsmd = results.getMetaData();
			
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String stakeHolderID = results.getString(1);//row data
				String shFirst = results.getString(2);
				String shLast = results.getString(3);
				String shType = results.getString(4);//row data
				String projectID = results.getString(5);
				System.out.println(stakeHolderID+"\t\t\t"+shFirst+"\t\t\t"+shLast+
						"\t\t\t"+shType+"\t\t\t"+projectID);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
