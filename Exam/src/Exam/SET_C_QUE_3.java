//ALL STRONG NUMBER WITHIN A RANGE
package Exam;

import java.util.Scanner;

public class SET_C_QUE_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start range ");
		int a=s.nextInt();
		System.out.println("Enter end range ");
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++) {
			int n=i;
			
			int sum=0;
			while(n>0) {
				int d=n%10;
				
				int fact=1;
				for(int j=1;j<=d;j++) {
					fact*=j;
					
				}
				
				sum+=fact;
				
				n/=10;
			}
			if(sum==i)System.out.println(i);
			
			
		}

	}

}
