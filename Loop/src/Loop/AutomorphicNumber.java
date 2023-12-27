package Loop;
import java.util.Scanner;
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int n=s.nextInt();
		int nc=n;
		int sqr=n*n;
		int d=1;
		while(n>0) {
			d*=10;
			n/=10;
		}
		String res=(sqr%d==nc)?"Automorphic":"not Automorphic";
		System.out.println(res);
	}

}
