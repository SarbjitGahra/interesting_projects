
public class BalanceNotEnoughException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public BalanceNotEnoughException(){
		msg = " You can't have a negative balance";
		
	}

}
