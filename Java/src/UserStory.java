import java.sql.*;
import java.util.Scanner;

public class UserStory
{
	private static Statement stmnt = null;
	private static Scanner console = new Scanner(System.in);
	
	public static void createUS(Connection conn1){
		try
		{
			System.out.print("Enter the user story ID: ");
			String storyID = console.nextLine();
			System.out.print("Enter the perspective: ");
			String perspective = console.nextLine();
			System.out.print("Enter the request: ");
			String request = console.nextLine();
			System.out.print("Enter the benefit: ");
			String benefit = console.nextLine();
			System.out.print("enter the priority: ");
			String priority = console.nextLine();
			
			String sql = "INSERT INTO UserStory (storyID, perspective, request, benefit, priority) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, storyID);
			statement.setString(2, perspective);
			statement.setString(3, request);
			statement.setString(4, benefit);
			statement.setString(5, priority);
		
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("User Story created successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void updateUS(Connection conn1)
	{
		try
		{
			System.out.print("Enter the first attribute: ");
			String attr1 = console.nextLine();
			System.out.print("Enter the second attribute: ");
			String attr2 = console.nextLine();
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "UPDATE UserStory SET ? = ? WHERE storyID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, attr1);
			statement.setString(2, attr2);
			statement.setString(3, selectedID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("User Story updated successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void deleteUS(Connection conn1)
	{
		try
		{
			System.out.print("Enter the selected ID: ");
			String selectedID = console.nextLine();
			
			String sql = "DELETE FROM UserStory WHERE storyID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, selectedID);
			
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0)
			    System.out.println("UserStory updated successfully.");
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void selectUS(Connection conn1)
	{
		try
		{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from UserStory");
			ResultSetMetaData rsmd = results.getMetaData();
			
			int numberCols = rsmd.getColumnCount();
			for(int i = 1; i <= numberCols; i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			
			while(results.next())
			{
				String storyID = results.getString(1);//row data
				String perspective = results.getString(2);
				String request = results.getString(3);
				String benefit = results.getString(4);
				String priority = results.getString(5);
				System.out.println(storyID+"\t\t\t"+perspective+"\t\t\t"+request+"\t\t\t"+benefit+"\t\t\t"+priority);
			}
			results.close();
			stmnt.close();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
