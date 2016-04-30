package repo_java;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMultiples som = new SumOfMultiples();
		som.sumOfMultiples(1000);
	}
		public int sumOfMultiples(int n){
			int sum=0;
			for (int i=0; i<n ; i++){
				
				if (i%3==0 || i%5==0){
					
					sum=sum+i;
					
				}
			}
			System.out.println(" the sum is " + sum);
			return sum; 
			
		}
}
