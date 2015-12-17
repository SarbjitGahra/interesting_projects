import java.util.HashSet;
import java.util.Iterator;


public class HashsetDemo {
public static void main(String[] args) {
	HashSet <String> hashset = new HashSet <>();
	hashset.add("one");
	hashset.add("two");
	hashset.add("three");
	System.out.println(hashset);
	hashset.add("one");
	System.out.println(hashset);
	Iterator <String> itr = hashset.iterator();
	String str = null;
	while (itr.hasNext()){
		str = itr.next();
		
		if(str.equals("three")){
			break;
		}
		System.out.println( str);
	}
	hashset.remove(" two");
	hashset.add(" twennty");
	
}
}
