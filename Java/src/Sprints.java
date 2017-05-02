import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Sprints {
	
	private static Statement stmnt = null;
	
	public static void createSprint(String sprintID, String projectID, String sprintIteration, 
								String startDate, String endDate,
								boolean completion, String userStory,
								String softwareEngineers, String projectName, Connection conn1){
		try{
			String sql = "INSERT INTO Sprints(sprintID, projectID, sprintIteration, startDate, endDate, completion, userStory, softwareEngineers, projectName) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, sprintID);
			statement.setString(2, projectID);
			statement.setString(3, sprintIteration);
			statement.setString(4, startDate);
			statement.setString(5, endDate);
			statement.setBoolean(6, completion);
			statement.setString(7, userStory);
			statement.setString(8, softwareEngineers);
			statement.setString(9, projectName);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Sprint created successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void selectSprint(Connection conn1){
		try{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from Sprints");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			while(results.next()){
				String sprintID = results.getString(1);//row data
				String projectID = results.getString(2);
				String sprintIteration = results.getString(3);
				String startDate = results.getString(4);
				String endDate = results.getString(5);
				boolean completion = results.getBoolean(6);
				String userStory = results.getString(7);
				String softwareEngineers = results.getString(8);
				String projectName = results.getString(9);
				System.out.println(sprintID+"\t\t\t"+projectID+"\t\t\t"+sprintIteration+
						"\t\t\t"+startDate+"\t\t\t"+endDate+"\t\t\t"+completion+
						"\t\t\t"+userStory+"\t\t\t"+softwareEngineers+"\t\t\t"+projectName);
			}
			results.close();
			stmnt.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}

}
