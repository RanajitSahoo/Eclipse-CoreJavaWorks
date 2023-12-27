package Loop;

import java.util.Scanner;

public class AlterPrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start range-> ");
		int a = s.nextInt();
		System.out.println("Enter the end range-> ");
		int b = s.nextInt();
		int c=0;
		boolean check=true;
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
			
			if(prime)
			{
				if(check)
					{
						System.out.print(i+" ");
						check=false;
					}
				
				else
					check=true;
			}
			
		}
		

	}

}
