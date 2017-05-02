import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class SprintBacklog{
	    
	    private static Statement stmnt = null;
	    
	    public static void createSB(String storyID, String projectID, String assignedDeveloper, String sprintID, Connection conn1){
		        try{
			            String sql = "INSERT INTO SprintBacklog (storyID, projectID, assignedDeveloper, sprintID) VALUES (?, ?, ?, ?)";
			            PreparedStatement statement = conn1.prepareStatement(sql);
			            statement.setString(1, storyID);
			            statement.setString(2, projectID);
			            statement.setString(3, assignedDeveloper);
			            statement.setString(4, sprintID);
			            int rowCreated = statement.executeUpdate();
			            if (rowCreated > 0) {
				               System.out.println("Sprint Backlog created successfully.");
				            }
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }
	    public static void selectSB(Connection conn1){
		        try{
			            stmnt = conn1.createStatement();
			            ResultSet results = stmnt.executeQuery("SELECT * from SprintBacklog");
			            ResultSetMetaData rsmd = results.getMetaData();
			            int numberCols = rsmd.getColumnCount();
			            for(int i=1;i<=numberCols;i++)
				                System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			            System.out.println("\n----------------------------------------"
					                    + "------------------------------------------------------------");
			            while(results.next()){
				                String storyID = results.getString(1);//row data
				                String projectID = results.getString(2);
				                String assignedDeveloper = results.getString(3);
				                String sprintID = results.getString(4);
				                System.out.println(storyID+"\t\t\t"+projectID+"\t\t\t"+assignedDeveloper+"\t\t\t"+sprintID);
				            }
			            results.close();
			            stmnt.close();
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }

}
