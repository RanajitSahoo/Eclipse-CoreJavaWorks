package pattern;

import java.util.Scanner;
public class PatternNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				for(int j=n*i-n+1;j<=n*i;j++) {
					System.out.print(j+" ");
				}
			}
			if(i%2==0) {
				for(int j=n*i;j>=n*i-n+1;j--) {
					System.out.print(j+" ");

				}
			}
			
			System.out.println();
		}
	}

}
