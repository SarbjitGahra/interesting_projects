
public class InnerDemo {

	private int i = 100;
	private static int j = 200;
	
	// static is not allowed rest everything is okay
	
	class MyInner{ // static members are not allowed in inner classes
		private int a = 20;
		private int i = 40;
		
		void innerMethod( ){ // it could access the static memebers of outer class but you cant declare anything static in the class.
			
			System.out.println( "i"  + i);
			System.out.println ( " j " + j);
			System.out.println (  " a" + a);
		}
		
	}
	public static void main (String [] args){
	//	InnerDemo demo = new InnerDemo();//  you need an object of outerclass and than wrap the inner class with it.
	//	MyInner inner = demo.new MyInner();
		MyInner inner = new InnerDemo().new MyInner(); // if you dont want to create an object of outer class.
		 // you could access the variables and the methods.
		// in ddriver class yoou could not call any private members of the class but you could call the methods also you cant 
		// create a main class becuase its not static.
	}
}
