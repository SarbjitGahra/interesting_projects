import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GenericMethod {

	public static void main(String[] args) {
		//Random random = new Random();
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(21);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(" print method test");
		print(al);
		System.out.println(" the max number is " + findMax (al , 0 ,5));
		
		for(int i = 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		swap(al , 1,2);
		System.out.println(" The new swapped List");
		for(int j = 0; j<al.size();j++){
			System.out.println(al.get(j));
		}
		
	}
	@SuppressWarnings({ "hiding", "unchecked" })
	public static <E> void swap (List <E> l, int index1 , int index2){
		Object  temp;
		temp =  l.get(index1);
		l.set(index1, l.get(index2));
		l.set(index2, (E) temp);
	
		
		}
	public static <E> int specialMembers (List<E>l){
		int count = 0;
		
		for (int i = 0; i < l.size(); i++) {
			if( (Integer)(l.get(i))%2 ==1){
				count++;
			}
		//	else if( (Integer)(l.get(i)))
		}
		
		return 0;
		
	}
	public static void print(List<? extends Number> list) {
	    for (Number n : list)
	        System.out.print(n + " ");
	    System.out.println();
	}
	public static int findMax( List< ? extends Number>list, int begin , int end){
		int max = 0;
		max =(int) list.get(begin);
		
		
		for (int i = begin; i <end; i++) {
			
			if((int)list.get(i)> max){
				max = (int)list.get(i);
			}
			
			
		}
		return max;
	}

	
}
