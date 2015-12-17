import java.util.Scanner;


public class ExceptionDemo2 {
	// unchecked exception you would implement exception
	// checked exception is runtime exception.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Program started ....");
		try {
			abc();
		} catch (OddNumberPlayersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( " Program ended Sucessfully");
		

	}
	 static void abc () throws OddNumberPlayersException{
		 int players = 0;
		 Scanner scanner = new Scanner ( System.in);
		 System.out.println( " No of players");
		 players = scanner.nextInt();
		 if( players % 2 ==1 )
			 throw new OddNumberPlayersException();
		 System.out.println( " You could play now " + players);
		 
		
	}

}
