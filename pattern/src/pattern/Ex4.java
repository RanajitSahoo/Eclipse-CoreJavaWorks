package pattern;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
					System.out.print(j);
				
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(i);
			}
			for(int j=i-1;j>=1;j--) {
				
				System.out.print(j);
			
			}
			System.out.println();
			
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				
					System.out.print(j);
				
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(i);
			}
			for(int j=i-1;j>=1;j--) {
				
				System.out.print(j);
			
			}
			System.out.println();
			
		}

	}

}
