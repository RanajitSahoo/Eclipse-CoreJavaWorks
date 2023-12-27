package Loop;

import java.util.Scanner;

public class PerfectMethod {

	public static void main(String[] args) {
		System.out.println("Enter the value of a and b");
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		for(int i=a;i<=b;i++) {
			if(isPerfect(i)==1)System.out.println(i);
		}
		
	}
	
	public static int isPerfect(int num) {
		int n =num ;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)sum+=i;
		}
		if(num==sum)return 1;
		else return 0;
	}

}
