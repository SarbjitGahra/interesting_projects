import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class InsertBook {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName="may_15";
		String userName="root";
		String password ="";
		
		
		int i =0;
		String title = null;
		String author = null;
		float price = 0.0f;
		Date d = null;
		try(
				//Scanner scanner = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Connection conn =  DriverManager.getConnection(url + dbName , userName , password);
				Statement statement = conn.createStatement();
				
				
				
				){
			System.out.println(" enter a book id");
			i = Integer.parseInt(br.readLine());
			System.out.println(" enter a booktitle");
			
			title = br.readLine();
			System.out.println(" enter a book author");
			author = br.readLine();
			System.out.println(" enter a book price");
			price = Float.parseFloat(br.readLine());
			System.out.println(" enter a date pub :");
			String str = br.readLine();
			DateFormat df =  new SimpleDateFormat("MM/dd/YYYY");
			d = df.parse(str);
			java.sql.Date sqlDate = new java.sql.Date(d.getTime());
		int k =	statement.executeUpdate("insert into books values('"+i+"' ,'"+title+"','"+author+" ','"+price+"','"+sqlDate+" ')");
		
			if(k ==1){
				System.out.println(" program sucessfully updates");
			}
			
			
			
		}
	catch (Exception e){
		e.printStackTrace();
	}
}
}
