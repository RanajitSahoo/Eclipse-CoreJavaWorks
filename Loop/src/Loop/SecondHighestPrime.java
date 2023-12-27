package Loop;

import java.util.Scanner;

public class SecondHighestPrime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start range-> ");
		int a = s.nextInt();
		System.out.println("Enter the end range-> ");
		int b = s.nextInt();
		int max=0;
		
		int res=0;
		for(int i=a==1?2:a;i<=b;i++) 
		{
			
			boolean prime=true;
			
			for(int j=2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
					prime=false;
				}
			}
			int secMax=max;
			if(prime)
			{
				max=i;
				if(max>secMax) {
					
					if(secMax>res) {
						res=secMax;
					}
					
				}
				
				
			}
		}
		System.out.println("the  highest prime number from "+a+" to "+b+" is "+max);
		
		System.out.println("the 2nd highest prime number from "+a+" to "+b+" is "+res);
		
		
		
		
		
	}
}
