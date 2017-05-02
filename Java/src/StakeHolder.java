import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class StakeHolder{
	    
	    private static Statement stmnt = null;
	    
	    public static void createSH(String stakeHolderID, String shFirst, String shLast, 
			                                String shType, String projectID, Connection conn1){
		        try{
			            String sql = "INSERT INTO Developer (stakeHolderID, shFirst, shLast, shType, projectID) VALUES (?, ?, ?, ?, ?)";
			            PreparedStatement statement = conn1.prepareStatement(sql);
			            statement.setString(1, stakeHolderID);
			            statement.setString(2, shFirst);
			            statement.setString(3, shLast);
			            statement.setString(4, shType);
			            statement.setString(5, projectID);
			            int rowCreated = statement.executeUpdate();
			            if (rowCreated > 0) {
				               System.out.println("Developer added successfully.");
				            }
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }
	    public static void updateSH(String attr1, String attr2, String selectedID, Connection conn1){
		        try{
			            String sql = "UPDATE StakeHolder SET ? = ? WHERE stakeHolderID=?";
			            PreparedStatement statement = conn1.prepareStatement(sql);
			            statement.setString(1, attr1);
			            statement.setString(2, attr2);
			            statement.setString(3, selectedID);
			            int rowCreated = statement.executeUpdate();
			            if (rowCreated > 0) {
				               System.out.println("StakeHolder updated successfully.");
				            }
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }
	    public static void deleteSH(String selectedID, Connection conn1){
		        try{
			            String sql = "DELETE FROM StakeHolder WHERE stakeHolderID=?";
			            PreparedStatement statement = conn1.prepareStatement(sql);
			            statement.setString(1, selectedID);
			            int rowCreated = statement.executeUpdate();
			            if (rowCreated > 0) {
				               System.out.println("StakeHolder updated successfully.");
				            }
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }

	    public static void selectSH(Connection conn1){
		        try{
			            stmnt = conn1.createStatement();
			            ResultSet results = stmnt.executeQuery("SELECT * from StakeHolder");
			            ResultSetMetaData rsmd = results.getMetaData();
			            int numberCols = rsmd.getColumnCount();
			            for(int i=1;i<=numberCols;i++)
				                System.out.print(rsmd.getColumnLabel(i)+"\t\t"); //prints column names
			            System.out.println("\n----------------------------------------"
					                    + "------------------------------------------------------------");
			            while(results.next()){
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
			        }catch(SQLException ex){
				            ex.printStackTrace();
				        }
		    }

}
