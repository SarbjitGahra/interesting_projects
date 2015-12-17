import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	public static void main(String[] args) {
		HashMap <String, Integer> hashmap = new HashMap<>();
		hashmap.put("one", 1);// autoboxing , convert a primitive value automatically to an object
		hashmap.put("two", 2);
		hashmap.put("three", 3);
		hashmap.put("null", 0);
		System.out.println(hashmap);
		int k = hashmap.get("two");
		System.out.println(k);
		hashmap.put("two", 20);
		System.out.println(hashmap);
		hashmap.remove(null);
		System.out.println(hashmap);
		Set <String> set = hashmap.keySet();
		Iterator <String> itr = set.iterator();
		
		for (String string : set) {
			System.out.println( " with for each loop" + hashmap.get(string));
			
		}
		String  s = null ;
		
		while (itr.hasNext()){
			System.out.println( hashmap.get(s));
			// entry set
			
		}
		Set <Entry <String , Integer >> entry = hashmap.entrySet();
		 for (Entry<String, Integer> entry2 : entry) {
			 System.out.println( entry.getKey() + entry.getValue());
			
		}
		
				
	}

}
