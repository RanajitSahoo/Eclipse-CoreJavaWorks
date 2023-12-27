package Loop;
import java.util.Scanner;
public class PerfectNumRange {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value for a and b--> ");
		int a = s.nextInt();
		int b = s.nextInt();
		for(int i=a;i<=b;i++) {
			int n = i;
			int sum=0;
			for(int j=n/2;j>=1;j--) {
				if(n%j==0)sum+=j;
			}
			if(n==sum) System.out.println(i);
		}

	}

}
