package Loop;
import java.util.Scanner;
public class AddEvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int sumE=0,sumO=0;
		
		while(n>0)
		{
			int d = n%10;
			if(d%2==0) sumE+=d;
			else sumO+=d;
			n/=10;
			
		}
		System.out.println("sum of Even digits = "+sumE);
		System.out.println("sum of Odd digits = "+sumO);

	}

}
