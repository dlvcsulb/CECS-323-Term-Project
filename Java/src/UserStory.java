import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class UserStory{
	
	private static Statement stmnt = null;
	
	public static void createUS(String storyID, String perspective, String request, String benefit, String priority, Connection conn1){
		try{
			String sql = "INSERT INTO UserStory (storyID, perspective, request, benefit, priority) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, storyID);
			statement.setString(2, perspective);
			statement.setString(3, request);
			statement.setString(4, benefit);
			statement.setString(5, priority);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("User Story created successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void selectUS(Connection conn1){
		try{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from UserStory");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			while(results.next()){
				String storyID = results.getString(1);//row data
				String perspective = results.getString(2);
				String request = results.getString(3);
				String benefit = results.getString(4);
				String priority = results.getString(5);
				System.out.println(storyID+"\t\t\t"+perspective+"\t\t\t"+request+"\t\t\t"+benefit+"\t\t\t"+priority);
			}
			results.close();
			stmnt.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}

}
