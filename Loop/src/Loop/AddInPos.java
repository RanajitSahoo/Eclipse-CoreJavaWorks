package Loop;

import java.util.Scanner;

public class AddInPos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum=0;
		String v = "";
		for(int i = a;i<=b;i++) {
			sum +=i;
			v += i;
			if(i<b)v += "+";
			
		}
		System.out.println(v+"="+sum);
	}
}
