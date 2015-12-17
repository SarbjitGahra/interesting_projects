
public class NegativeAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public NegativeAmountException(){
		msg = " You can't enter a negative amount";
	}
	

}
