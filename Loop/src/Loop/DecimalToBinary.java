package Loop;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter your number");
		int n=s.nextInt();
		int res=0;
		int i=1;
		while(n>0) {
			int r=n%2;
			res=res+r*i;
			i*=10;
			n/=2;
			
		}
		System.out.println(res);
	}

}
