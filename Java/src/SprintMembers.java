import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class SprintMembers{
	
	private static Statement stmnt = null;
	
	public static void createSM(String employeeID, String sprintID, Connection conn1){
		try{
			String sql = "INSERT INTO SprintMembers(employeeID, sprintID) VALUES (?, ?)";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, employeeID);
			statement.setString(2, sprintID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Members created successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void updateSM(String attr1, String attr2, String selectedID, Connection conn1){
		try{
			String sql = "UPDATE SprintMembers SET ? = ? WHERE employeeID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, attr1);
			statement.setString(2, attr2);
			statement.setString(3, selectedID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Sprint Member updated successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void deleteSM(String selectedID, Connection conn1){
		try{
			String sql = "DELETE FROM SprintMembers WHERE employeeID=?";
			PreparedStatement statement = conn1.prepareStatement(sql);
			statement.setString(1, selectedID);
			int rowCreated = statement.executeUpdate();
			if (rowCreated > 0) {
			    System.out.println("Sprint Member successfully.");
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	public static void selectSM(Connection conn1){
		try{
			stmnt = conn1.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * from SprintMembers");
			ResultSetMetaData rsmd = results.getMetaData();
			int numberCols = rsmd.getColumnCount();
			for(int i=1;i<=numberCols;i++)
				System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			System.out.println("\n----------------------------------------"
					+ "------------------------------------------------------------");
			while(results.next()){
				String employeeID = results.getString(1);//row data
				String sprintID = results.getString(2);
				System.out.println(employeeID+"\t\t\t"+sprintID);
			}
			results.close();
			stmnt.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}

}
