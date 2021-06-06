import java.util.*;


class Practice1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to which you wnt to find the multiplication of odd numbers");
		int mul = s.nextInt();
		System.out.println("Enter the number to which you want to find the sum of the numbers");
		int sum = s.nextInt();
		int m =1;
		int n=0;
		for(int i=0;i<mul;i++){
			if( i % 2 != 0 ){	
				m = m*i;
			}
		}
		for( int i=0;i<=sum;i++){
			if(i%2==0){
				n = n+i;
			}
		}
		System.out.println("Multiplication of odd numbers from 1 to "+ mul+ " is "+m);
		System.out.println("Sum of even numbers from 1 to "+ sum+ " is "+n);
		
	}
}
