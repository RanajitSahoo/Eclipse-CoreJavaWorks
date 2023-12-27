//DECIMAL TO BINARY
package Exam;

import java.util.Scanner;

public class SET_C_QUE_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a NUMBER ");
		int n=s.nextInt();
		int sum=0;
		int i=1;
		while(n>0) {
			int rem=n%2;
			 sum=sum+rem*i;
			 i*=10;
			 n/=2;
			
		}
		System.out.println(sum);
		

	}

}
