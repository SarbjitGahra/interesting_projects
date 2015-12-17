
public class TestApp {
	public static void main ( String args []){
		MyGeneric < String > myGen = new MyGeneric <>();
		myGen.setObj(" hello" );
		System.out.println(myGen.getObj());
		myGen.showType();
		
		MyGeneric <Person> myGen1 = new MyGeneric <>();
		myGen1.setObj(person);
	}
}
