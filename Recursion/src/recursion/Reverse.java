package recursion;
import java.util.Scanner;
public class Reverse {
	
	static int rev(int n,int i) {
		
		if(n<10) return n*i;
		return ((n%10)*i)+rev(n/10,i/10);
	}

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your number for Reverse:");
			int n=s.nextInt();
			int nc=n;
			int i=1;
			while(n>9) {
				i*=10;
				n/=10;
			}
			System.out.println(i);
			n=nc;
			System.out.println(rev(n,i));
	}

}
