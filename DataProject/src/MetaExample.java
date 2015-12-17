import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MetaExample {
	public static void main(String[] args) {
		 try {
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/may_15", "root","" );
		DatabaseMetaData metaData =	 conn.getMetaData();
		int databaseVersion = metaData.getDatabaseMajorVersion();
		int databaseMinorVersion = metaData.getDatabaseMinorVersion();
		String productName = metaData.getDatabaseProductName();
		System.out.println(" Server name and version " + productName + " : " + databaseVersion + " :" + databaseMinorVersion);
		//metaData.getDriverVersion() for finding out abt the version of jdbc.
		String  [] types = {"table" };
		ArrayList<String > list = new ArrayList<>();
		
			ResultSet rsTables = metaData.getTables( null , "%", " %" ,types);
			
			while (rsTables.next()){
			list.add(rsTables.getString( "Table_Name"));
			}
			rsTables.close();
			for (String string : list) {
				System.out.println(" Tables Name ------->"   + string);
				ResultSet rsColumns = metaData.getColumns(null, "%", string, "%");
				while (rsColumns.next()){
					System.out.println(rsColumns.getString("Column_Name")+ " :" + rsColumns.getString("Type_Name"));
				}
						
				
			}
			
		 }catch(Exception e){
			 e.printStackTrace();
			 
		 }
	}
}
