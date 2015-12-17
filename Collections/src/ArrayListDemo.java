import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

// its from collection demo.
// generic class is something called as paramterized calss you could pass paramters to it.
// there is a class called collections and package called collection

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> arrylist = new ArrayList<>() ;
		arrylist.add(" one");
		arrylist.add(" two" );
		arrylist.add("  three");
		arrylist.add(2, " two and half");
		System.out.println( " Size "  + arrylist);
		
		// learn four major operations 
		// they are add , retrieve update and delete
		
		// to retrieve
		 String str = arrylist.get(2);
		 arrylist.set(2, " twenty");
		 arrylist.remove(" one");
		 for( int i = 0; i < arrylist.size(); i ++){
			 System.out.println(arrylist.get(i));
			 
		 }
		 for (String string : arrylist) {
			 System.out.println(string);
			
		}
		 System.out.println( "---- using iterators----");
	Iterator <String> iterator =	 arrylist.iterator();
	while (iterator.hasNext()){
		System.out.println(iterator.next());
	}
ListIterator <String> li =	arrylist.listIterator(arrylist.size());
	 while ( li.hasPrevious()){
		 System.out.println(li.previous());
	 }
	 System.out.println("---- using lambda expression---");
	 arrylist.forEach(str1 -> System.out.println( str1));
	 System.out.println(" after sorting -----"); // to sort we have a method in collections class. pass thel ist to it.
	 // practise all the linked list and vector by yourself.
	 Collections.sort(arrylist);
	 arrylist.forEach(str1 -> System.out.println(str1));
	 
	 
	 // how to search a value.
	 int found = Collections.binarySearch(arrylist, "twenty");
	 if(found>=0){
		 System.out.println ( " found at : "+ found);
	 }else 
		 System.out.println( " not found ");
	 
	 // Set interface Hashset , linked hashset, tree set
	 
	 
	 
		 
	}
	
	
	

}
