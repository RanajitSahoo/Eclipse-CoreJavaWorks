package Loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int nc = n;
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		 n=nc;
		 int sum=0;
		 while(n>0) {
			 int d = n%10;
			 int prd =1;
			 for(int i =1;i<=c;i++) {
				 prd*=d;
			 }
			 sum +=prd;
			 n/=10;
		 }
		 if(sum==nc)System.out.println(nc+" is a Armstrong number");
		 else System.out.println(nc+" is not a Armstrong number");
		

	}

}
