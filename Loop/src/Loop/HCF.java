package Loop;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		
		System.out.println("Enter two number");
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int n = a<b?a:b;
		while(true) {
			if(a%n==0 &&b%n==0)break;
			n--;
		}
		System.out.println(n);
	}

}
