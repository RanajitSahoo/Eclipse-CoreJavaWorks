package Loop;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}

}
