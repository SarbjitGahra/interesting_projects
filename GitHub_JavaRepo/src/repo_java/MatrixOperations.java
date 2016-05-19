package repo_java;

public class MatrixOperations {
	public static void main (String args[]){
		int m1 [] [] = { {1, 2}, {3, 4}};
		int m2 [] [] =new int [][] {{5,6},{7,8}};
		int m3[][] =  {{0,0},{0,0}};
		display(m1);
		display(m2);
		//add(m1,m2);
		System.out.println("Addition of two matrices");
		display (add(m1,m2));
		System.out.println("subtraction of two matrices");
		display (subtract(m1,m2));
		System.out.println("scalar multiplication of two matrices");
		display(scalarMultiply(m1, 5));
		System.out.println("Multiplication of two matrices");
		display(multiply(m1 ,m2));
		System.out.println(isZeroMatrix(m3));
		
	}//ending main
	

	public static void display (int a[][]){
		for (int i=0; i<a.length;i++){
			System.out.print("\n");
			for(int j=0;j<a.length;j++){
				System.out.print( a[i][j] + "  ");
			}
		}//forloops
		System.out.println();
		System.out.println("-----------");
	}//displaymethod
	public static int [][] add (int [][] a, int [][]b){
		if (a.length != b.length){
			System.exit(0);
		}//if
		int size = a.length;
		int c[][] = new int [size][size];
		for (int i =0;i<size; i++){
			for (int j =0;j<size; j++){
				c[i][j]=a[i][j]+ b[i][j];
			}
		}//forloops
		
		
		return c;
	}//addmethod
	public static int [][] subtract (int [][] a, int [][]b){
		if (a.length != b.length){
			System.exit(0);
		}//if
		int size = a.length;
		int c[][] = new int [size][size];
		for (int i =0;i<size; i++){
			for (int j =0;j<size; j++){
				c[i][j]=a[i][j] - b[i][j];
			}
		}//for
		
		
		return c;
	}//subtract method
	public static int [][] scalarMultiply(int a[][],int b){
		int size = a.length;
		int c [][] = new int [size][size];
		for (int i =0;i<size; i++){
			for (int j =0;j<size; j++){
				c [i][j]= b * a[i][j];
			}


		}//forloops
		return c;
	}//scalarmultiplyt
	public static int [][] multiply (int a[][],int b[][]){	
		int size1 =a.length;
		int size2=b[0].length;
		int sum=0;
		int c [][] = new int [size1][size2];
		for (int i =0;i<size1; i++){
			for (int j =0;j<size2; j++){
				for (int k=0;k<size1;k++){
					sum =sum + a[i][k]*b[k][j];
				}
				c[i][j] =sum;
				sum =0;
			}
		}//forloops
		return c;

	}
	public static int determinent(int a[][]){
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				
			}
		}
		
		return 0;
	}
	public static boolean isZeroMatrix(int a[][]){
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j] != 0)return false;				
			}
		}
		return true;
	}

}

