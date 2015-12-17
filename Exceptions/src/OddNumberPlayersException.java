
public class OddNumberPlayersException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String msg;
	
	public OddNumberPlayersException (){
		msg= " OddNumberPlayerException .. Only even number of players";
	}
	public String toString (){
		return msg;
	}

}
