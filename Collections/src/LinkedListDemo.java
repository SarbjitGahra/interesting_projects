import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList < String> linkedList = new LinkedList<>();
		linkedList.add(" First ");
		linkedList.add(" Second");
		linkedList.add(" third");
		linkedList.add(" fourth");
		
	//	System.out.println( linkedList.get(1));
		
		Iterator ltr =  linkedList.iterator();
		while ( ltr.hasNext()){
			System.out.println(ltr.next());
		}
		linkedList.set(2, "Three");
		System.out.println( linkedList.get(2));
		
				
	}

	

}
