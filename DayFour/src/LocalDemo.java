
public class LocalDemo {
	private int i = 100;
	private static int j = 200;
	
	void abc (){ // this local class could access the variables and methods of outer class but outer class cannot access 
		// anything from it. you could only declare this class abstract and defualt nothing else.
		 int k = 500; // you cant declare a private variable here.
		class Local{ // LocalDemo$1Local.class
			private int a = 10 ; // static members are not allowed they are only allowed in static class. 
			 void localMethod(){
				 System.out.println( "i = " + i);
				 System.out.println( " a  = " + a);
				 System.out.println( " k  =" + k);
			 }
			
			
		}
		Local local = new Local();
		local.localMethod();
	}
	
	public static void main ( String []args){
	LocalDemo demo = new LocalDemo();	
	}

}
