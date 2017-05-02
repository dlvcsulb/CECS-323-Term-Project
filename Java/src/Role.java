import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Role{
	    
	    private static Statement stmnt = null;
	    
	    public static void createRole(String employeeID, String teamName, String roleType, Connection conn1){
		        try{
			            String sql = "INSERT INTO Role (employeeID, teamName, roleType) VALUES (?, ?, ?)";
			            PreparedStatement statement = conn1.prepareStatement(sql);
			            statement.setString(1, employeeID);
			            statement.setString(2, teamName);
			            statement.setString(3, roleType);
			            int rowCreated = statement.executeUpdate();
			            if (rowCreated > 0) {
				               System.out.println("Role added successfully.");
				            }
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }
	    public static void selectRole(Connection conn1){
		        try{
			            stmnt = conn1.createStatement();
			            ResultSet results = stmnt.executeQuery("SELECT * from Role");
			            ResultSetMetaData rsmd = results.getMetaData();
			            int numberCols = rsmd.getColumnCount();
			            for(int i=1;i<=numberCols;i++)
				                System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			            System.out.println("\n----------------------------------------"
					                    + "------------------------------------------------------------");
			            while(results.next()){
				                String employeeID = results.getString(1);//row data
				                String teamName = results.getString(2);
				                String roleType = results.getString(3);
				                System.out.println(employeeID+"\t\t\t"+teamName+"\t\t\t"+roleType);
				            }
			            results.close();
			            stmnt.close();
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }

}
