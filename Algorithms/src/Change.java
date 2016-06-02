
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change(199);

	}

	public static void change(int x){
		int amount =x;
		int quarters = 0, dimes = 0 , nickels = 0;
		while (x > 25){
			quarters=x/25;
			x= x - quarters * 25;
		}
		while (x>10){
			dimes=x/10;
			x = x - dimes * 10;

		}
		while (x > 5){
			nickels = x/5;
			x = x - nickels * 5;

		}
		System.out.println( " You Could make "  + quarters + " quarters " +
				dimes + " dimes " + nickels + " nickels and "  + x + " pennies from " + amount + " cents " );
	}
}