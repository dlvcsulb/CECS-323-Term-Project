import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Developer {
	
	private static Statement stmnt = null;
	
	public static void createDev(String employeeID, String empFirst, String empLast, 
								String teamID, String projectID,
								String projectName, Connection conn1){
		try{
			String sql = "INSERT INTO Developer (employeeID, empFirst, empLast, teamID, projectID, projectName) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, employeeID);
			statement.setString(2, empFirst);
			statement.setString(3, empLast);
			statement.setString(4, teamID);
			statement.setString(5, projectID);
			statement.setString(6, projectName);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Developer added successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void selectDev(Connection conn1){
		try{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from Developer");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			while(results.next()){
				String employeeID = results.getString(1);//row data
				String empFirst = results.getString(2);
				String empLast = results.getString(3);
				String teamID = results.getString(4);
				String projectID = results.getString(5);
				String projectName = results.getString(6);
				System.out.println(employeeID+"\t\t\t"+empFirst+"\t\t\t"+empLast+
						"\t\t\t"+teamID+"\t\t\t"+projectID+"\t\t\t"+projectName);
			}
			results.close();
			stmnt.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}

}
