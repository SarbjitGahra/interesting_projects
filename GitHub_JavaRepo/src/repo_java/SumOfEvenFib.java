package repo_java;

public class SumOfEvenFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sumOfEvenFib(10);
		System.out.println(" The sum of even fib numbers " + n);
	}
	public static int sumOfEvenFib(int n ){
		if(n <=1) return 1;
		int fib = 1;
		int sum = 0;
		int	previous =1 ;
		for(int i=2;i< n ; ++i){
			int temp =fib; 
			fib=fib + previous;
			previous = temp;
			 System.out.println(" " + fib + " previous " +previous + " temp " + temp) ;
			 if(fib%2==0){
				 sum+=fib;
			 }
		}
		return  sum;
	}
}
