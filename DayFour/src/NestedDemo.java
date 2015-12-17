
public class NestedDemo { // NestedDemo.class

	
		private int i = 200;
		private static int j = 200;
		
		
		static class MyNested{ //NestedDemo$MyNested.class
			public static void main ( String [] args ){
				System.out.println( " My Nested class main");
			}
			private int a = 10;
			private static int b = 20 ;
			static void  staticMethod(){
				
			}
			
			
			
		}
		public static void main (String []args){
			MyNested  nested = new MyNested();
			
		}
	
}
