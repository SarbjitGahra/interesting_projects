import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ListBooks {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName="may_15";
		String userName="root";
		String password ="";
		
		try (Connection conn =  DriverManager.getConnection(url + dbName , userName , password);
				Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_UPDATABLE);
				// concur read only . you cant update the record from result set. 
				ResultSet resultSet =	statement.executeQuery("Select * from books");
				
				
				)
		{
			
			
			Class.forName(driver).newInstance();// this is only for 1.7 and below
			

			
			int i =0;
			String title = null;
			String author = null;
			float price = 0.0f;
			Date d = null;
			while (resultSet.next()){
				
				i=resultSet.getInt("bookId");
				title = resultSet.getString("bookTitle");
				author = resultSet.getString("bookAuthor");
				price = resultSet.getFloat("bookPrice");
				d = resultSet.getDate("datePub");
				System.out.println( i + " "  +  title  + " "+ author +  " " + price + " " +  d );
				if(i ==4) {
					resultSet.updateFloat("BookPrice" , 4.99f);
					resultSet.updateRow();
				}
				
			}
			System.out.println("    ");
			// if its scroll sensitive then you will get the updated value otherwise you wont.
			//resultSet.absolute(3); // sets the cursor to third line.
		//	resultSet.beforeFirst(); // sets the cursor back to first line.

			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		





	}

}
