
public class MyAccount {
	private double balance;
	
	public static void main ( String args []){
		
		MyAccount ac = new MyAccount ();
	
		try {
			ac.deposit( 100);
		
		System.out.println( " Balance is : " + ac.balance);
	
		ac.withdraw(50);
		System.out.println(" Balance is : " + ac.balance);
		ac.withdraw(70);
		System.out.println(" Balance is : " + ac.balance);
		}
		catch (NegativeAmountException na){
			na.printStackTrace();
		}
	
	
	}
	public void deposit (double amt) throws NegativeAmountException {
		if (amt <0){
			throw new NegativeAmountException();
		}
		balance +=amt;
		
	}
	public void withdraw (double amt)  {
		
		try {
			if (amt > balance){
			throw new BalanceNotEnoughException();
		}
		}catch (BalanceNotEnoughException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		balance -=amt;
		
	}

}
