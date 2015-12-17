import java.util.Scanner;


public class ExceptionDemo {
 // syntax error is compiling. what is an exception?
	
	// its in java lang package. 
	// you could have try catch block or throw it back to the calling method
	// put the code that might throw an exception in try block and have it followed by a ctach block. soon
	// as an exception occurs the code stops and sends it to the catch code and output it on console.
	
	// Filenotfound is in i/o package.
	// wrapper classes , calss int
	// soon as you encounter first exception the program will throw exceptions and will print the exception.
	// finally will always execute regardless.
	// theres another way 
	public static void main(String[] args) {
		System.out.println(" Program started ...");
		//abc(); // static classes dont need an object of that class they could directly call it.
	try{
		def(); 
	}
	catch (Exception e){
		e.printStackTrace();
	}
		System.out.println(" Program ended  sucessfully");
		
	}
	static void abc(){
	//	int no1= 0;
	//	int no2 = 0;
		String no1= null;
		String no2= null;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Eneter no1 ");
		try { // unchecked exception but something like file not found would be checked exception.
			no1 = scanner.nextLine();
			System.out.print(" Enter no2 ");
			no2 = scanner.nextLine();
			int ans =Integer.parseInt( no1)/Integer.parseInt(no2);
			System.out.println( no1 + " / " + no2 + " = " + ans);
		}
		catch (ArithmeticException e ){
			e.printStackTrace();
			System.out.println( " The denominator cannot be zero");
		}
		catch (NumberFormatException nfe){
			nfe.printStackTrace();
			System.out.println(" You can't enter a string even though its a string input i koe man dont ask lol");
		}
		finally {
			System.out.println( " We are here Finally");
		}
	}
	static void def () throws ArithmeticException , NumberFormatException {
		String no1= null;
		String no2= null;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Eneter no1 ");
	
			no1 = scanner.nextLine();
			System.out.print(" Enter no2 ");
			no2 = scanner.nextLine();
			int ans =Integer.parseInt( no1)/Integer.parseInt(no2);
			System.out.println( ans);
	
		
	}
	
	
}
